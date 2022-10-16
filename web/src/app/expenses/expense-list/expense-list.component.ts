import { Component, OnInit } from '@angular/core';
import { Expense } from '../expense.model';

@Component({
  selector: 'app-expense-list',
  templateUrl: './expense-list.component.html',
  styleUrls: ['./expense-list.component.scss'],
})
export class expenseListComponent implements OnInit {
  expenses: Expense[] = [
    new Expense('Einkauf', 12.49),
    new Expense('Neue Skier', 129.99),
  ];

  constructor() {}

  ngOnInit(): void {}
}
