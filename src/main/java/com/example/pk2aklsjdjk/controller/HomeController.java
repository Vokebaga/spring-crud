package com.example.pk2aklsjdjk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage() {
        return "index";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }
}
