import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-comparecompany',
  templateUrl: './comparecompany.component.html',
  styleUrls: ['./comparecompany.component.css']
})
export class ComparecompanyComponent implements OnInit {
compareCompany:FormGroup
  constructor() { }

  ngOnInit() {
  }

}
