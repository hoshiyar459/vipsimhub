package store.vipsimhub.vipsimhub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "SimData")
@Data
@NoArgsConstructor
public class vipSimEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ; 

    private String MobileNumber ; 
    private String Operator ; 
    private String Type ; 
    private double Price ;
}
