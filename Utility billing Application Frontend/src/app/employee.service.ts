import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }

  getEmployeesUrl="http://localhost:9090/employee/getallemployees";

  getAllEmployees(){
    return this.http.get(this.getEmployeesUrl);
  }
}
