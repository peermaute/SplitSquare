import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { expensesComponent } from './expenses/expenses.component';
import { expenseListComponent } from './expenses/expense-list/expense-list.component';
import { expenseItemComponent } from './expenses/expense-list/expense-item/expense-item.component';

@NgModule({
  declarations: [
    AppComponent,
    expensesComponent,
    expenseListComponent,
    expenseItemComponent,
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
