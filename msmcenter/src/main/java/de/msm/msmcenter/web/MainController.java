package de.msm.msmcenter.web;


import de.msm.msmcenter.dataacess.BesetzungRepository;
import de.msm.msmcenter.dataacess.EinsatzkraftRepository;
import de.msm.msmcenter.dataacess.UserRepository;

import de.msm.msmcenter.model.entitiys.Besetzung;
import de.msm.msmcenter.model.entitiys.Einsatzkraft;
import de.msm.msmcenter.model.entitiys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EinsatzkraftRepository einsatzkraftRepository;

    @Autowired
    BesetzungRepository besetzungRepository;

    //Weiterlung welche nach dem Login checkt, welche ROLE die Person hat
    @RequestMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_leistungskunde")) {
            return "redirect:/leistungskunde/index";
        } else{
            if(request.isUserInRole("ROLE_admin")) {
                return "redirect:/admin/dashboard";
            }
        }
        return "redirect:/einsatzkraft/dashboard";
    }

    @GetMapping("/")
    public String getIndex(Model model){
        return "login";
    }

    @GetMapping("login.html")
    public String getLogin(Model model){
        return "login";
    }

    @GetMapping("/SteffenTest")
        public String steffenTest1 (Model model){
            return "/steffentest";
    }

    @GetMapping("/SteffenTest2")
    public String steffenTest2 (Model model){
        return "/steffentest2";
    }

  //  @PreAuthorize("hasAnyRole('user') or hasAnyRole('test')")  SO GEHT PREAUTHORIZE
    @GetMapping("/leistungskunde/index")
    public String lkDashboard(Model model) {
        return "/leistungskunde/dashboard";
    }




    @GetMapping("/kalender")
    public String kalendertest(){

        return "/kalendertest";
    }


    @RequestMapping(value="/events", method=RequestMethod.GET)
    public List<Besetzung> getEventsInRange(@RequestParam(value = "start", required = true) String start,
                                            @RequestParam(value = "end", required = true) String end) {
        Date startDate = null;
        Date endDate = null;
        SimpleDateFormat inputDateFormat=new SimpleDateFormat("yyyy-MM-dd");

        try {
            startDate = inputDateFormat.parse(start);
        } catch (ParseException e) {
            throw new BadDateFormatException("bad start date: " + start);
        }

        try {
            endDate = inputDateFormat.parse(end);
        } catch (ParseException e) {
            throw new BadDateFormatException("bad end date: " + end);
        }

        return besetzungRepository.findByBesetzungStartZeitBetween(startDate, endDate);
    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class BadDateFormatException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public BadDateFormatException(String dateString) {
            super(dateString);
        }
    }


    @PostMapping("test")
    public String add(User user){
        userRepository.save(user);
        return "/admin/dashboard";
    }
}
