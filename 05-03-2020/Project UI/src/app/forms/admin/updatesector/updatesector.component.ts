import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';
import { SectorService } from 'src/app/services/sector.service';
import { Sector } from 'src/modals/sector';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatesector',
  templateUrl: './updatesector.component.html',
  styleUrls: ['./updatesector.component.css']
})
export class UpdatesectorComponent implements OnInit {
updateSector : FormGroup;
  constructor(private formBuilder : FormBuilder,private sectorService : SectorService, private router : Router) { }

  ngOnInit() {
    this.updateSector = this.formBuilder.group({
      id : ['',Validators.required],
      name: ['',Validators.required],
      brief: ['',Validators.required]
  });
  const id = localStorage.getItem('sectorID');
  if(+id>0){
    this.sectorService.getSectorById(+id).subscribe(sector => {
      this.updateSector.patchValue(sector);
    });
}

}
update(sector:Sector){
  this.sectorService.update(this.updateSector.value).subscribe( i =>{
    this.router.navigate(['sectorlist']);
  })
}


}