import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { StockexchangeService } from 'src/app/services/stockexchange.service';
import { StockExchange } from 'src/modals/stockexchange';

@Component({
  selector: 'app-stockexchange',
  templateUrl: './stockexchange.component.html',
  styleUrls: ['./stockexchange.component.css']
})
export class StockexchangeComponent implements OnInit {
registerStock: FormGroup
  constructor(private formBuilder :FormBuilder,private stockService : StockexchangeService) { }

  ngOnInit() {
    this.registerStock = this.formBuilder.group({
      id : ['',Validators.required],
      exchangeName: ['',Validators.required],
      contactAddress : ['',Validators.required],
      brief: ['',Validators.required]
     
    });
   

}
  submit(){
    this.stockService.saveStock(this.registerStock.value).subscribe(data=>{
      console.log(this.registerStock.value);
      console.log("Details are Entered Success fully");
      alert("Successfully Entered New record");
   
    });
   }
  }
