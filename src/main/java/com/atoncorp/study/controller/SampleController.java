package com.atoncorp.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class SampleController {

    @GetMapping("/")
    public String index(Model model, Principal principal){
        if(principal == null){
            model.addAttribute("message", "Hello SpringSecurity");
        }else{
            model.addAttribute("message", "Hello SpringSecurity " + principal.getName());
        }
        return "index";
    }

    @GetMapping("/info")
    public String info(Model model){
        model.addAttribute("message", "Hello Information Page");
        return "info";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, Principal principal){
        model.addAttribute("message", "Hello " + principal.getName());
        return "dashboard";
    }

    @GetMapping("/admin")
    public String admin(Model model, Principal principal){
        model.addAttribute("message", "Hello Admin " +  principal.getName());
        return "admin";
    }
}
