package maute.brothers.splitsquare;

import maute.brothers.splitsquare.expenses.Expense;
import maute.brothers.splitsquare.expenses.ExpenseRepository;
import maute.brothers.splitsquare.expenses.ExpenseService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class ExpenseServiceTests {

    @Autowired
    ExpenseService expenseService;

    @Autowired
    ExpenseRepository expenseRepository;

    Expense expense;

    @BeforeEach
    void setUp(){
        expense = new Expense();
        expenseRepository.save(expense);
    }

    @AfterEach
    void cleanUp(){
        expenseRepository.delete(expense);
    }

    @Test
    void testGetExpense(){
        Optional<Expense> repExpense = expenseRepository.findById(expense.getId());
        if(repExpense.isEmpty()){
            fail();
        }
        assertEquals(repExpense.get(), expenseService.getExpense(expense.getId()));
    }
}
