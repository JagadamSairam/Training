import { Injectable, Inject } from '@angular/core';
import { Observable } from 'rxjs';
import { Sector } from 'src/modals/sector';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/modals/user';
import { ThrowStmt } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class SectorService {
  httpUrl = 'http://localhost:8888/sector/';
  httpUrl1 = 'http://localhost:8888/registerUserBySector/';

  constructor(private httpClient : HttpClient, @Inject (HttpClient) private ht) { }
  getAllSectors() : Observable<Sector[]>{
    return this.httpClient.get<Sector[]>(this.httpUrl);
 
  }
  getAllUsers() : Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl1);
  }

  saveSector(sector : Sector):Observable<Sector>{
    return this.httpClient.post<Sector>(this.httpUrl,sector);
  }
  deleteSector(id : number):Observable<Sector> {
    return this.httpClient.delete<Sector>(this.httpUrl+id)
      }
      update(sector : Sector) :Observable<Sector>{
        return this.ht.put("http://localhost:8888/sector/",sector);
      }
      getSectorById(id:number) : Observable<Sector>{
        return this.ht.get(`http://localhost:8888/sector/${id}`);
      }
      isAdmin() : boolean{
        return true;
      }
}
