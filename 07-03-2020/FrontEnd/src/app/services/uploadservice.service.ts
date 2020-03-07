import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { StockPrice } from 'src/modals/stockprice';

@Injectable({
  providedIn: 'root'
})
export class UploadserviceService {
httpUrl ='http://localhost:9999/stockPrices/';
  constructor(private httpClient : HttpClient) { }
  uploadStocksSheet(formData : FormData):Observable<object>{
    return this.httpClient.post<object>(this.httpUrl+"uploadStocksSheet",formData)
  }


// getAllStockPrices():Observable<StockPrice[]>{
//   return this.httpClient.get<StockPrice[]>(this.httpUrl);
// }

}
