package my.youtube.benzinsniffer.web;

import my.youtube.benzinsniffer.dataacess.UserRepository;
import my.youtube.benzinsniffer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class controller {

    @Autowired
    UserRepository test;

 /*   @GetMapping("/")
    public String getIndex(Model model){
        List<User> all = test.findAll();
        User test2 = new User();
        model.addAttribute("user",all);
        return "index";
    } */

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @PostMapping("/safelogin")
    public String safelogin(Model model,int username,String password) {
        Optional<User> user =  test.findByid(username);
        model.addAttribute("user",user);
        return "index";
    }
}
