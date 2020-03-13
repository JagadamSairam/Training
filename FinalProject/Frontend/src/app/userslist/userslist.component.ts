import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../services/service.service';
import { FormGroup } from '@angular/forms';
import { User } from 'src/modals/user';
import { Router } from '@angular/router';


@Component({
  selector: 'app-userslist',
  templateUrl: './userslist.component.html',
  styleUrls: ['./userslist.component.css']
})
export class UserslistComponent implements OnInit {
 users:User[];
  constructor(private userService : ServiceService, private router:Router ) { }

  ngOnInit() {
     this.userService.getAllUsers().subscribe(data => {
       this.users=data;
     });

    


   }
   delete(user:User){
     this.userService.deleteUser(user.id).subscribe();
     this.users=this.users.filter(u=> u !== user)
   }

   update(user:User){

    localStorage.removeItem("userID");
    localStorage.setItem("userID",user.id.toString());
    this.router.navigate(['update-user']);
    
  }
  
}
