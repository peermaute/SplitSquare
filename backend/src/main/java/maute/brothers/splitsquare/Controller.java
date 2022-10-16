package maute.brothers.splitsquare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller creates a REST API to access the SplitSquare database.
 */
@CrossOrigin("*")
@RestController
public class Controller {

    SplitService splitservice;

    @Autowired
    public Controller(SplitService splitservice){
        this.splitservice = splitservice;
    }

}
