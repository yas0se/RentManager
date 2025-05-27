package com.gestion.g1.controllers;

import com.gestion.g1.models.Objet;
import com.gestion.g1.services.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
        String messageController = "L'objet : "+ temp.getNomObjet() +" est ajouté avec sucsée.";
        modelMap.addAttribute("messageJsp", messageController);
        return "CreateObjet";
    }

    @RequestMapping("/objetList")
    public String objetList(ModelMap modelMap) {

        List<Objet> objets = objectService.getAllObjet();
        modelMap.addAttribute("ObjetList", objets);
        return "ObjetList";
    }

    @RequestMapping("/delateObjet")
    public String delateObjet(@RequestParam("id") Long id, ModelMap modelMap) {

        objectService.deleteObjectById(id);
        List<Objet> objets = objectService.getAllObjet();
        modelMap.addAttribute("ObjetList", objets);
        return "ObjetList";
    }

    @RequestMapping("/displayObjet")
    public String displayObjet(@RequestParam("id") Long id, ModelMap modelMap) {
        Objet objetController = objectService.getObjet(id);
        modelMap.addAttribute("ObjetDisplay", objetController);
        return "ModifierObjet";
    }

    @RequestMapping("/modifierObjet")
    public String modifierObjet(
            @ModelAttribute("objet") Objet objet,
            ModelMap modelMap) {
        objectService.updateObjet(objet);
        List<Objet> objets = objectService.getAllObjet();
        modelMap.addAttribute("ObjetList", objets);
        return "ObjetList";
    }
    @RequestMapping("/")
    public String home(){
        return "redirect:/objetList";
    }

}
