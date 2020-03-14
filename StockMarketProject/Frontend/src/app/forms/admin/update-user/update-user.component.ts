import { Component, OnInit } from '@angular/core';
import { Validators,FormBuilder, FormGroup } from '@angular/forms';
import { ServiceService } from 'src/app/services/service.service';
import { Router } from '@angular/router';
import { User } from 'src/modals/user';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
update:FormGroup
  constructor(private userService : ServiceService,private formBuilder : FormBuilder, private router : Router) { }

  ngOnInit() {
    this.update=this.formBuilder.group({
      id:[""],
      username :['', Validators.required],
      password:['',Validators.required],
      reenterpassword : ['', Validators.required],
      phone : ['', Validators.required],
      email :['', [Validators.required,Validators.email]],
      confirmemail : ['',[Validators.email,Validators.required ]]     ,
       active:[''],
       admin:['']
    });
    
        const id = localStorage.getItem('userID');
        if(+id>0){
          this.userService.getUserById(+id).subscribe(user => {
            this.update.patchValue(user);
          });
  }


  
}
  updateUser(user:User){
    this.userService.update(this.update.value).subscribe( u =>{
      this.router.navigate(['/userprofile']);
    })
  }

  }
  
  
