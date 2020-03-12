import { Component } from '@angular/core';
import { AuthserviceService } from './services/authservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
isAdmin : false;
  title = 'Project';
  userLoggedIn : boolean = false;
  constructor(private authService:AuthserviceService){}

  ngDoCheck(){
    this.userLoggedIn = this.authService.isUserLoggedIn();
  }
}

