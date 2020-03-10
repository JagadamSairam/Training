import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ServiceService } from 'src/app/services/service.service';
import { Router } from '@angular/router';
import { User } from 'src/modals/user';
import { AuthserviceService } from 'src/app/services/authservice.service';
declare var $:any;

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  loginForm : FormGroup
  users:User[];
  currentUser:User;
 
  message:String;
  constructor(private loginService : ServiceService,private authservice:AuthserviceService, private route : Router,private formBulder : FormBuilder) { }

  ngOnInit() {
    this.loginForm=this.formBulder.group({
username:['',Validators.required],
password:['',Validators.required] 
//rememeberme:false
    });
      this.loginService.getAllUsers().subscribe(u=>
      {
        this.users=u;
      
      });
  
  

  }



  
isValid(){
  let admin_userName="admin";
  let admin_password="admin";
  let userName = this.loginForm.controls.username.value;
  let pass = this.loginForm.controls.password.value;
 this.authservice.getAuthenticationToken();





  if((userName == admin_userName) && ( pass == admin_password)){
    this.route.navigate(['/adminhome']);
  }
  else{
    if(this.login(userName,pass)){
      if(this.loginService.isActivated(this.currentUser)){
        localStorage.removeItem('userId');
        localStorage.setItem('userId',this.currentUser.id.toString());
        this.route.navigate(['/userhome']);
      }
      else{
        this.message="Please Activate Your Account to Login"
    $('#myModal').modal('show');
        // alert("Please Activate Your Account to Login")
      }
    }else{
      console.log(this.loginForm.value);
      this.message="Invalid UserName And Password"
    $('#myModal').modal('show');
      // alert("Invalid UserName And Password");
      this.loginForm.reset();
    }
  }
}
login(userName: string, passWord : string){
  for(let user of this.users){
    if((userName == user.username) &&(passWord  == user.password)){
this.currentUser = user;
return true;
    }
  }
  return false;
}
onSubmit(){
console.log(this.loginForm.value);
}
}

