import { Component, OnInit } from '@angular/core';
import { Sector } from 'src/modals/sector';
import { SectorService } from 'src/app/services/sector.service';
import { Router } from '@angular/router';
import { User } from 'src/modals/user';

@Component({
  selector: 'app-sectorlist',
  templateUrl: './sectorlist.component.html',
  styleUrls: ['./sectorlist.component.css']
})
export class SectorlistComponent implements OnInit {
 sectors : Sector[];
 sectors1 : User[];
   constructor(private sectorService : SectorService, private router : Router) { }

  ngOnInit() {
    this.sectorService.getAllSectors().subscribe(data => {
      this.sectors=data;

    });

  

  }
  delete(sector:Sector){
    this.sectorService.deleteSector(sector.id).subscribe();
    this.sectors=this.sectors.filter(i=> i !== sector)
  }

  update(sector:Sector){

   localStorage.removeItem("sectorID");
   localStorage.setItem("sectorID",sector.id.toString());
   this.router.navigate(['updatesector']);
   
 }
 getAllUsers(){
  this.sectorService.getAllUsers().subscribe(users => {
    this.sectors1=users;
  });
 }

}
