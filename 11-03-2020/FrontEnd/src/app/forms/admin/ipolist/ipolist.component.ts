import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { IpoService } from 'src/app/services/ipo.service';

@Component({
  selector: 'app-ipolist',
  templateUrl: './ipolist.component.html',
  styleUrls: ['./ipolist.component.css']
})
export class IpolistComponent implements OnInit {
  registerIpo : FormGroup
  constructor(private ipoService : IpoService,private formBuilder : FormBuilder,private router:Router) { }

  ngOnInit() {
    this.registerIpo = this.formBuilder.group({
      id:['',Validators.required],
      companyName: ['',Validators.required],
      stockExchange : ['',Validators.required],
    pricePerShare : ['',Validators.required],
    totalStocks :  ['',Validators.required],
      openDateTime : ['',Validators.required],
      remarks :['',Validators.required]
        });
  }
  submit(){
    this.ipoService.saveIpo(this.registerIpo.value).subscribe(data=>{
      console.log("Ipo Details are Entered Success fully");
      alert("Successfully ENtered New IPO");
      this.router.navigate(['/ipodetails']);
    });

}
}
