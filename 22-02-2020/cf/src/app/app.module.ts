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
import { HttpClientModule } from '@angular/common/http';
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
    UpdateCompanyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
