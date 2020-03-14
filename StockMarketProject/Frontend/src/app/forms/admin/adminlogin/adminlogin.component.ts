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
  constructor(private loginService : ServiceService,private authservice:AuthserviceService, private route : Router,private formBulder : FormBuilder,private auth:AuthserviceService) { }

  ngOnInit() {
    this.loginForm=this.formBulder.group({
username:['',Validators.required],
password:['',Validators.required] 
//rememeberme:false
    });
      // this.loginService.getAllUsers().subscribe(u=>
      // {
      //   this.users=u;
      
      // });
  }
      isValid(){
        let username=this.loginForm.get("username").value;
        let password=this.loginForm.get("password").value;
        // let usertype=this.loginForm.get("usertype").value;
        const result$ = this.auth.authenticate(username,password);
        result$.subscribe(data => {
          sessionStorage.setItem('userId', data.id.toString());
          this.currentUser = data;
          console.log(data);
          
          // if(data.usertype === 'ROLE_ADMIN')
          // this.route.navigate(['/adminhome']);
          // else
          //this.route.navigate(['/userhome']);


          if(sessionStorage.getItem('usertype')==='user'){
            // this.message="Successfully logging in User Account "
            //   $('#myModal').modal('show');
            // alert('Welcome user')
             this.route.navigate(['/userhome']);
          }
         else if(sessionStorage.getItem('usertype')==='admin'){
          // this.message="Successfully logging in Admin Account "
          // $('#myModal').modal('show');
          // alert('Welcome Admin')
            this.route.navigate(['/adminhome']);
          }
          else{
            // this.message="Wrong Credentials "
            // $('#myModal').modal('show');
             alert('Wrong Credentials')
            this.route.navigate(['adminlogin'])
          }
        })
        }
  }





  // onSubmit(){
  //   console.log(this.loginForm.value);
  //   }





    








  
// isValid(){
//   let admin_userName="admin";
//   let admin_password="admin";
//   let userName = this.loginForm.controls.username.value;
//   let pass = this.loginForm.controls.password.value;
//  this.authservice.getAuthenticationToken();





//   if((userName == admin_userName) && ( pass == admin_password)){
//     this.route.navigate(['/adminhome']);
//   }
//   else{
//     if(this.login(userName,pass)){
//       if(this.loginService.isActivated(this.currentUser)){
//         localStorage.removeItem('userId');
//         localStorage.setItem('userId',this.currentUser.id.toString());
//         this.route.navigate(['/userhome']);
//       }
//       else{
//         this.message="Please Activate Your Account to Login"
//     $('#myModal').modal('show');
//         // alert("Please Activate Your Account to Login")
//       }
//     }else{
//       console.log(this.loginForm.value);
//       this.message="Invalid UserName And Password"
//     $('#myModal').modal('show');
//       // alert("Invalid UserName And Password");
//       this.loginForm.reset();
//     }
//   }
// }
// login(userName: string, passWord : string){
//   for(let user of this.users){
//     if((userName == user.username) &&(passWord  == user.password)){
// this.currentUser = user;
// return true;
//     }
//   }
//   return false;
// }
// onSubmit(){
// console.log(this.loginForm.value);
// }
// }

