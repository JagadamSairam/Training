import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StockPrice } from 'src/modals/stockprice';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StockpriceService {
  httpUrl = environment.port+'stock-price-service/stockPrice/';

  constructor(private httpClient : HttpClient,@Inject(HttpClient) private ht) { }
  getAllStockPrices() : Observable<StockPrice[]>{
    return this.httpClient.get<StockPrice[]>(this.httpUrl);
 
  }

  saveStockPrice(stockprice : StockPrice):Observable<StockPrice>{
    return this.httpClient.post<StockPrice>(this.httpUrl,stockprice);
  }
  deleteStockPrice(id : number):Observable<StockPrice> {
    return this.httpClient.delete<StockPrice>(this.httpUrl+id)
      }
      update(stockprice : StockPrice) :Observable<StockPrice>{
        return this.ht.put(this.httpUrl , stockprice);
      }
      getStockPriceById(id:number) : Observable<StockPrice>{
        return this.ht.get(this.httpUrl + id);
      }
    
   
      isAdmin() : boolean{
        return true;
      }
}
