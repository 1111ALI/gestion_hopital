package com.gestion_hopital.controller.view;

import com.gestion_hopital.dto.CountryDto;
import com.gestion_hopital.services.interfaces.CountryInterfaces;
import com.gestion_hopital.services.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class CountryView {

    private final CountryService countryService;

    @PostMapping("/country")
    private String createCountryPage(@ModelAttribute CountryDto countryDto, Model model){
        Map<String,String> response=countryService.createCountry(countryDto);
        model.addAttribute("response",response.get("message"));
        return "home";
    }
}
