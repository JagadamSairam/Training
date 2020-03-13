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
    compareCompany:FormGroup;
    company:Company[];
    constructor(private formBuilder:FormBuilder,private router:Router, private companyService:AddcompanyService) { }
    ngOnInit() {
      this.compareCompany=this.formBuilder.group({
        selectcomorsec: ['',Validators.required],
        stockExchange: ['',Validators.required],
        companysectorname: ['',Validators.required],
        companyorsector: ['',Validators.required],
        fromperiod: ['',Validators.required],
        toperiod: ['',Validators.required],
       });
       this.companyService.getAllCompanies().subscribe(data=>{
        this.company=data;
      });
    }
    onSubmit() {
      this.router.navigate(["./charts"],{
        queryParams:{
          formData: JSON.stringify(this.compareCompany.value)
        }
      });
    }
    // getAllCompanies(){
    //   this.companyService.getAllCompanies().subscribe(data=>{
    //     this.companies=data;
    //   })
    // }
  }