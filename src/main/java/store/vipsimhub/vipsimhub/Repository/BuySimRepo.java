package store.vipsimhub.vipsimhub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import store.vipsimhub.vipsimhub.Entity.BuySimEntity;

@Component
public interface BuySimRepo extends JpaRepository<BuySimEntity , Integer> {
    
}
