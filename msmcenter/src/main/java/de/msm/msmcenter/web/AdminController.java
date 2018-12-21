package de.msm.msmcenter.web;


import de.msm.msmcenter.dataacess.BesetzungRepository;
import de.msm.msmcenter.dataacess.EinsatzkraftRepository;
import de.msm.msmcenter.dataacess.LeistungskundeRepository;
import de.msm.msmcenter.dataacess.UserRepository;
import de.msm.msmcenter.model.entitiys.Besetzung;
import de.msm.msmcenter.model.entitiys.Einsatzkraft;
import de.msm.msmcenter.model.entitiys.Leistungskunde;
import de.msm.msmcenter.model.entitiys.User;
import de.msm.msmcenter.service.EinsatzkraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.xml.transform.ErrorListener;
import java.io.IOException;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EinsatzkraftRepository einsatzkraftRepository;

    @Autowired
    BesetzungRepository besetzungRepository;

    @Autowired
    LeistungskundeRepository leistungskundeRepository;
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        return "/admin/dashboard";
    }

    @GetMapping("/leistungskunden")
    public String adminLK(Model model) {
        return "/admin/hinzufuegen/LKAccount";
    }

    @PostMapping("/LKerstellen")
    public String addLK(User user, Model model) {
        userRepository.save(user);
        return "/admin/hinzufuegen/LKAccount";
    }

    @GetMapping("/erstellen")
    public String erstelleBesetzung(Model model) {
        for(int i = 685;i<1500;i++){
            Besetzung besetzung = new Besetzung();
            besetzung.setId(i);
            besetzungRepository.save(besetzung);
        }
        return "/admin/dashboard";
    }
    @GetMapping("/getData")
    public String getData(Model model){
        model.addAttribute("data",besetzungRepository.findAllByeinsatzkraftId(1));
        return "/admin/data";
    }

    @GetMapping("/hinzufuegen/LKAccount")
    public String addAcc(){
        return "/admin/hinzufuegen/LKAccount";
    }

    @GetMapping("/hinzufuegen/einsatzkraft")
    public String addEinsatzrkraft(){
        return "admin/hinzufuegen/Einsatzkraft";
    }

    @GetMapping("/hinzufuegen/user")
    public String addUser(){
        return "/admin/hinzufuegen/user";
    }

    @PostMapping("/hinzufuegen/user/add")
    public String addUserGet (Model model,User user) {
        try{
            userRepository.save(user);
        } catch (Exception e){
            model.addAttribute("error","error");
            return "/admin/hinzufuegen/user";
        }
        return "/dashboard";
    }

    @RequestMapping("/hinzufuegen/leistungskunde")
    public String leistungskunde(){
        return "/admin/hinzufuegen/Leistungskunde";
    }

    @PostMapping("hinzufuegen/leistungskunde/add")
    public String leinstungskundeHinzufuegen(Leistungskunde leistungskunde){
        leistungskundeRepository.save(leistungskunde);
        return "/admin/dashboard";
    }

    @RequestMapping("/hinzufuegen/einsatzkraft/festangestellte")
    public String testst(){
        return "/admin/hinzufuegen/Einsatzkraft";
    }
    @PostMapping("/hinzufuegen/einsatzkraft/freelancer")
    public String addFreelancer(Einsatzkraft einsatzkraft) {
        einsatzkraftRepository.save(einsatzkraft);
        EinsatzkraftService use = new EinsatzkraftService(einsatzkraft);
        User user = use.generateUser();
        einsatzkraft.setUser(user);
        userRepository.save(user);
        einsatzkraftRepository.save(einsatzkraft);
        return "/admin/dashboard";
        }

}
