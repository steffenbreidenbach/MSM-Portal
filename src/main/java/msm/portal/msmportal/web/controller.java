package my.youtube.benzinsniffer.web;

import my.youtube.benzinsniffer.dataacess.UserRepository;
import my.youtube.benzinsniffer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;


@Controller
public class controller {

    @Autowired
    UserRepository test;

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

  //  @PreAuthorize("hasAnyRole('user') or hasAnyRole('test')")  SO GEHT PREAUTHORIZE
    @GetMapping("/leistungskunde/index")
    public String lkDashboard(Model model) {
        return "/leistungskunde/dashboard";
    }

    @GetMapping("/einsatzkraft/dashboard")
    public String einsatzkraftDashboard(Model model) {
        return "/einsatzkraft/dashboard";
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
    public String addLK(User user,Model model) {
        test.save(user);
        return "/admin/hinzufuegen/LKAccount";
    }


}
