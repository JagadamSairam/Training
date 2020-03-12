import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
// import { execFile } from 'child_process';
import { StockPrice } from 'src/modals/stockprice';
import { UploadserviceService } from 'src/app/services/uploadservice.service';
import bsCustomFileInput from 'bs-custom-file-input';

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.css']
})
export class UploadComponent implements OnInit {
  uploadFile : FormGroup
file:File;
isError:boolean=false;
errorMessage:string="";
  constructor(private stockPriceService:UploadserviceService) { }

  ngOnInit() {
    bsCustomFileInput.init();
    this.uploadFile=new FormGroup({
execFileUpload :new FormControl("",[Validators.required])
}) 
  }

  onFileChange(e){
    this.file=e.target.files[0];
  }


  uploadData(){
    this.isError=false;
    const uploadSheetData = new FormData();
    uploadSheetData.append("stockSheet",this.file,this.file.name);
    this.stockPriceService.uploadStocksSheet(uploadSheetData).subscribe(
      data=>{
        console.log('Uploaded');
        console.log(data);
      });
  }
}

