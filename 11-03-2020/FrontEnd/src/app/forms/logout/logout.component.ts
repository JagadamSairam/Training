import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthserviceService } from 'src/app/services/authservice.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private router : Router, private auth:AuthserviceService) { }

  ngOnInit() {
 
    this.auth.logout();
    this.router.navigate(['home']);
  }

}
