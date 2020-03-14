import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StockExchange } from 'src/modals/stockexchange';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StockexchangeService {
  httpUrl = environment.port + 'stock-exchange-service/stockExchange/';

  // httpUrl = 'http://localhost:8880/stockExchange/';

  constructor(private httpClient: HttpClient, @Inject(HttpClient) private ht) { }


  getAllStocks(): Observable<StockExchange[]> {
    return this.httpClient.get<StockExchange[]>(this.httpUrl);

  }

  saveStock(stock: StockExchange): Observable<StockExchange> {
    return this.ht.post(this.httpUrl, stock);
  }
  deleteStock(id: number): Observable<StockExchange> {
    return this.ht.delete(this.httpUrl + id)
  }
  update(stock: StockExchange): Observable<StockExchange> {
    return this.ht.put(this.httpUrl, stock);
  }
  getStockById(id: number): Observable<StockExchange> {
    return this.ht.get(this.httpUrl + id);
  }
  isAdmin(): boolean {
    return true;
  }
}