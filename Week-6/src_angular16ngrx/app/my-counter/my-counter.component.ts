import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { decrement, increment, reset } from '../actions/counter.action';

@Component({
  selector: 'app-my-counter',
  templateUrl: './my-counter.component.html',
  styleUrls: ['./my-counter.component.css']
})
export class MyCounterComponent {
  count$: Observable<number>=new Observable();
 
  constructor(private store: Store<{ count: number }>) {
    this.count$ = store.select('count');
  }
 
  increment() {
    console.log('increment() is called');
    this.store.dispatch(increment());
  }
 
  decrement() {
    console.log('decrement() is called');
    this.store.dispatch(decrement());
  }
 
  reset() {
    console.log('reset() is called');
    this.store.dispatch(reset());
  }

}
