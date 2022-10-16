package maute.brothers.splitsquare.expenses;

import lombok.Getter;
import lombok.Setter;
import maute.brothers.splitsquare.users.User;
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

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Expense expense)){
            return false;
        }
        return expense.getId().equals(this.id);
    }
}
