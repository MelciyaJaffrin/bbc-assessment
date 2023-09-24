import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { ClassBindingComponent } from './class-binding/class-binding.component';
import { LoginComponent } from './login/login.component';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import { SignupComponent } from './signup/signup.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { BillComponent } from './bill/bill.component';
import { PaymentDetailsComponent } from './payment-details/payment-details.component';
import { HomeComponent } from './home/home.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { BulkDataComponent } from './bulk-data/bulk-data.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    ClassBindingComponent,
    LoginComponent,
    EmployeeLoginComponent,
    SignupComponent,
    AddCustomerComponent,
    CustomerDetailsComponent,
    BillComponent,
    PaymentDetailsComponent,
    HomeComponent,
    EmployeeDetailsComponent,
    BulkDataComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
