import { Component, OnInit } from '@angular/core';
import {FormControl,FormGroup, Validators, FormBuilder} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ServiceService } from 'src/app/services/service.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  registerUser: FormGroup;

  constructor(private formBuilder :FormBuilder,private userService : ServiceService) { }

  ngOnInit() {
    this.registerUser = this.formBuilder.group({
      id : ['',Validators.required],
      username: ['',Validators.required],
      password : ['',Validators.required],
      reenterpassword: ['',Validators.required],
      phone :  ['',Validators.required],
      email : ['',[Validators.required,Validators.email]],
      confirmemail : ['',[Validators.required,Validators.email]]
    });
   

}
  submit(){
    this.userService.saveUser(this.registerUser.value).subscribe(data=>{
    if(data.res==0){
      alert("User Already Avaialable");

    }
       else if(data.res==1){
        //console.log("User Details are Entered Success fully");
        //alert("Successfully ENtered New User");
      alert("Added New User");

      }
      else{
        alert("ERROR");

      }
     
    
    });

    
  //     this.userService.reg().subscribe(dt =>{
  //       console.log("coming status::::" +dt.reg);
  //     })
  //  }
  }
  }

