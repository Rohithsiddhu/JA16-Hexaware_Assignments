import { Component } from '@angular/core';
import { EmployeeService } from '../employee/employee.service';
import { Employee } from '../employee/employee';

@Component({
  selector: 'app-getbyid',
  templateUrl: './getbyid.component.html',
  styleUrls: ['./getbyid.component.css']
})
export class GetbyidComponent {
  
  constructor(private service:EmployeeService){}

  
  getFormData(data:Employee){

    console.log('getting data for emp : '+data.ename)

    this.service.getbyId(data);


}
}
