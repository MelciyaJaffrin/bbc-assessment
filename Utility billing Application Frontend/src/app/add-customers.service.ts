import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AddCustomersService {

  constructor(private http:HttpClient) { }

  uploUrl="http://localhost:9090/bill/insertBill"

  uploadData(jsonObj:any){
    return this.http.post(this.uploUrl,jsonObj);
  }

  url="";
  addCustomer(obj:any){
    return this.http.post(`http://localhost:9090/customer/addCustomers`,obj);
  }


}
