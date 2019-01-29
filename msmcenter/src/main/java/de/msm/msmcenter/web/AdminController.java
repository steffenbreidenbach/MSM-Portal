package de.msm.msmcenter.web;


import de.msm.msmcenter.dataacess.*;
import de.msm.msmcenter.model.entitiys.*;
import de.msm.msmcenter.model.entitiys.Fläche;
import de.msm.msmcenter.service.EinsatzkraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.*;

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

    @Autowired
    RechnungskundeRepository rechnungskundeRepository;

    @Autowired
    RechnungskundeDifferenzierungRepository rechnungskundeDifferenzierungRepository;

    @Autowired
    FlaechenRepository flaechenRepository;

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        return "admin/dashboard";
    }

    @GetMapping("/leistungskunden")
    public String adminLK(Model model) {
        return "admin/hinzufuegen/LKAccount";
    }

    @PostMapping("/LKerstellen")
    public String addLK(User user, Model model) {
        userRepository.save(user);
        return "admin/hinzufuegen/LKAccount";
    }

    @GetMapping("/erstellen")
    public String erstelleBesetzung(Model model) {
        for (int i = 685; i < 1500; i++) {
            Besetzung besetzung = new Besetzung();
            besetzung.setId(i);
            besetzungRepository.save(besetzung);
        }
        return "admin/dashboard";
    }

    @GetMapping("/getData")
    public String getData(Model model) {
        model.addAttribute("data", besetzungRepository.findAllByeinsatzkraftId(1));
        return "admin/data";
    }

    @GetMapping("/hinzufuegen/LKAccount")
    public String addAcc() {
        return "admin/hinzufuegen/LKAccount";
    }

    @GetMapping("/hinzufuegen/einsatzkraft")
    public String addEinsatzrkraft() {
        return "admin/hinzufuegen/Einsatzkraft";
    }

    @GetMapping("/hinzufuegen/user")
    public String addUser() {
        return "admin/hinzufuegen/user";
    }

    @PostMapping("/hinzufuegen/user/add")
    public String addUserGet(Model model, User user) {
        try {
            userRepository.save(user);
        } catch (Exception e) {
            model.addAttribute("error", "error");
            return "admin/hinzufuegen/user";
        }
        return "dashboard";
    }

    @RequestMapping("/hinzufuegen/leistungskunde")
    public String leistungskunde() {
        return "admin/hinzufuegen/Leistungskunde";
    }

    @PostMapping("hinzufuegen/leistungskunde/add")
    public String leinstungskundeHinzufuegen(Leistungskunde leistungskunde) {
        leistungskundeRepository.save(leistungskunde);
        return "admin/dashboard";
    }

    @RequestMapping("/hinzufuegen/rechnungskunde")
    public String rechnungskunde() {
        return "admin/hinzufuegen/rechnungskunde";
    }

    @PostMapping("/hinzufuegen/rechnungskunde/add")
    public String rechnungskundeAdd(Rechnungskunde rechnungskunde) {
        rechnungskundeRepository.save(rechnungskunde);
        return "admin/dashboard";
    }

    @RequestMapping("/hinzufuegen/einsatzkraft/festangestellte")
    public String testst() {
        return "admin/hinzufuegen/Einsatzkraft";
    }

    @RequestMapping("/hinzufuegen/leistungskundeAk")
    public String leistungskundeAk() {
        return "admin/hinzufuegen/Leistungskunde";
    }


    @PostMapping("/hinzufuegen/einsatzkraft/freelancer")
    public String addFreelancer(Einsatzkraft einsatzkraft) {
        einsatzkraftRepository.save(einsatzkraft);
        EinsatzkraftService use = new EinsatzkraftService(einsatzkraft);
        User user = use.generateUser();
        einsatzkraft.setUser(user);
        userRepository.save(user);
        einsatzkraftRepository.save(einsatzkraft);
        return "admin/dashboard";
    }


    @RequestMapping(value = "/suggestion", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Leistungskunde> autocompleteSuggestions(@RequestParam("searchstr") String searchstr) {
        List<Leistungskunde> suggestions = leistungskundeRepository.findByNameContains(searchstr);
        // truncate the list to the first n, max 20 elements
        int n = suggestions.size() > 20 ? 20 : suggestions.size();
        List<Leistungskunde> sulb = new ArrayList<>(suggestions.subList(0, n));
        return sulb;
    }

    @RequestMapping("/suchen/leistungskunden")
    public String leistungskundenSuchen(Model model) {
        model.addAttribute("leistungskunden", leistungskundeRepository.findAll());
        return "admin/suchen/leistungskunden";
    }

    @RequestMapping("/suchen/einsatzkraft")
    public String einsatzkraftSuche(Model model) {
        model.addAttribute("einsatzkraefte", einsatzkraftRepository.findAll());
        return "admin/suchen/einsatzkraft";
    }

    @RequestMapping("/suchen/rechnungskunden")
    public String rechnungskundenSuchen(Model model) {
        model.addAttribute("rechnungskunden", rechnungskundeRepository.findAll());
        return "admin/suchen/rechnungskunden";
    }

    @RequestMapping("/suchen/admin/rechnungskundendetails")
    public String rechnungskundenSuchen(Integer rechnungskundeID, Model model) {
        model.addAttribute("rechnungskunde", rechnungskundeRepository.findById(rechnungskundeID).get());
        return "admin/rechnungskundendetails/rechnungskundendetails";
    }

    @RequestMapping("/testen")
    public String testen() {
        return "admin/pep";
    }

    @RequestMapping("/pep")
    public String pep(){
        return "admin/pep";
    }

    @RequestMapping(value = "/kalender/events", method = RequestMethod.GET)
    @ResponseBody
    public List<Besetzung> allEvents(int yeahr,int month) {
        Date date = new Date(yeahr-1900,month,1);
        Date date2 = new Date(yeahr-1900,month,30);
        System.out.println(date2);
        System.out.println(besetzungRepository.findAllByFlächeIdAndStartGreaterThanAndEndLessThan(1, date,date2));
       // return besetzungRepository.findAllByFlächeIdAndStartGreaterThanAndEndLessThan(1, date, date);
        return besetzungRepository.findAllByFlächeIdAndStartGreaterThanAndEndLessThan(1, date,date2);
    }

    @RequestMapping(value = "/kalender/fläche", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Fläche> flaecheInformationen() {
        return flaechenRepository.findById(1);
    }

    @GetMapping("/suchen/flaechen")
    public String searchAllFlaechen(Model model){
        model.addAttribute("flaechen",flaechenRepository.findAll());
        return "admin/suchen/flaechen";
    }

    @RequestMapping("/admin/profil")
    public String adminProfil(Model model) {
        return "admin/profil";
    }


    @RequestMapping(value = "/hinzufuegen/besetzung" , method = RequestMethod.POST)
    public String besetzungHinzufuegen(Model model,Besetzung besetzung){
        besetzungRepository.save(besetzung);
        return "admin/dashboard";
    }
}



