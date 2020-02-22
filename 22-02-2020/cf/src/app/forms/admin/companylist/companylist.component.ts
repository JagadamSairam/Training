import { Component, OnInit } from '@angular/core';
import { AddcompanyService } from 'src/app/services/addcompany.service';
import { Company } from 'src/modals/addcompany';
import { Router } from '@angular/router';

@Component({
  selector: 'app-companylist',
  templateUrl: './companylist.component.html',
  styleUrls: ['./companylist.component.css']
})
export class CompanylistComponent implements OnInit {
companies : Company[];
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

  update(company:Company){

    localStorage.removeItem("companyID");
    localStorage.setItem("companyID",company.id.toString());
    this.router.navigate(['update-company']);
    
  }
}
