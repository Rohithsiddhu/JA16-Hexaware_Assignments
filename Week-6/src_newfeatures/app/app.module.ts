import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemoComponent } from './demo/demo.component';
import { TestComponent } from './test/test.component';
import { HelloComponent } from './hello/hello.component';

@NgModule({
  declarations: [
    AppComponent,
    DemoComponent,
    TestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HelloComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
