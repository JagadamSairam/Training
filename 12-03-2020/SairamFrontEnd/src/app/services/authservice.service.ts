import { Injectable } from '@angular/core';
import { ServiceService } from './service.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators'
import { User } from 'src/modals/user';
import { Observable } from 'rxjs';

const url = "http://localhost:8765/user-service/login/";
@Injectable({
  providedIn: 'root'
})
export class AuthserviceService {

  constructor(private userService: ServiceService, private http: HttpClient) { }

  authenticate(username: string, password: string): Observable<User> {
    // create a security token
    let authenticationToken = "Basic " + window.btoa(username + ":" + password);
    console.log(authenticationToken);
    let headers = new HttpHeaders({
      Authorization: authenticationToken
    });
    console.log("calling server");
    // send the request
    return this.http.get<User>(url, { headers }).pipe(
      // success function
      map((data: User) => {
        sessionStorage.setItem("username", username);
        sessionStorage.setItem("token", authenticationToken);
        sessionStorage.setItem("usertype", data.admin ? "admin" : "user");
        return data;
      }),
      //   map(error => {
      //     return error;
      //   })
      // );
      // failure function
      map(failureData => {
        // console message 
        console.log("failure")
        return failureData;
      })
    );
  }
  getAuthenticationToken() {
    if (this.isUserLoggedIn())
      return sessionStorage.getItem("token");
    return null;
  }
  isUserLoggedIn(): boolean {
    let user = sessionStorage.getItem('username');
    if (user == null)
      return false;
    return true;
  }
  getProfileUrl(): string {
    let url = sessionStorage.getItem("profile");
    return url;
  }
  logout() {
    sessionStorage.removeItem('username');
    sessionStorage.removeItem("token");
    sessionStorage.removeItem('usertype');
  }
  getUserDetails(): string {
    let user = sessionStorage.getItem('username');
    return user;
  }
}
