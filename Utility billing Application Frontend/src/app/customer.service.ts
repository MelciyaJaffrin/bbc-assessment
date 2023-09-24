import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  getCustomerUrl="http://localhost:9090/customer/getAllCustomers";

  getAllCustomers(){
    return this.http.get(this.getCustomerUrl);
  }
}
