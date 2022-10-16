import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BillsComponent } from './bills/bills.component';
import { BillListComponent } from './bills/bill-list/bill-list.component';
import { BillItemComponent } from './bills/bill-list/bill-item/bill-item.component';

@NgModule({
  declarations: [
    AppComponent,
    BillsComponent,
    BillListComponent,
    BillItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
