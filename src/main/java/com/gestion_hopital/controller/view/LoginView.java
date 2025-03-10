package com.gestion_hopital.controller.view;

import com.gestion_hopital.dto.CountryDto;
import com.gestion_hopital.dto.EnterpriseDto;
import com.gestion_hopital.entity.Country;
import com.gestion_hopital.entity.Enterprise;
import com.gestion_hopital.entity.Users;
import com.gestion_hopital.repository.CountryRepository;
import com.gestion_hopital.repository.EnterpriseRepository;
import com.gestion_hopital.repository.UsersRepository;

import lombok.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class LoginView {
private final UsersRepository usersRepository;
private final EnterpriseRepository enterpriseRepository;
private final CountryRepository countryRepository;
    @GetMapping("/login")
    public String loginPage(Model model){
        List<Enterprise> enterprises=enterpriseRepository.findAll();

           model.addAttribute("enterprises",enterprises);
           return "login";

        }


    @GetMapping("/home")
    public String homePage(Model model, @AuthenticationPrincipal UserDetails userDetails){
        Users existingUser= usersRepository.findByUsername(userDetails.getUsername()).orElseThrow(()->new RuntimeException("Utilisateur introuvable"));

        if(existingUser.isConnected()){
            return "redirect:/deconnexion";
        }
String nomUtil=userDetails.getUsername();
        model.addAttribute("nomUtil",nomUtil);
        EnterpriseDto enterpriseDto=new EnterpriseDto();
        model.addAttribute("enterpriseDto",enterpriseDto);
        CountryDto countryDto=new CountryDto();
        model.addAttribute("countryDto",countryDto);
        List<Country> countries=countryRepository.findAll();
        model.addAttribute("countries",countries);
        existingUser.setConnected(true);
        usersRepository.save(existingUser);
        return "home";
    }

    @GetMapping("/deconnexion")
    public String deconnexionPage(Model model){
        return "deconnexion";
    }

    @PostMapping("/logout")
    public String logoutPage(Model model,@AuthenticationPrincipal UserDetails userDetails){
        Users existingUser= usersRepository.findByUsername(userDetails.getUsername()).orElseThrow(()->new RuntimeException("Utilisateur introuvable"));
        existingUser.setConnected(false);
        usersRepository.save(existingUser);
        return "redirect:/login";
    }



    @PostMapping("/deconnexion")
    public String PostdeconnexionPage(Model model, @RequestParam String username){
        Users existingUser= usersRepository.findByUsername(username).orElseThrow(()->new RuntimeException("Utilisateur introuvable"));
        existingUser.setConnected(false);
        usersRepository.save(existingUser);
        return "redirect:/login";
    }

}
