import { Injectable } from '@angular/core';
import { AuthserviceService } from './authservice.service';
import { Router, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(public auth:AuthserviceService, public router: Router) { }
   canActivate(router:ActivatedRouteSnapshot,state:RouterStateSnapshot){
  if(this.auth.isUserLoggedIn())
  return true;
  else{
    this.router.navigate(['/adminlogin']);
    return false;
  }
}

}
