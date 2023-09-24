import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BillService } from '../bill.service';

@Component({
  selector: 'app-bill',
  templateUrl: './bill.component.html',
  styleUrls: ['./bill.component.css']
})
export class BillComponent implements OnInit {

  constructor(private service:BillService,private router:Router) { }

  ngOnInit(): void {
  }

  message:string="";

  addBill(customerId:any,billId:any,unitsConsumed:any,dueDate:any){
    const jsonObj={
      customerId:customerId,
      billId:billId,
      unitsConsumed:unitsConsumed,
      billDueDate:dueDate,
    }

    this.service.addBill(jsonObj).subscribe((response)=>{
      console.log(response)
      this.message="Bill Created";
    },(error)=>{
      alert("Bill created");
    })

  }

}
