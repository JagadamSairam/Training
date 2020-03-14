import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { AddcompanyService } from 'src/app/services/addcompany.service';
import { Company } from 'src/modals/addcompany';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-company',
  templateUrl: './update-company.component.html',
  styleUrls: ['./update-company.component.css']
})
export class UpdateCompanyComponent implements OnInit {
  updateCompany : FormGroup;
  constructor(private companyService : AddcompanyService,private formBuilder : FormBuilder,private router:Router) { 
   
      
  }

  ngOnInit() {
    this.updateCompany = this.formBuilder.group({
      id:['',Validators.required],
      name: ['',Validators.required],
      companyCode: ['',Validators.required],
      sector : ['',Validators.required],
      ceoName : ['',Validators.required],
      bod :  ['',Validators.required],
      turnOver : ['',Validators.required]
        });
    const id = localStorage.getItem('companyID');
    if(+id>0){
      this.companyService.getCompanyById(+id).subscribe(user => {
        this.updateCompany.patchValue(user);
      });
  }
}
update(company:Company){
  this.companyService.update(this.updateCompany.value).subscribe( u =>{
    
    this.router.navigate(['companylist']);
  })
}

}

