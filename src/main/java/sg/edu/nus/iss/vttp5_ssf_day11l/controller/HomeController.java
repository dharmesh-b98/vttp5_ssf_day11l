package sg.edu.nus.iss.vttp5_ssf_day11l.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(path = {"/","home"}, method = RequestMethod.GET)
    public String homePage(){
        return "home";
    }

    
    
}
