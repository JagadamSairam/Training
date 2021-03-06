import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Companies} from '../../modals/addcompany-mock';
import { Observable } from 'rxjs';
import { Company } from 'src/modals/addcompany';
import { User } from 'src/modals/user';
@Injectable({
  providedIn: 'root'
})
export class AddcompanyService {
  httpUrl = `http://localhost:9000/company/`;
  httpUrl1 = `http://localhost:9000/registerUserByCompany/`;

    constructor(private httpClient : HttpClient,@Inject(HttpClient) private ht) { }

    company = Companies;

      getAllCompanies() : Observable<Company[]>{
        return this.httpClient.get<Company[]>(this.httpUrl);
     
      }

      saveCompany(com : Company){
        return this.ht.post(this.httpUrl,com);
      }
      deleteCompany(id : number):Observable<Company> {
        return this.ht.delete(`http://localhost:9000/company/${id}`)
          }
          update(company : Company) :Observable<Company>{
            return this.ht.put(`http://localhost:9000/company/`,company);
          }
          getCompanyById(id:number) : Observable<Company>{
            return this.ht.get(`http://localhost:9000/company/${id}`);
          }
          getUserById(id : number) : Observable<User>{
            return this.ht.get(this.httpUrl1+id);
          }
          isAdmin() : boolean{
            return true;
          }

}
