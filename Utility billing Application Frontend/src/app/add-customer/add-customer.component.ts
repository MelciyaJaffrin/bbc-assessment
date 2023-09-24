import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AddCustomersService } from '../add-customers.service';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {

  constructor(private service:AddCustomersService,private router:Router) { }

  ngOnInit(): void {
  }

  message:string="";

  addCustomer(id:any,name:any,address:any,email:any,phone:any){
    const jsonObj={
      customerId:id,
      customerName:name,
      address:address,
      email:email,
      telephone:phone

    }

    this.service.addCustomer(jsonObj).subscribe((response)=>{
      console.log(response)
      this.message="Account Created";
    },(error)=>{
      alert("Customer Created");
    })

  }

}
