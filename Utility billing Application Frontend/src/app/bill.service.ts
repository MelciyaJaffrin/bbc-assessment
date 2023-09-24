import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BillService {

  constructor(private http:HttpClient) { }

  bulkDataUrl="http://localhost:9090/bill/newbill";
  postBulkData(csvData:any){
    return this.http.post(this.bulkDataUrl,csvData)
  }

  getBillUrl="http://localhost:9090/bill/getAllBills";

  getAllBills(){
    return this.http.get(this.getBillUrl);
  }

  url="";
  addBill(obj:any){
    return this.http.post(`http://localhost:9090/bill/newbill`,obj);
  }

}
