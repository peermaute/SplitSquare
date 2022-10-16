import { ComponentFixture, TestBed } from '@angular/core/testing';

import { expenseItemComponent } from './expense-item.component';

describe('expenseItemComponent', () => {
  let component: expenseItemComponent;
  let fixture: ComponentFixture<expenseItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [expenseItemComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(expenseItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
