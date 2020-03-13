import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import {Companies} from '../../modals/addcompany-mock';
import { Observable } from 'rxjs';
import { Company } from 'src/modals/addcompany';
import { User } from 'src/modals/user';
import { StockPrice } from 'src/modals/stockprice';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class AddcompanyService {

  httpUrl = environment.port + 'company-service/company/';
  // httpUrl = `http://localhost:9000/company/`;
  httpUrl1 = environment.port + 'company-service/registerUserByCompany/' ;
  httpUrl2 = environment.port +'company-service/stockPricesByCompanies/';


    constructor(private httpClient : HttpClient,@Inject(HttpClient) private ht) { }

    company = Company;

      getAllCompanies() : Observable<Company[]>{
        return this.httpClient.get<Company[]>(this.httpUrl);
     
      }
      getAllStockPrices() : Observable<StockPrice[]>{
        return this.httpClient.get<StockPrice[]>(this.httpUrl2);
     
      }

      saveCompany(com : Company){
        return this.ht.post(this.httpUrl,com);
      }
      deleteCompany(id : number):Observable<Company> {
        return this.ht.delete(this.httpUrl + id)
          }
          update(company : Company) :Observable<Company>{
            return this.ht.put(this.httpUrl,company);
          }
          getCompanyById(id:number) : Observable<Company>{
            return this.ht.get(this.httpUrl+id);
          }
          getUserById(id : number) : Observable<User>{
            return this.ht.get(this.httpUrl1+id);
          }
          isAdmin() : boolean{
            return true;
          }

}
