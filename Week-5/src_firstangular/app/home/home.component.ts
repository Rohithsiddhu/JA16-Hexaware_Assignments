import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  template: `<h1>welcome to home<h1>`,
  styles: [`h1{:color:green}`]
})
export class HomeComponent implements OnInit 
{

   public constructor()
   {     

    console.log("this is home constructor");
   }


  ngOnInit(): void {

    console.log("this is ngonit");
    
  }

}
