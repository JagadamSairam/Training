import { Component, OnInit } from '@angular/core';
import { AddcompanyService } from 'src/app/services/addcompany.service';
import { Company } from 'src/modals/addcompany';
import { Router } from '@angular/router';
import { User } from 'src/modals/user';

@Component({
  selector: 'app-companylist',
  templateUrl: './companylist.component.html',
  styleUrls: ['./companylist.component.css']
})
export class CompanylistComponent implements OnInit {
companies : Company[];
user : User;
  constructor(private companyService : AddcompanyService,private router : Router) { }

  ngOnInit() {
    this.companyService.getAllCompanies().subscribe(data => {
      this.companies=data;
    });
  }
  delete(company:Company){
    this.companyService.deleteCompany(company.id).subscribe();
    this.companies=this.companies.filter(c=> c !== company)
  }
addStockPrice(company:Company){
  localStorage.removeItem("companyID");
  localStorage.setItem("companyId",company.id.toString());
  this.router.navigate(['stockprice']);
}
  update(company:Company){

    localStorage.removeItem("companyID");
    localStorage.setItem("companyID",company.id.toString());
    this.router.navigate(['update-company']);
    
  }
  showUser(id : number){
    this.companyService.getUserById(id).subscribe(users => {
      this.user=users;
  });
}
}
