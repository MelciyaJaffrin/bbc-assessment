import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  id: any = "admin"
  pass: any = "123"
  message:string="";

  onClick(username: any, password: any) {
    if (username === this.id && password === this.pass) {
      this.message = "Login Successful";
    } else {
      this.message = "Login Failed";
    }
  }

}
