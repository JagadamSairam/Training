import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { IpoService } from 'src/app/services/ipo.service';
import { Router } from '@angular/router';
import { IPO } from 'src/modals/Ipo';

@Component({
  selector: 'app-updateipo',
  templateUrl: './updateipo.component.html',
  styleUrls: ['./updateipo.component.css']
})
export class UpdateipoComponent implements OnInit {
update : FormGroup
  constructor(private ipoService : IpoService,private formBuilder : FormBuilder,private router:Router) { }

  ngOnInit() {
    this.update = this.formBuilder.group({
      id:['',Validators.required],
      companyName: ['',Validators.required],
      stockExchange : ['',Validators.required],
    pricePerShare : ['',Validators.required],
    totalStocks :  ['',Validators.required],
      openDateTime : ['',Validators.required],
      remarks:['',Validators.required]
        });
        const id = localStorage.getItem('ipoID');
        if(+id>0){
          this.ipoService.getIpoById(+id).subscribe(ipo => {
            this.update.patchValue(ipo);
          });
  }
}
  updateIpo(ipo:IPO){
    this.ipoService.update(this.update.value).subscribe( i =>{
      this.router.navigate(['ipodetails']);
    })
  }
}
