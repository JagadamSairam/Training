import { Injectable, Inject } from '@angular/core';
//import {USERS} from '../../modals/user-mock'
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from 'src/modals/user';
import { userInfo } from 'os';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
httpUrl = 'http://localhost:8000/registerUser/';

 //user = USERS;
  constructor(private httpClient : HttpClient , @Inject (HttpClient) private ht) { }

 getAllUsers() : Observable<User[]>{
   return this.httpClient.get<User[]>(this.httpUrl);

 }
  saveUser(user : User){
    return this.ht.post(this.httpUrl,user);

  }
   deleteUser(id : number):Observable<User> {
    return this.ht.delete(`http://localhost:8000/registerUser/${id}`)
      }
      update(user : User){
        return this.ht.put(`http://localhost:8000/registerUser/`,user);
      }
      getUserById(id:number) : Observable<User>{
        return this.ht.get(`http://localhost:8000/registerUser/${id}`);
      }
      // reg(){
      //   return this.ht.get(`http://localhost:8080/registerUser`);
      // }
      isAdmin() : boolean{
        return true;
      }
      serviceActivation(obj){
        return this.ht.put(`http://localhost:8000/activate`,obj)
      }
      loggedIn(){
        let user_id= localStorage.getItem('userId');
        if(user_id == null){
          return false;
        }
          else
        return true;
      }


      isActivated(user:User){
        if(user.active == "yes"){
          return true;
        }
      }
}
