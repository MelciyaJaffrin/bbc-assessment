import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  constructor(private http:HttpClient) { }

  getTransactionsUrl="http://localhost:9090/transaction/getAllTransactions";

  getAllTransactions(){
    return this.http.get(this.getTransactionsUrl);
  }
}
