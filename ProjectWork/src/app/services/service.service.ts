import { Injectable, Inject } from '@angular/core';
import {USERS} from '../../modals/user-mock'
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from 'src/modals/user';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
httpUrl = 'http://localhost:8080/registerUser/';

// users = USERS;
  constructor(private httpClient : HttpClient , @Inject (HttpClient) private ht) { }

 getAllUsers() : Observable<User[]>{
   return this.httpClient.get<User[]>(this.httpUrl);

 }
  saveUser(user : User):Observable<User>{
    return this.ht.post(this.httpUrl,user);

  }
   deleteUser(id : number):Observable<User> {
    return this.ht.delete(`http://localhost:8080/registerUser/${id}`)
      }
      update(user : User) :Observable<User>{
        return this.ht.put(`http://localhost:8080/registerUser/`,user);
      }
      getUserById(id:number) : Observable<User>{
        return this.ht.get(`http://localhost:8080/registerUser/${id}`);
      }
      isAdmin() : boolean{
        return true;
      }
}
