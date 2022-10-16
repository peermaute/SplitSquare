package maute.brothers.splitsquare;

import maute.brothers.splitsquare.expenses.Expense;
import maute.brothers.splitsquare.expenses.ExpenseNotFoundException;
import maute.brothers.splitsquare.expenses.ExpenseRepository;
import maute.brothers.splitsquare.expenses.ExpenseService;
import maute.brothers.splitsquare.users.UserRepository;
import maute.brothers.splitsquare.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SplitService {

    private ExpenseService expenseService;

    private UserService userService;

    @Autowired
    public SplitService(ExpenseService expenseService, UserService userService){
        this.expenseService = expenseService;
        this.userService = userService;
    }



}
