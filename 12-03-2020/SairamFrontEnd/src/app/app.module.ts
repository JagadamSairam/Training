import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './forms/user/registration/registration.component';
import { HomeComponent } from './forms/home/home.component';
import { LoginComponent } from './forms/user/login/login.component';
import { UserhomeComponent } from './forms/user/userhome/userhome.component';
import { AdminhomeComponent } from './forms/admin/adminhome/adminhome.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { UserslistComponent } from './userslist/userslist.component';
import { UpdateUserComponent } from './forms/admin/update-user/update-user.component';
import { AddcompanyComponent } from './forms/admin/addcompany/addcompany.component';
import { IpolistComponent } from './forms/admin/ipolist/ipolist.component';
import { CompanylistComponent } from './forms/admin/companylist/companylist.component';
import { UploadComponent } from './forms/admin/upload/upload.component';
import { SectorComponent } from './forms/admin/sector/sector.component';
import { MainlogComponent } from './mainlog/mainlog.component';
import { AdminloginComponent } from './forms/admin/adminlogin/adminlogin.component';
import { LogoutComponent } from './forms/logout/logout.component';
import { IpodetailsComponent } from './forms/admin/ipodetails/ipodetails.component';
import { UpdateCompanyComponent } from './forms/admin/update-company/update-company.component';
import { UpdateipoComponent } from './forms/admin/updateipo/updateipo.component';
import { StockexchangeComponent } from './forms/admin/stockexchange/stockexchange.component';
import { UpdatestockexchangeComponent } from './forms/admin/updatestockexchange/updatestockexchange.component';
import { StocklistComponent } from './forms/admin/stocklist/stocklist.component';
import { ComparecompanyComponent } from './forms/user/comparecompany/comparecompany.component';
import { ComparesectorComponent } from './forms/user/comparesector/comparesector.component';
import { ViewipoComponent } from './forms/user/viewipo/viewipo.component';
import { SectorlistComponent } from './forms/admin/sectorlist/sectorlist.component';
import { UpdatesectorComponent } from './forms/admin/updatesector/updatesector.component';
import { StockpriceComponent } from './forms/admin/stockprice/stockprice.component';
import { StockpricelistComponent } from './forms/admin/stockpricelist/stockpricelist.component';
import { UpdatestockpriceComponent } from './forms/admin/updatestockprice/updatestockprice.component';
import { ActivateComponent } from './activate/activate.component';
import { ContactComponent } from './forms/contact/contact.component';
import { ChartsComponent } from './forms/charts/charts.component';
import { HighchartsChartComponent} from 'highcharts-angular';
import { SidenavComponent } from './forms/admin/sidenav/sidenav.component';
import { SideComponent } from './forms/user/side/side.component';
import { HttpinterceptorserviceService } from './services/httpinterceptorservice.service';
import { LandComponent } from './forms/land/land.component';
import { AdduserComponent } from './forms/admin/adduser/adduser.component';
import { UserprofileComponent } from './forms/user/userprofile/userprofile.component';
import { UpdateprofileComponent } from './forms/user/updateprofile/updateprofile.component';
import { ChangepasswordComponent } from './forms/user/changepassword/changepassword.component';


@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    HomeComponent,
    LoginComponent,
    UserhomeComponent,
    AdminhomeComponent,
    UserslistComponent,
    UpdateUserComponent,
    AddcompanyComponent,
    IpolistComponent,
    CompanylistComponent,
    UploadComponent,
    SectorComponent,
    MainlogComponent,
    AdminloginComponent,
    LogoutComponent,
    IpodetailsComponent,
    UpdateCompanyComponent,
    UpdateipoComponent,
    StockexchangeComponent,
    UpdatestockexchangeComponent,
    StocklistComponent,
    ComparecompanyComponent,
    ComparesectorComponent,
    ViewipoComponent,
    SectorlistComponent,
    UpdatesectorComponent,
    StockpriceComponent,
    StockpricelistComponent,
    UpdatestockpriceComponent,
    ActivateComponent,
    ContactComponent,
    ChartsComponent,
    HighchartsChartComponent,
    SidenavComponent,
    SideComponent,
    LandComponent,
    AdduserComponent,
    UserprofileComponent,
    UpdateprofileComponent,
    ChangepasswordComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [
    {
      provide : HTTP_INTERCEPTORS,
      useClass : HttpinterceptorserviceService,
      multi:true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
