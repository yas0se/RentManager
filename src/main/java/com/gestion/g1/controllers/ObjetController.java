package com.gestion.g1.controllers;

import com.gestion.g1.models.Objet;
import com.gestion.g1.services.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ObjetController {
    @Autowired
    ObjectService objectService;

    @RequestMapping("/createObjet")
    public String createObjet() {
        return "CreateObjet";
    }

    @RequestMapping("/saveObjet")
    public String saveObjet(
            @ModelAttribute("objet") Objet objet,
            ModelMap modelMap) {
        Objet temp = objectService.saveObjet(objet);
        String messageController = "L'objet : "+ temp.getName() +" est ajouté avec sucsée.";
        modelMap.addAttribute("messageJsp", messageController);
        return "CreateObjet";
    }

}
