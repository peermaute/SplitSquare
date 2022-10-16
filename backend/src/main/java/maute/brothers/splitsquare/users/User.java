package maute.brothers.splitsquare.users;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class User {

    @Id
    private String id;

    private String surname;

    private String firstName;

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof User user)){
            return false;
        }
        return user.getId().equals(this.id);
    }
}
