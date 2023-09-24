import { Component, OnInit } from '@angular/core';
import * as csvtojson from 'csvtojson';
import { AddCustomersService } from '../add-customers.service';
import { Bill } from 'src/Model/Bill';
import { BillService } from '../bill.service';

@Component({
  selector: 'app-bulk-data',
  templateUrl: './bulk-data.component.html',
  styleUrls: ['./bulk-data.component.css']
})
export class BulkDataComponent implements OnInit {

  constructor(private service:BillService) { }

  ngOnInit(): void {
    this.getAllBills();
    
  }
  csvFile: File | null = null;
  jsonResult!: any;
  jsonArr:any

  onSend(){   

    this.jsonResult.forEach((element:any) => {
      //const customerId = <number>element.customerId;
      console.log(element)
      delete element.customerId;
      const jsonObj = {
        "unitsConsumed":element.unitsConsumed,
        "billDueDate":element.billDueDate,
        "customerId":element.customerId
      }
      console.log(jsonObj)
      this.service.postBulkData(jsonObj).subscribe((response)=>{
        console.log(response)
      },
      (error)=>{
        console.log("error"+ error)
      })
      
    });
    
  }

  postBulkData(){
    
  }

  onFileSelected(event: any) {
    this.csvFile = event.target.files[0];
  }

  convertCsvToJson() {
    if (this.csvFile) {
      const reader = new FileReader();

      reader.onload = (e: any) => {
        const csvData = e.target.result;
        csvtojson()
          .fromString(csvData)
          .then((jsonArray: any) => {
            this.jsonResult = jsonArray;
            console.log(this.jsonResult);
          });
      };
      reader.readAsText(this.csvFile);
    }
  }

  bills:any[]=[]

  getAllBills(){
    this.service.getAllBills().subscribe((response:any)=>{
      console.log(response)
      this.bills=response
    })
  }


}