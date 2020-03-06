import { Component, OnInit } from '@angular/core';
import { StockExchange } from 'src/modals/stockexchange';
import { StockexchangeService } from 'src/app/services/stockexchange.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-stocklist',
  templateUrl: './stocklist.component.html',
  styleUrls: ['./stocklist.component.css']
})
export class StocklistComponent implements OnInit {

  stocks : StockExchange[];
  constructor(private stockService : StockexchangeService,private router : Router) { }

  ngOnInit() {
    this.stockService.getAllStocks().subscribe(data => {
      this.stocks=data;
    });
  }
  delete(stock:StockExchange){
    this.stockService.deleteStock(stock.id).subscribe();
    this.stocks=this.stocks.filter(c=> c !== stock)
  }

  update(stock:StockExchange){

    localStorage.removeItem("stockID");
    localStorage.setItem("stockID",stock.id.toString());
    this.router.navigate(['updatestockexchange']);
    
  }
}