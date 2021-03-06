import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ServiceService } from 'src/app/services/service.service';
import { User } from 'src/modals/user';
import { Router } from '@angular/router';
declare var $:any;
@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {
  registerUser: FormGroup;
  message:string;
    users: User[] = [];
    constructor(private formBuilder: FormBuilder, private userService: ServiceService,private router:Router) { }
  
    ngOnInit() {
      this.registerUser = this.formBuilder.group({
        id: ['', Validators.required],
        username: ['', Validators.required],
        password: ['', Validators.required],
        reenterpassword: ['', Validators.required],
        phone: ['', Validators.required],
        email: ['', [Validators.required, Validators.email]],
        confirmemail: ['', [Validators.required, Validators.email]]
      });
      this.userService.getAllUsers().subscribe(u =>  this.users = u)
  
    }
    
  
      
  
  
        addUser(){
          let e=this.registerUser.controls.email.value;
          if(this.emailVaild(e)){
          this.userService.saveUser(this.registerUser.value).subscribe(data => {
            //  alert('User Inserted Successfully' +data);
            //  alert('coming status'+data.regstatus);
            this.message="Registered Successfully"
      $('#myModal').modal('show');
            //  alert('Registered Successfully')
             this.registerUser.reset()
             this.router.navigate(['/userslist'])
            }); 
          }
            else
            {
              this.message="already Email exsits"
              $('#myModal').modal('show');
              // alert('already Email exsits')
              this.registerUser.reset()
            }
         }
  
  
    emailVaild(e: String) {
      for (let user of this.users) {
        if (user.email == e) {
          return false;
        }
      }
      return true;
    }
  
  
  
  }
  