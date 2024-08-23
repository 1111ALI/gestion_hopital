package com.gestion_hopital.controller.view;

import com.gestion_hopital.entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginView {

    @GetMapping("/login")
    public String loginPage(Model model){
        Users users=new Users();
        model.addAttribute("users",users);
        return "login";
    }

    @PostMapping("/login")
    public String PostLoginPage(Model model){

        return "redirect:/home";
    }

    @GetMapping("/home")
    public String homePage(Model model){
        return "home";
    }
}
