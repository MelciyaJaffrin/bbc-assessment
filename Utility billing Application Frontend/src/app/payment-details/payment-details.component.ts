import { Component, OnInit } from '@angular/core';
import { PaymentService } from '../payment.service';

@Component({
  selector: 'app-payment-details',
  templateUrl: './payment-details.component.html',
  styleUrls: ['./payment-details.component.css']
})
export class PaymentDetailsComponent implements OnInit {

  constructor(private service:PaymentService) { }

  ngOnInit(): void {
    this.getAllTransactions();
  }

  transactions:any[]=[]

  getAllTransactions(){
    this.service.getAllTransactions().subscribe((response:any)=>{
      console.log(response)
      this.transactions=response
    })
  }

}
