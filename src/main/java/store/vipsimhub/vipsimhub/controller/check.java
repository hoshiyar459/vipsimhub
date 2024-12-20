package store.vipsimhub.vipsimhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import store.vipsimhub.vipsimhub.Entity.vipSimEntity;
import store.vipsimhub.vipsimhub.Service.VipSimService;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class check {
    

     @Autowired 
     private VipSimService vipSimService ; 

     @GetMapping
     public String home(){
         return "home";
     }


     @GetMapping("/add")
     public String addSimCard(Model model){
          model.addAttribute("Simadd", new vipSimEntity());
          return "addSimCard";
     }

     @PostMapping("/add")
     public String addSimCard(@ModelAttribute("Simadd") vipSimEntity simEntity , Model model ) {

     
          vipSimService.CreateSimCard(simEntity);

         List allSimCard = vipSimService.GetAllSimCard(simEntity);
         model.addAttribute("allSimCard", allSimCard);

            return "home";
     }
     
}
