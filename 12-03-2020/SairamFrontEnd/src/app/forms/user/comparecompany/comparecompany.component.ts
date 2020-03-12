import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators, FormArray } from '@angular/forms';
import { CompareserviceService } from 'src/app/services/compareservice.service';
import { Router } from '@angular/router';
import { Company } from 'src/modals/addcompany';
import { Observable } from 'rxjs';
import { StockexchangeService } from 'src/app/services/stockexchange.service';
import { AddcompanyService } from 'src/app/services/addcompany.service';
import { StockPrice } from 'src/modals/stockprice';
import { StockExchange } from 'src/modals/stockexchange';

@Component({
  selector: 'app-comparecompany',
  templateUrl: './comparecompany.component.html',
  styleUrls: ['./comparecompany.component.css']
})
export class ComparecompanyComponent implements OnInit {
// compare:FormGroup
//   constructor(private service:CompareserviceService, private formBuilder:FormBuilder, private router:Router) { }
//   company : Company[];
//   options: string[];
//   i:number;

//   myControl = new FormControl();
//   filteredOptions: Observable<string[]>;
//   compareCompany(){
//     localStorage.removeItem("c1");
//     localStorage.removeItem("c2");
//     localStorage.setItem("c1",this.compare.value['c1']);
//     localStorage.setItem("c2",this.compare.value['c2']);
//     this.router.navigate(['/chart'])
//     this.router.navigate(['/charts'],{
//       queryParams:{
//         formData : JSON.stringify(this.compare.value)
//       }
//     });
//   }
//   ngOnInit() {
//     this.service.getAllCompany().subscribe(data =>{
//       this.company=data;
//     });
//     this.compare = this.formBuilder.group({
//       c1:[''],
//       c2:['']
//   });

//   this.compare.valueChanges.subscribe(result=>console.log(result));


// }
// onSubmit(){
  
// }



companyCompareForm: FormGroup;

sectorCompareForm: FormGroup;

// faPlus = faPlus;



companies:Company[][]=[];

stockExchanges: StockExchange[];



companyComparision: boolean = false;

sectorComparision: boolean = false;

canAddAnther: boolean = true;



maxDate: string = (new Date()).toISOString().split("T")[0];

minDate: string = (new Date(2016,1,1)).toISOString().split("T")[0];



constructor(

    private formBuilder: FormBuilder,

    private stockExService: StockexchangeService,

    private companiesService: AddcompanyService,

    private stockPriceService: StockPrice,

    private router: Router

) { }



ngOnInit() {

    this.companies[0]=[];

    this.companies[1]=[];

    this.companyCompareForm = this.formBuilder.group({

        companies: this.formBuilder.array([

            this.formBuilder.group({

                stockExchange: ["", Validators.required],

                companyCode: ["", Validators.required]

            })

        ]),

        periods: this.formBuilder.array([

            this.formBuilder.group({

                fromDate: ["", Validators.required],

                toDate: ["", Validators.required]

            })

        ]),

        periodicity: ["",Validators.required]

    })



    // this.stockExService.getAllExchanges().subscribe(data => {

    //     this.stockExchanges = data;

    // });

}



enableSelection(e) {

    if (e.target.value == "company") {

        this.companyComparision = true;

        this.sectorComparision = false;

    }

    if (e.target.value == "sector") {

        this.companyComparision = false;

        this.sectorComparision = true;

    }



}



onAddSecondCompany() {

    const group =  this.formBuilder.group({

        stockExchange: ["", Validators.required],

        companyCode: ["", Validators.required]

    });

    (<FormArray>this.companyCompareForm.get('companies')).push(group);

    this.canAddAnther = false;

}



onAddSecondPeriod() {

    const group = this.formBuilder.group({

        fromDate: ["", Validators.required],

        toDate: ["", Validators.required]

    });

    (<FormArray>this.companyCompareForm.get('periods')).push(group);

    this.canAddAnther = false;

}

onSubmit() {

  this.router.navigate(['/result'],{queryParams : {formData: JSON.stringify(this.companyCompareForm.value)} });

}

}

// onStockExchangeSelect(e, i:number) {

//     this.companiesService.getCompaniesByStockExchange(e.target.value).subscribe(data => {

//         this.companies[i] = data;

//     });





// getCompanyCode(company: Company, i: number): string {

//     for (let listedIn of company.listedIn) {

//         if (listedIn.stockExchangeName == (<FormArray>this.companyCompareForm.get('companies')).at(i).get("stockExchange").value) {

//             return listedIn.stockCode;

//         }

//     }

// }



// onGetMinMaxDates(e,i){

//     let companyCode = e.target.value;

//     let stockExchange = (<FormArray>this.companyCompareForm.get('companies')).get(i).get("stockExchange");

//     this.stockPriceService.getMinDate(companyCode,stockExchange).subscribe(data => {

//         this.minDate = data;

//     })

//     this.stockPriceService.getMaxDate(companyCode,stockExchange).subscribe(data => {

//         this.maxDate = data;

//     });

// }





