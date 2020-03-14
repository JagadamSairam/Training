import { Injectable } from '@angular/core';
import { AuthserviceService } from './authservice.service';
import { HttpInterceptor, HttpRequest, HttpHandler } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpinterceptorserviceService implements HttpInterceptor {

  constructor(public auth : AuthserviceService) { }

  intercept(request : HttpRequest<any> , next: HttpHandler){
    console.log("Inside interceptor");

    if(this.auth.getAuthenticationToken()){
      let authenticationToken = this.auth.getAuthenticationToken();
      request= request.clone({
        setHeaders : {
          Authorization: authenticationToken
        }
      });
    }
    return next.handle(request);
  }
}
