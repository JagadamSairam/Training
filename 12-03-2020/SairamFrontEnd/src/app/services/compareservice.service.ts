import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Company } from 'src/modals/addcompany';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CompareserviceService {
private httpUrl = environment.port + 'company-service/company/';
  constructor(private httpClient : HttpClient) { }
  getAllCompany():Observable<Company[]>{
    return this.httpClient.get<Company[]>(this.httpUrl);
  }
}
