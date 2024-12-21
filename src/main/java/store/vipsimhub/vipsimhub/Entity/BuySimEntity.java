package store.vipsimhub.vipsimhub.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="UserTransactions")
@Data
@NoArgsConstructor
public class BuySimEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id ; 

        private String FullName ; 
        private String Email ; 
        private int Number ;
        private String Address ; 
        private String City ; 
        private String State ; 
        private int PinCode ; 
         private LocalDateTime date ; 
}
