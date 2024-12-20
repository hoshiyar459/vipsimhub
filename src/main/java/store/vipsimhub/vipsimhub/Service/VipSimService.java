package store.vipsimhub.vipsimhub.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import store.vipsimhub.vipsimhub.Entity.vipSimEntity;
import store.vipsimhub.vipsimhub.Repository.VipSimRepo;

@Component
public class VipSimService {

    @Autowired
    private VipSimRepo simRepo;

    public void CreateSimCard(vipSimEntity SimCard){
         simRepo.save(SimCard);
    }

    public List<vipSimEntity> GetAllSimCard(vipSimEntity SimCard){
         return simRepo.findAll(); 
    }
}
