import { Injectable, Inject } from '@angular/core';
//import {USERS} from '../../modals/user-mock'
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from 'src/modals/user';
import { environment } from 'src/environments/environment';
// import { userInfo } from 'os';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
httpUrl = environment.port + 'user-service/registerUser/';

 //user = USERS;
  constructor(private httpClient : HttpClient , @Inject (HttpClient) private ht) { }

 getAllUsers() : Observable<User[]>{
   return this.httpClient.get<User[]>(this.httpUrl);

 }
  saveUser(user : User){
    return this.ht.post(this.httpUrl,user);

  }
   deleteUser(id : number):Observable<User> {
    return this.ht.delete(this.httpUrl + id)
      }
      update(user : User){
        return this.ht.put(this.httpUrl,user);
      }
      getUserById(id:number) : Observable<User>{
        return this.ht.get(this.httpUrl +  id );
      }
      // reg(){
      //   return this.ht.get(`http://localhost:8080/registerUser`);
      // }
      isAdmin() : boolean{
        return true;
      }
      serviceActivation(obj){
        return this.ht.put(`http://localhost:8765/user-service/activate`,obj)
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
        if(user.active == true){
          return true;
        }
      }
}
