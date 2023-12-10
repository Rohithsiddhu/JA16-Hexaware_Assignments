import { Component,OnInit } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'frontend';
  IndiaDet!:FormGroup ;
  userid :any = 502;

  constructor(private fb:FormBuilder,private http:HttpClient){}

  ngOnInit() {
      this.IndiaDet = this.fb.group({
        playerID:[0],
        playerName: ['', Validators.required],
        jerserNumber: ['', Validators.required],
        role: ['', Validators.required],
        totalMatches: ['', Validators.required],
        teamName: ['', Validators.required],
        countryName: ['', Validators.required],
        description: ['', Validators.required]
          // Add the remaining fields (field2 to field7) here
        });
    
  }
  submitForm(){
    const data = {
      // playerID:0,
      playerName:this.IndiaDet.value["playerName"],
      jerserNumber:this.IndiaDet.value["jerserNumber"],
      role:this.IndiaDet.value["role"],
      totalMatches:this.IndiaDet.value["totalMatches"],
      teamName:this.IndiaDet.value["teamName"],
      countryName:this.IndiaDet.value["countryName"],
      description:this.IndiaDet.value["description"],
    }
    
    console.log(data,"Testing")
    

    const apiurl = `http://localhost:8080/api/players/put/502`

    this.http.put(apiurl,data).subscribe((res)=>{
      console.log(res)
      alert("Updated Succesfully")
    })
    
  }
}
