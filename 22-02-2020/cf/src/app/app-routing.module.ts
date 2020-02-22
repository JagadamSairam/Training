import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './forms/home/home.component';
import { RegistrationComponent } from './forms/user/registration/registration.component';
import { LoginComponent } from './forms/user/login/login.component';
import { UserhomeComponent } from './forms/user/userhome/userhome.component';
import { UserslistComponent } from './userslist/userslist.component';
import { UpdateUserComponent } from './forms/admin/update-user/update-user.component';
import { User } from 'src/modals/user';

import { AddcompanyComponent } from './forms/admin/addcompany/addcompany.component';
import { UploadComponent } from './forms/admin/upload/upload.component';
import { CompanylistComponent } from './forms/admin/companylist/companylist.component';
import { AdminhomeComponent } from './forms/admin/adminhome/adminhome.component';
import { IpolistComponent } from './forms/admin/ipolist/ipolist.component';
import { AuthGuard } from './auth.guard';
import { MainlogComponent } from './mainlog/mainlog.component';
import { AdminloginComponent } from './forms/admin/adminlogin/adminlogin.component';
import { IpodetailsComponent } from './forms/admin/ipodetails/ipodetails.component';
import { SectorComponent } from './forms/admin/sector/sector.component';
import { UpdateCompanyComponent } from './forms/admin/update-company/update-company.component';


const routes: Routes = [
  {path : '', component : HomeComponent},
  {path : 'login' , component : LoginComponent},
  {path : 'mainlog', component : MainlogComponent},
  {path: 'adminlogin', component:AdminloginComponent},
  {path : 'registration', component: RegistrationComponent},
  {path : 'userhome' , component : UserhomeComponent},
  {path : 'userslist',component : UserslistComponent, canActivate : [AuthGuard]},
  {path : 'update-user', component:UpdateUserComponent, canActivate : [AuthGuard]},
  {path : 'addcompany', component:AddcompanyComponent},
  {path : 'upload',component:UploadComponent},
  {path : 'companylist', component : CompanylistComponent},
  {path : 'adminhome', component : AdminhomeComponent},
  {path : 'ipolist',component:IpolistComponent},
  {path : 'ipodetails' , component : IpodetailsComponent},
  {path : 'sector', component : SectorComponent},
  {path:'update-company' , component:UpdateCompanyComponent},
  {path : 'userslist/registration',component : RegistrationComponent}
];
  
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
