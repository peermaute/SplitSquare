package maute.brothers.splitsquare;

import maute.brothers.splitsquare.expenses.Expense;
import maute.brothers.splitsquare.expenses.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * This controller creates a REST API to access the SplitSquare database.
 */
@CrossOrigin("*")
@RestController
public class Controller {

    SplitService splitservice;

    ExpenseService expenseService;

    @Autowired
    public Controller(SplitService splitservice, ExpenseService expenseService){
        this.splitservice = splitservice;
        this.expenseService = expenseService;
    }

    /**
     * Returns the expense with the given id.
     */
    @GetMapping(path = "/expense/{id}")
    public ResponseEntity<?> getExpense(@PathVariable String id){
        try{
            Expense expense = expenseService.getExpense(id);
            return new ResponseEntity<>(expense, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>("GET Request failed:\n" + e, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/test")
    public String test(Principal principal) {
        return principal.getName();
    }

}
