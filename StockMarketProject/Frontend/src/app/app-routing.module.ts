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
import { UpdateipoComponent } from './forms/admin/updateipo/updateipo.component';
import { StockExchange } from 'src/modals/stockexchange';
import { StockexchangeComponent } from './forms/admin/stockexchange/stockexchange.component';
import { StocklistComponent } from './forms/admin/stocklist/stocklist.component';
import { UpdatestockexchangeComponent } from './forms/admin/updatestockexchange/updatestockexchange.component';
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
import { SidenavComponent } from './forms/admin/sidenav/sidenav.component';
import { LogoutComponent } from './forms/logout/logout.component';
import { AdduserComponent } from './forms/admin/adduser/adduser.component';
import { UserprofileComponent } from './forms/user/userprofile/userprofile.component';
import { ChangepasswordComponent } from './forms/user/changepassword/changepassword.component';
import { UpdateprofileComponent } from './forms/user/updateprofile/updateprofile.component';


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
  {path : 'userslist/registration',component : RegistrationComponent},
  {path:'ipodetails/ipolist', component : IpolistComponent},
  {path : 'updateipo' , component : UpdateipoComponent},
  {path : 'stockexchange', component:StockexchangeComponent},
  {path : 'stocklist', component:StocklistComponent},
  {path : 'updatestockexchange', component : UpdatestockexchangeComponent},
  {path : 'comparecompany' , component : ComparecompanyComponent},
  {path : 'comparesector', component : ComparesectorComponent},
  {path :'viewipo', component : ViewipoComponent},
  {path : 'sector', component:SectorComponent},
  {path : 'sectorlist', component:SectorlistComponent},
  {path : 'updatesector', component:UpdatesectorComponent},
  {path : 'stockprice', component:StockpriceComponent},
  {path:'stockpricelist',component:StockpricelistComponent},
  {path:'updatestockprice', component:UpdatestockpriceComponent},
  {path :'activate', component: ActivateComponent},
  {path : 'contact', component:ContactComponent},
  {path: 'charts', component: ChartsComponent},
  {path:'sidenav',component:SidenavComponent},
  {path:'userslist/adduser', component:AdduserComponent},
  {path : 'adduser' , component : AdduserComponent},
  //  {path:"**", component:HomeComponent},
  {path:'logout' , component : LogoutComponent},
  {path:'userprofile',component:UserprofileComponent},
  {path : 'updateprofile', component:UpdateprofileComponent},
  {path:'changepassword', component:ChangepasswordComponent},
  {path:'viewipo/userprofile', component:UserprofileComponent}

];
  
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
