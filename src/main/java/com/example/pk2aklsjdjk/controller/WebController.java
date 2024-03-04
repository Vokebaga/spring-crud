package com.example.pk2aklsjdjk.controller;


import com.example.pk2aklsjdjk.auth.AuthenticationService;
import com.example.pk2aklsjdjk.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequiredArgsConstructor
public class WebController {
    private final AuthenticationService service;
    @GetMapping("/update")
    public String secureUpdate() {
        return "update";
    }

    @GetMapping("/registration")
    public String secondPage() {
        return "register";
    }
    @PostMapping("/registration")
    public String secondPageEnd() {
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String thirdPage() {
        return "login";
    }
    @PostMapping("/login")
    public String thirdPagEnd() {
        return "redirect:/home";
    }

}
