import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StockexchangeService {
httpUrl:'http://localhost:3333/stockexchange/'
constructor(private httpClient : HttpClient) { }


}
