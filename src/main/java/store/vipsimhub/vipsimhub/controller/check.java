package store.vipsimhub.vipsimhub.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import store.vipsimhub.vipsimhub.Entity.BuySimEntity;
import store.vipsimhub.vipsimhub.Repository.BuySimRepo;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class check {
 
    @Autowired
    private BuySimRepo buySimRepo ;

     @GetMapping
     public String home(){
         return "index";
     }
     
    @GetMapping("/list")
    public String list() {
        return "list";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/policy")
    public String policy() {
        return "policy";
    }
    @GetMapping("/buy")
    public String buy( Model model ) {
         model.addAttribute("buyingDetails" , new BuySimEntity());
        return "buy";
    }

    @GetMapping("/paymentGateway")
    public String paymentGateway(@ModelAttribute("buyingDetails") BuySimEntity simEntity){
          buySimRepo.save(simEntity);
         return "paymentGateway";
    }

  


}
