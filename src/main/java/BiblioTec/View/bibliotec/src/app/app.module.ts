import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TableSortingExample } from './table/table-sorting-example'

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    TableSortingExample
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
