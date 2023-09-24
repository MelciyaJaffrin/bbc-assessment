import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { BillComponent } from './bill/bill.component';
import { PaymentDetailsComponent } from './payment-details/payment-details.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { BulkDataComponent } from './bulk-data/bulk-data.component';

const routes: Routes = [
  {
    path:"",component:EmployeeLoginComponent
  },
  {
    path:"signup",component:SignupComponent
  },
  {
    path:"home",component:HomeComponent
  },
  {
    path:"add-customer",component:AddCustomerComponent
  },
  {
    path:"customer-details",component:CustomerDetailsComponent
  },
  {
    path:"bulkdata",component:BulkDataComponent
  },
  {
    path:"bill",component:BillComponent
  },
  {
    path:"payment",component:PaymentDetailsComponent
  },
  {
    path:"employee-details",component:EmployeeDetailsComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
