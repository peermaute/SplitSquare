import { ComponentFixture, TestBed } from '@angular/core/testing';

import { expenseListComponent } from './expense-list.component';

describe('expenseListComponent', () => {
  let component: expenseListComponent;
  let fixture: ComponentFixture<expenseListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [expenseListComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(expenseListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
