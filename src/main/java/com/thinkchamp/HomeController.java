package com.thinkchamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name,
                           @RequestParam String city,
                           Model model) {

        System.out.println("===== REGISTER METHOD CALLED =====");
        System.out.println("Name = " + name);
        System.out.println("City = " + city);

        model.addAttribute("name", name);
        model.addAttribute("city", city);

        return "success";
    }
}