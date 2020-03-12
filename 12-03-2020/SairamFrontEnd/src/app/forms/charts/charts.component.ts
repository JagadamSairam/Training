import { Component, OnInit } from '@angular/core';
import * as Highcharts from 'highcharts';
import { StockPrice } from 'src/modals/stockprice';
import { ActivatedRoute } from '@angular/router';
import { ComparecompanyComponent } from '../user/comparecompany/comparecompany.component';
import { StockpriceService } from 'src/app/services/stockprice.service';

@Component({
  selector: 'app-charts',
  templateUrl: './charts.component.html',
  styleUrls: ['./charts.component.css']
})
export class ChartsComponent implements OnInit {





  compareData: ComparecompanyComponent;
  constructor(private stockPriceService: StockpriceService, private route: ActivatedRoute) { }
  chartOne = Highcharts;
  chartOneOptions: any;
  getFirstDataComplete: boolean = false;
  getSecondDataComplete: boolean = false;
  ngOnInit() {
      // this.compareData = JSON.parse(this.route.snapshot.queryParams.formData);
      // let series: any = []
      //     let categories: any[] = [];
      //     this.stockPriceService.getCompanyStockPricesBetween(this.compareData.companies[0].companyCode, this.compareData.companies[0].stockExchange, this.compareData.periods[0].fromDate, this.compareData.periods[0].toDate, this.compareData.periodicity).subscribe(data => {
      //         let companyOneData: any[] = [];
      //         data.forEach((stockPrice: StockPrice) => {
      //             categories.push(stockPrice.dataPoint);
      //             companyOneData.push(stockPrice.dataValue)
      //         })
      //         let seriesDataMemberOne = {
      //             name: this.compareData.companies[0].companyCode + " (" + this.compareData.companies[0].stockExchange + ")",
      //             data: companyOneData
      //         }
      //         series[0] = seriesDataMemberOne;
      //         this.getFirstDataComplete = true;
      //     });
      //     this.stockPriceService.getCompanyStockPricesBetween(this.compareData.companies[1].companyCode, this.compareData.companies[1].stockExchange, this.compareData.periods[0].fromDate, this.compareData.periods[0].toDate, this.compareData.periodicity).subscribe(data => {
      //         let companyTwoData: any[] = [];
      //         data.forEach((stockPrice: StockPrice) => {
      //             if (categories.includes(stockPrice.dataPoint)) {
      //                 companyTwoData.push(stockPrice.dataValue)
      //             }
      //         })
      //         let seriesDataMemberTwo = {
      //             name: this.compareData.companies[1].companyCode + " (" + this.compareData.companies[1].stockExchange + ")",
      //             data: companyTwoData
      //         }
      //         series[1] = seriesDataMemberTwo;
      //         this.getSecondDataComplete = true;
      //     });
      //     this.chartOneOptions = {
      //         chart: {
      //             type: "column"
      //         },
      //         title: {
      //             text: "Stock Comparision Chart"
      //         },
      //         xAxis: {
      //             categories: categories
      //         },
      //         yAxis: {
      //             title: {
      //                 text: "Stock Price"
      //             }
      //         },
      //         series: series
      //     }
      }
   }





//   ngOnInit() {
//   }

//   title = 'charts';
   
//   data = [{
//           name: 'example',
//           data: [500, 700, 555, 444, 777, 877, 944, 567, 666, 789, 456, 654]
//        },{
//           name: 'Nicesnippets.com',
//           data: [677, 455, 677, 877, 455, 778, 888, 567, 785, 488, 567, 654]
//        }];
    //    plotOptions: {
    //     column: {
    //         pointPadding: 0,
    //         borderWidth: 0,
    //         groupPadding: 0,
    //         shadow: false
    //     }
    // }
//   highcharts = Highcharts;
//   chartOptions = {   
//     chart: {
//       type: 'column'
//   },
//     title: {
//        text: "Monthly Site Visitor"
//     },
//     xAxis:{
//        categories:["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
//     },
//     yAxis: {          
//        title:{
//           text:"Visitors"
//        } 
//     },
//     series: this.data
//   };
  
// }

