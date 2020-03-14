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
 
     sessionStorage.removeItem('userId')
    sessionStorage.removeItem('token');
    sessionStorage.removeItem('username');
    sessionStorage.removeItem('usertype');
    alert("logged out successfully")
    this.router.navigate(['/'])
    // this.router.navigate(['adminlogin']);
  }

}
