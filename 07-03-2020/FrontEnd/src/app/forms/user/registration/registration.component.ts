import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators, FormBuilder } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ServiceService } from 'src/app/services/service.service';
import { User } from 'src/modals/user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  registerUser: FormGroup;

  users: User[];
  constructor(private formBuilder: FormBuilder, private userService: ServiceService) { }

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
  
//   addUser() {
    
//     let e = this.registerUser.controls.email.value;
//     if (this.users.length) {
//       this.userService.saveUser(this.registerUser.value).subscribe(data => {
//         alert('Registered Successfully')
//       });

//     }
//     else if (this.emailVaild(e)) {
//       this.userService.saveUser(this.registerUser.value).subscribe(data => {
//         alert('Registered Successfully')
//         this.registerUser.reset()
//       });

//     }
//     else {


//       alert('already Email exsits')
//       this.registerUser.reset()
// }
//   }






      // alert('already Email exsits')
      // this.registerUser.reset()
    


      addUser(){
        let e=this.registerUser.controls.email.value;
        if(this.emailVaild(e)){
        this.userService.saveUser(this.registerUser.value).subscribe(data => {
          //  alert('User Inserted Successfully' +data);
          //  alert('coming status'+data.regstatus);
           alert('Registered Successfully')
           this.registerUser.reset()
          }); 
        }
          else
          {
            alert('already Email exsits')
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



  //     this.userService.reg().subscribe(dt =>{
  //       console.log("coming status::::" +dt.reg);
  //     })
  //  }
}


