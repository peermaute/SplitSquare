package maute.brothers.splitsquare;

import maute.brothers.splitsquare.expenses.Expense;
import maute.brothers.splitsquare.expenses.ExpenseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MongoDbTests {

    @Autowired
    ExpenseRepository expenseRepository;

    @Test
    void testConnection(){
        Expense expense = new Expense();
        expenseRepository.save(expense);
        assertTrue(expenseRepository.findById(expense.getId()).isPresent());
        expenseRepository.delete(expense);
    }
}
