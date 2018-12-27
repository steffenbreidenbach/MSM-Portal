package de.msm.msmcenter.web;

import de.msm.msmcenter.dataacess.BesetzungRepository;
import de.msm.msmcenter.dataacess.EinsatzkraftRepository;
import de.msm.msmcenter.dataacess.UserRepository;
import de.msm.msmcenter.model.entitiys.Besetzung;
import de.msm.msmcenter.model.entitiys.Einsatzkraft;
import de.msm.msmcenter.model.entitiys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String einsatzkraftPep(Model model) {
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
}
