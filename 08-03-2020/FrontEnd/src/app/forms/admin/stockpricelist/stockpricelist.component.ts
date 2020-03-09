import { Component, OnInit } from '@angular/core';
import { StockPrice } from 'src/modals/stockprice';
import { StockpriceService } from 'src/app/services/stockprice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-stockpricelist',
  templateUrl: './stockpricelist.component.html',
  styleUrls: ['./stockpricelist.component.css']
})
export class StockpricelistComponent implements OnInit {
stocks : StockPrice[];
  constructor(private router : Router,private stockService : StockpriceService) { }

  ngOnInit() {
    this.stockService.getAllStockPrices().subscribe(data => {
      this.stocks=data;
    });
    
  }
  delete(stock:StockPrice){
    this.stockService.deleteStockPrice(stock.id).subscribe();
    this.stocks=this.stocks.filter(c=> c !== stock)
  }

  update(stock:StockPrice){

    localStorage.removeItem("stockID");
    localStorage.setItem("stockID",stock.id.toString());
    this.router.navigate(['updatestockprice']);
    
  }
}