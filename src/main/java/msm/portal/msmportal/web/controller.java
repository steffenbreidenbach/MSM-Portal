package msm.portal.msmportal.web;

import msm.portal.msmportal.dataacess.BesetzungRepository;
import msm.portal.msmportal.dataacess.EinsatzkraftRepository;
import msm.portal.msmportal.dataacess.UserRepository;
import msm.portal.msmportal.model.Besetzung;
import msm.portal.msmportal.model.Einsatzkraft;
import msm.portal.msmportal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.Option;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Controller
public class controller {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EinsatzkraftRepository einsatzkraftRepository;

    @Autowired
    BesetzungRepository besetzungRepository;


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

    @GetMapping("/login.html")
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

    @GetMapping("/einsatzkraft/dashboard")
    public String einsatzkraftDashboard(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
         Object user = auth.getPrincipal();
         model.addAttribute("einsatzkraft",einsatzkraftRepository.findByid(1));
        return "/einsatzkraft/dashboard";
    }

    @GetMapping("/einsatzkraft/kalender")
    public String einsatzkraftKalender(Model model) {
        return "/einsatzkraft/kalender";
    }

    @GetMapping("/einsatzkraft/pep")
    public String einsatzkraftPep(Model model) {
        return "/einsatzkraft/pep";
    }

    @GetMapping("/einsatzkraft/profil")
    public String einsatzkraftProfil(Model model) {
        return "/einsatzkraft/profil";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard(Model model) {
        return "/admin/dashboard";
    }

    @GetMapping("/admin/leistungskunden")
    public String adminLK(Model model) {
        return "/admin/hinzufuegen/LKAccount";
    }

    @PostMapping("/adimn/LKerstellen")
    public String addLK(User user, Model model) {
        userRepository.save(user);
        return "/admin/hinzufuegen/LKAccount";
    }

    @GetMapping("/admin/erstellen")
    public String erstelleBesetzung(Model model) {
        for(int i = 685;i<1500;i++){
            Besetzung besetzung = new Besetzung();
            besetzung.setId(i);
            besetzung.setProjektvertragRechnungskundeID(1);
            besetzung.setEinsatzkraftID(2);
            besetzung.setFlaecheID(1);
            besetzungRepository.save(besetzung);
        }
        return "/admin/dashboard";
    }

    @GetMapping("/kalender")
    public String kalendertest(){

        return "/kalendertest";
    }

    @GetMapping("/admin/getData")
    public String getData(Model model){
     model.addAttribute("data",besetzungRepository.findAllByeinsatzkraftID(1));
     return "/admin/data";
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

        return besetzungRepository.findByStartDatumBetween(startDate, endDate);
    }

    @RequestMapping(value="/einsatzkraft/kalender/events", method=RequestMethod.GET)
    public List<Besetzung> allEvents() {
        return besetzungRepository.findAll();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class BadDateFormatException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public BadDateFormatException(String dateString) {
            super(dateString);
        }
    }
}
