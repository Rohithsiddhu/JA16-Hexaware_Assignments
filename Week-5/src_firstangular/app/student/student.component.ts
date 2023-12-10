import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit
 {
 
    sid:number=0;
     sname:string="";
    dob:Date=new Date();

    items:any=["apple","guava","grape","orange"]
    imageURL="../../assets/moon.jpeg";
     
    course:string='';
    
    mycolor ="pink";
    studentList=[
      
      {"id":101,"sname":"madhu","fee":9000},
      {"id":102,"sname":"padma","fee":7000},
      {"id":103,"sname":"rohi","fee":5000},
      {"id":104,"sname":"lucky","fee":94000}
    
    
    ]


    ngOnInit(): void 
    {
      this.sid=101;
      this.sname="madhuri";
    }

    getData()
    {
      alert(this.sid+" " +this.sname)
    }


    isValid()
    {
      return true;
    }

}
