package maute.brothers.splitsquare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SplitService {

    private ExpenseRepository expenseRepository;

    private UserRepository userRepository;

    @Autowired
    public SplitService(ExpenseRepository expenseRepository, UserRepository userRepository){
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }



}
