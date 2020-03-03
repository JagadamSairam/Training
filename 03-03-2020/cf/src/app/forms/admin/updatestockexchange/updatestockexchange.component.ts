import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';
import { StockexchangeService } from 'src/app/services/stockexchange.service';
import { StockExchange } from 'src/modals/stockexchange';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatestockexchange',
  templateUrl: './updatestockexchange.component.html',
  styleUrls: ['./updatestockexchange.component.css']
})
export class UpdatestockexchangeComponent implements OnInit {

  updateStock: FormGroup
  constructor(private formBuilder :FormBuilder,private stockService : StockexchangeService,private router : Router) { }

  ngOnInit() {
    this.updateStock = this.formBuilder.group({
      id : ['',Validators.required],
      exchangeName: ['',Validators.required],
      contactAddress : ['',Validators.required],
      brief: ['',Validators.required]
    });
    const id = localStorage.getItem('stockID');
    if(+id>0){
      this.stockService.getStockById(+id).subscribe(stock => {
        this.updateStock.patchValue(stock);
      });
}
}
update(stock:StockExchange){
this.stockService.update(this.updateStock.value).subscribe( u =>{
  this.router.navigate(['stocklist']);
  
})
}

}

