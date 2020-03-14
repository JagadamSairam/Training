import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { StockPrice } from 'src/modals/stockprice';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UploadserviceService {
httpUrl =environment.port+'stock-price-service/stockPrice/';
  constructor(private httpClient : HttpClient) { }
  uploadStocksSheet(formData : FormData):Observable<object>{
    return this.httpClient.post<object>(this.httpUrl+"uploadStocksSheet",formData)
  }
  getCompanyStockPricesBetween(companyCode: string, stockExchange: string, startDate: Date, endDate: Date): Observable<any[]> {
    let url = "companyStockPriceBetween/"+companyCode+"/"+stockExchange+"/"+startDate+"/"+endDate;
    return this.httpClient.get<any[]>(this.httpUrl+url);
  }

// getAllStockPrices():Observable<StockPrice[]>{
//   return this.httpClient.get<StockPrice[]>(this.httpUrl);
// }

}
