import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'webapp';

productList:any=[];
  salary:number=99000;
mydate:Date=new Date();

constructor( private service:AppService)
{

}
  ngOnInit(): void
   {
   //this.getAllProducts();
  }
getAllProducts()
{
  this.productList= this.service.getAllData();
}


}
