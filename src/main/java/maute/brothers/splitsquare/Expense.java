package maute.brothers.splitsquare;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Expense {

    @Id
    private String id;

    private List<User> associatedUsers;

    private double amount;

    private User payingUser;

}
