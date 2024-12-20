package store.vipsimhub.vipsimhub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "check")
@Data   
public class checkEntity {

    @Id
    String name;
    String age ; 
    String password ; 
}
