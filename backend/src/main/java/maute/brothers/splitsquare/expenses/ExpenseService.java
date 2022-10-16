package maute.brothers.splitsquare.expenses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseService {

    ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public Expense getExpense(String id) {
        if(id == null){
            throw new IllegalArgumentException("Id must not be null!");
        }
        Optional<Expense> expense = expenseRepository.findById(id);
        if(expense.isEmpty()){
            throw new ExpenseNotFoundException("No expense found with the given id");
        }
        return expense.get();
    }
}
