package maute.brothers.splitsquare.users;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class AdminUser {

    @Id
    private String id;

    private String firebaseId;
}
