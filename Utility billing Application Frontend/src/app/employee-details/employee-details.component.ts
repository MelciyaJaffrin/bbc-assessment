import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  constructor(private service:EmployeeService) { }

  ngOnInit(): void {
    this.getAllEmployees(); 
  }

  employees:any[]=[]

  getAllEmployees(){
    this.service.getAllEmployees().subscribe((response:any)=>{
      console.log(response)
      this.employees=response
    })
  }

}

