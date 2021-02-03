package com.atoncorp.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("message", "Hello SpringSecurity");
        return "index";
    }
}
