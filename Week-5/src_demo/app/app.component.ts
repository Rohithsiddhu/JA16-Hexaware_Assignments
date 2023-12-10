import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{

  //datalist:string[]=["html","mysql","spring","java"]
  id:any="";
  myname:string='';
 
  readFormData(data:any)
{
  console.log(data.form.value)
}

  
}
