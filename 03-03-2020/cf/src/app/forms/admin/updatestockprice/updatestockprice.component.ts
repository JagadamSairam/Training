import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StockpriceService } from 'src/app/services/stockprice.service';
import { StockPrice } from 'src/modals/stockprice';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatestockprice',
  templateUrl: './updatestockprice.component.html',
  styleUrls: ['./updatestockprice.component.css']
})
export class UpdatestockpriceComponent implements OnInit {

  updateStockPrice : FormGroup
  constructor(private formBuilder : FormBuilder, private stockPriceService : StockpriceService, private router : Router) { }


  ngOnInit() {
    this.updateStockPrice = this.formBuilder.group({
      id : ['',Validators.required],
      companyCode: ['',Validators.required],
      stockExchange : ['',Validators.required],
      currentPrice: ['',Validators.required],
      date :  ['',Validators.required],
      time : ['',Validators.required]
    });
    const id = localStorage.getItem('stockID');
    if(+id>0){
      this.stockPriceService.getStockPriceById(+id).subscribe(stock => {
        this.updateStockPrice.patchValue(stock);
      });
  }
}
  update(stock:StockPrice){
    this.stockPriceService.update(this.updateStockPrice.value).subscribe( u =>{
      this.router.navigate(['stockpricelist']);
    })
  }
}
