import { Component, OnInit } from '@angular/core';
import { IPO } from 'src/modals/Ipo';
import { IpoService } from 'src/app/services/ipo.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ipodetails',
  templateUrl: './ipodetails.component.html',
  styleUrls: ['./ipodetails.component.css']
})
export class IpodetailsComponent implements OnInit {

  ipos:IPO[];
  constructor(private ipoService : IpoService, private router:Router ) { }

  ngOnInit() {
       this.ipoService.getAllIpos().subscribe(data => {
       this.ipos=data;
     });

    


   }
   delete(ipo:IPO){
     this.ipoService.deleteIpo(ipo.id).subscribe();
     this.ipos=this.ipos.filter(i=> i !== ipo)
   }

   update(ipo:IPO){

    localStorage.removeItem("ipoID");
    localStorage.setItem("ipoID",ipo.id.toString());
    this.router.navigate(['updateipo']);
    
  }
  
}
