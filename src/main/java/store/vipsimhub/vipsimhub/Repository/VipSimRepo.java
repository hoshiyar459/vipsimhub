package store.vipsimhub.vipsimhub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import store.vipsimhub.vipsimhub.Entity.vipSimEntity;

@Component
public interface VipSimRepo extends JpaRepository<vipSimEntity , Integer> {
}
