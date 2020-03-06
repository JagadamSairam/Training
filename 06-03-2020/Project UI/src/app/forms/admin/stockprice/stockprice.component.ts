import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StockpriceService } from 'src/app/services/stockprice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-stockprice',
  templateUrl: './stockprice.component.html',
  styleUrls: ['./stockprice.component.css']
})
export class StockpriceComponent implements OnInit {
stockPrice : FormGroup
  constructor(private formBuilder : FormBuilder, private stockPriceService : StockpriceService,private router : Router) { }


  ngOnInit() {
    const cid = localStorage.getItem('companyId');

    this.stockPrice = this.formBuilder.group({
      id : [+cid],
      companyCode: ['',Validators.required],
      stockExchange : ['',Validators.required],
      currentPrice: ['',Validators.required],
      date :  ['',Validators.required],
      time : ['',Validators.required]
    });

  
  }
  submit(){
    this.stockPriceService.saveStockPrice(this.stockPrice.value).subscribe(data=>{
      console.log("StockPrice  Details are Entered Success fully");
      this.router.navigate(['stockpricelist']);

      alert("Successfully Entered New StockPrice");
    
    });

}
}
