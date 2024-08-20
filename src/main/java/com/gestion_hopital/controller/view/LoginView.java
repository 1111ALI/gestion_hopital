package com.gestion_hopital.controller.view;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginView {

    @GetMapping("/login")
    public String loginPage(Model model){
       return "login";
    }
}
