import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { SectorService } from 'src/app/services/sector.service';

@Component({
  selector: 'app-sector',
  templateUrl: './sector.component.html',
  styleUrls: ['./sector.component.css']
})
export class SectorComponent implements OnInit {
registerSector : FormGroup
  constructor(private sectorService : SectorService, private formBuilder : FormBuilder) { }

  ngOnInit() {
    this.registerSector = this.formBuilder.group({
      id : ['',Validators.required],
      name: ['',Validators.required],
      brief: ['',Validators.required]
      
  });
}
submit(){
  this.sectorService.saveSector(this.registerSector.value).subscribe(data=>{
    console.log("Details are Entered Success fully");
    alert("Successfully Entered New record");
  });
}
}
