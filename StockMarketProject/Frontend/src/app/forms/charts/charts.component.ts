import { Component, OnInit } from '@angular/core';
import * as Highcharts from 'highcharts';
import { StockPrice } from 'src/modals/stockprice';
import { ActivatedRoute } from '@angular/router';
import { ComparecompanyComponent } from '../user/comparecompany/comparecompany.component';
import { StockpriceService } from 'src/app/services/stockprice.service';
import { Company } from 'src/modals/addcompany';
import { UploadserviceService } from 'src/app/services/uploadservice.service';

@Component({
  selector: 'app-charts',
  templateUrl: './charts.component.html',
  styleUrls: ['./charts.component.css']
})
export class ChartsComponent implements OnInit {



companies : Company 

  compareData:any;
  constructor(private uploadService: UploadserviceService, private route: ActivatedRoute) { }
  chartOne = Highcharts;
  chartOneOptions: any;
  getFirstDataComplete: boolean = false;
  getSecondDataComplete: boolean = false;
  ngOnInit() {
    this.compareData = JSON.parse(this.route.snapshot.queryParams.formData);
     let series: any = []
         let categories: any[] = [];
         this.uploadService.getCompanyStockPricesBetween(this.compareData.companysectorname, this.compareData.stockExchange, this.compareData.fromperiod, this.compareData.toperiod).subscribe(data => {
             let companyOneData: any[] = [];
              console.log(companyOneData)
             data.forEach((stockPrice) => {
                 categories.push(stockPrice.dataPoint);
                 companyOneData.push(stockPrice.dataValue)
             })
             let seriesDataMemberOne = {
                 name: this.compareData.companysectorname + " (" + this.compareData.stockExchange + ")",
                 data: companyOneData
             }
             series[0] = seriesDataMemberOne;
             this.getFirstDataComplete = true;
         });
         this.uploadService.getCompanyStockPricesBetween(this.compareData.companyorsector, this.compareData.stockExchange, this.compareData.fromperiod, this.compareData.toperiod).subscribe(data => {
             let companyTwoData: any[] = [];
             data.forEach((stockPrice) => {
                 if (categories.includes(stockPrice.dataPoint)) {
                     companyTwoData.push(stockPrice.dataValue)
                 }
             })
             let seriesDataMemberTwo = {
                 name: this.compareData.companyorsector + " (" + this.compareData.stockExchange + ")",
                 data: companyTwoData
             }
             series[1] = seriesDataMemberTwo;
             this.getSecondDataComplete = true;
         });
         this.chartOneOptions = {
             chart: {
                 type: "column"
             },
             title: {
                 text: "Stock Comparision Chart"
             },
             xAxis: {
                 categories: categories
             },
             yAxis: {
                 title: {
                     text: "Stock Price"
                 }
             },
             series: series
         }
     }
}