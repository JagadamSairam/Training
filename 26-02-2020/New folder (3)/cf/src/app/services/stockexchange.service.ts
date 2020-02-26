import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StockExchange } from 'src/modals/stockexchange';

@Injectable({
  providedIn: 'root'
})
export class StockexchangeService {

  httpUrl = 'http://localhost:8080/stockExchange/';

  constructor(private httpClient : HttpClient,@Inject(HttpClient) private ht) { }


    getAllStocks() : Observable<StockExchange[]>{
      return this.httpClient.get<StockExchange[]>(this.httpUrl);
   
    }

    saveStock(stock : StockExchange):Observable<StockExchange>{
      return this.httpClient.post<StockExchange>(this.httpUrl,stock);
    }
    deleteStock(id : number):Observable<StockExchange> {
      return this.httpClient.delete<StockExchange>(this.httpUrl+id)
        }
        update(stock : StockExchange) :Observable<StockExchange>{
          return this.ht.put("http://localhost:8080/stockExchange/",stock);
        }
        getStockById(id:number) : Observable<StockExchange>{
          return this.ht.get(`http://localhost:8080/stockExchange/${id}`);
        }
        isAdmin() : boolean{
          return true;
        }
}