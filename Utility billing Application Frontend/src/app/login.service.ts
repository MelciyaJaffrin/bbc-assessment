import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }
  
  url=""
  generateOtp(employeeId:number){
  const params = { employeeId: employeeId.toString() };
    return this.http.post(`http://localhost:9090/login/generate-otp/${employeeId}`, null);
  }

  loginEmployee(obj:any){
    return this.http.post(`http://localhost:9090/login/login`,obj);
  }

  addEmployee(obj:any){
    return this.http.post(`http://localhost:9090/employee/addemployee`,obj);
  }

  
  }
    

