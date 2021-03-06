import { Component, OnInit } from '@angular/core';
import * as Highcharts from 'highcharts';

@Component({
  selector: 'app-charts',
  templateUrl: './charts.component.html',
  styleUrls: ['./charts.component.css']
})
export class ChartsComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  title = 'charts';
   
  data = [{
          name: 'example',
          data: [500, 700, 555, 444, 777, 877, 944, 567, 666, 789, 456, 654]
       },{
          name: 'Nicesnippets.com',
          data: [677, 455, 677, 877, 455, 778, 888, 567, 785, 488, 567, 654]
       }];
    //    plotOptions: {
    //     column: {
    //         pointPadding: 0,
    //         borderWidth: 0,
    //         groupPadding: 0,
    //         shadow: false
    //     }
    // }
  highcharts = Highcharts;
  chartOptions = {   
    chart: {
      type: 'column'
  },
    title: {
       text: "Monthly Site Visitor"
    },
    xAxis:{
       categories:["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    },
    yAxis: {          
       title:{
          text:"Visitors"
       } 
    },
    series: this.data
  };
  
}

