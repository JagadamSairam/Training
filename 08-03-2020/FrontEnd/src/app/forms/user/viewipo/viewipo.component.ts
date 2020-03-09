import { Component, OnInit } from '@angular/core';
import { IPO } from 'src/modals/Ipo';
import { IpoService } from 'src/app/services/ipo.service';

@Component({
  selector: 'app-viewipo',
  templateUrl: './viewipo.component.html',
  styleUrls: ['./viewipo.component.css']
})
export class ViewipoComponent implements OnInit {
  ipos:IPO[];

  constructor(private ipoService : IpoService) { }

  ngOnInit() {
    this.ipoService.getAllIpos().subscribe(data => {
      this.ipos=data;
    });
    }
}
