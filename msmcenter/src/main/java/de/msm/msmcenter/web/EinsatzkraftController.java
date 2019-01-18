package de.msm.msmcenter.web;

import de.msm.msmcenter.dataacess.*;
import de.msm.msmcenter.model.entitiys.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/einsatzkraft")
public class EinsatzkraftController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    EinsatzkraftRepository einsatzkraftRepository;

    @Autowired
    BesetzungRepository besetzungRepository;

    @Autowired
    FlaechenRepository flaechenRepository;

    @Autowired
    ProjectVertragEinsatzkraftRepository  projektvertragEinsatzkraftRepository;

    @GetMapping("/dashboard")
    public String einsatzkraftDashboard(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        // Object user = auth.getPrincipal();
        // System.out.println(einsatzkraftRepository.findByid(6).get().getName());
        // model.addAttribute("einsatzkraft",einsatzkraftRepository.findByid(6));
        return "/einsatzkraft/dashboard";
    }

    @GetMapping("/kalender")
    public String einsatzkraftKalender(Model model) {
        return "/einsatzkraft/kalender";
    }

    @GetMapping("/pep")
    public String einsatzkraftPep(Model model,@AuthenticationPrincipal User user){
        Optional<Einsatzkraft> einsatzkraft = einsatzkraftRepository.findByUser(user);
        ArrayList<ProjektvertragEinsatzkraft> test = projektvertragEinsatzkraftRepository.findFlächeByEinsatzkraft(einsatzkraft.get());
        ArrayList<Fläche> flächen = new ArrayList<Fläche>();
        for (ProjektvertragEinsatzkraft projekte: test) {
           flächen.add(projekte.getFläche());
        }
        model.addAttribute("flaechen",flächen);
        return "/einsatzkraft/pep";
    }

    @GetMapping("/profil")
    public String einsatzkraftProfil(Model model,@AuthenticationPrincipal User user) {
        Optional<Einsatzkraft> einsatzkraft = einsatzkraftRepository.findByUser(user);
        model.addAttribute("einsatzkraft",einsatzkraft.get());
        return "/einsatzkraft/profil";
    }

    @RequestMapping(value="/kalender/events2", method=RequestMethod.GET)
    @ResponseBody
    public List<Besetzung> allEvents(@AuthenticationPrincipal User user) {
        Optional<Einsatzkraft> einsatzkraft = einsatzkraftRepository.findByUser(user);
        List<Besetzung> besetzungen = besetzungRepository.findAllByeinsatzkraftId((int)einsatzkraft.get().getId());
        for (Besetzung besetzung: besetzungen) {
            besetzung.setTitle(besetzung.getFläche().getRechnungskundeDifferenzierung().getRechnungskunde().getName());
           // besetzung.setDescription(besetzung.getFläche().getRechnungskundeDifferenzierung().getRechnungskunde().getOrt() + " " + besetzung.getFläche().getRechnungskundeDifferenzierung().getRechnungskunde().getStrasse());
            if(besetzung.getAnfrageVersendung()!=null) {
                if (besetzung.getAnfrageVersendung().equals("bestätigt"))
                    besetzung.setColor("green");
            } else {
                besetzung.setColor("red");
            }
        }
        return besetzungRepository.findAllByeinsatzkraftId((int)einsatzkraft.get().getId());
    }

    @GetMapping("/pep/get")
    public String getPep(Integer id){
        return "einsatzkraft/pepps";
    }

    @RequestMapping("/kalender/events")
    @ResponseBody
    public List<Besetzung> getKalenderEvents () {
        return null;
    }

    @PostMapping("/profil/safe")
    public String saveProfil (Einsatzkraft einsatzkraft,@AuthenticationPrincipal User user) {
        Optional<Einsatzkraft> einsatzkraftMomentan = einsatzkraftRepository.findByUser(user);
        einsatzkraftMomentan.get().getId();
        einsatzkraft.setId(einsatzkraftMomentan.get().getId());
        einsatzkraftRepository.save(einsatzkraft);
        return "/einsatzkraft/dashboard";
    }
}
