import { Component, OnInit } from '@angular/core';
import { AddcompanyService } from 'src/app/services/addcompany.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addcompany',
  templateUrl: './addcompany.component.html',
  styleUrls: ['./addcompany.component.css']
})
export class AddcompanyComponent implements OnInit {
  registerCompany : FormGroup;
  constructor(private userService:AddcompanyService,private formBuilder : FormBuilder,private router : Router) { }

  ngOnInit() {

    this.registerCompany = this.formBuilder.group({
      id:['',Validators.required],
      name: ['',Validators.required],
      companyCode:['',Validators.required],
      sector : ['',Validators.required],
      ceoName : ['',Validators.required],
      bod :  ['',Validators.required],
      turnOver : ['',Validators.required]
        });
  }
  submit(){
    this.userService.saveCompany(this.registerCompany.value).subscribe(data=>{
      console.log("Company Details are Entered Success fully");
      this.router.navigate(['companylist']);
      alert("Successfully ENtered New User");

      });
 
}
}
