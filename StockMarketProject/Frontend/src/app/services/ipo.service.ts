import { Injectable, Inject } from '@angular/core';
import { Observable } from 'rxjs';
import { IPO } from 'src/modals/Ipo';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class IpoService {

  httpUrl = environment.port + 'initial-public-offering-service/ipo/';
  // httpUrl = 'http://localhost:8800/ipo/';

  constructor(private httpClient : HttpClient,@Inject(HttpClient) private ht) { }


    getAllIpos() : Observable<IPO[]>{
      return this.httpClient.get<IPO[]>(this.httpUrl);
   
    }

    saveIpo(ipo : IPO):Observable<IPO>{
      return this.httpClient.post<IPO>(this.httpUrl,ipo);
    }
    deleteIpo(id : number):Observable<IPO> {
      return this.httpClient.delete<IPO>(this.httpUrl+id)
        }
        update(ipo : IPO) :Observable<IPO>{
          return this.ht.put(this.httpUrl,ipo);
        }
        getIpoById(id:number) : Observable<IPO>{
          return this.ht.get(this.httpUrl+id);
        }
        isAdmin() : boolean{
          return true;
        }
}
