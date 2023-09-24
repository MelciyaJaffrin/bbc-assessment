import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  constructor(private service:CustomerService) { }

  ngOnInit(): void {
    this.getAllCustomers();
  }

  customers:any[]=[]

  getAllCustomers(){
    this.service.getAllCustomers().subscribe((response:any)=>{
      console.log(response)
      this.customers=response
    })
  }

}
