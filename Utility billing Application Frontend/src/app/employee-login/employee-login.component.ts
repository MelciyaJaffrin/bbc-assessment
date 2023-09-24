import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-employee-login',
  templateUrl: './employee-login.component.html',
  styleUrls: ['./employee-login.component.css']
})
export class EmployeeLoginComponent implements OnInit {

  constructor(private service:LoginService) { }

  ngOnInit(): void {
  }

  onLogin(id:any,otp:any){
    this.service.loginEmployee({ "id": id, "otp": otp }).subscribe((response)=>{
      console.log(response);
    })
  }

  generateOtp(id:any){
    this.service.generateOtp(id as number).subscribe((response) => {
      console.log(response);
    })

  }

}
