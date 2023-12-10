import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppService
 {
     
    data=[
      {"pid":78,"pname":"mobile","price":9000},
      {"pid":79,"pname":"laptop","price":89000},
      {"pid":80,"pname":"charger","price":3000}
    ]

  constructor() { }
  

  getAllData():any
  {

    return this.data;
  }
}
