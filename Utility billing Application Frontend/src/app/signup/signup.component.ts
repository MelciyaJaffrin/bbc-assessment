import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { NgModel } from '@angular/forms';
import { NgForm } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private service:LoginService, 
    private router:Router) { }

  ngOnInit(): void {
  }
  
  message:string="";

  addEmployee(id:any,name:any,email:any,phone:any){
    const jsonObj={
      employeeId:id,
      employeeName:name,
      email:email,
      mobile:phone

    }

    this.service.addEmployee(jsonObj).subscribe((response)=>{
      console.log(response)
      this.message="Account Created";
    },(error)=>{
      alert("Account Created");
    })

  }

}
