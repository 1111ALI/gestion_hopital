package com.gestion_hopital.controller.view;

import com.gestion_hopital.dto.EnterpriseDto;
import com.gestion_hopital.services.services.EnterpriseServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class EnterpriseView {
   private final EnterpriseServices enterpriseServices;

    @GetMapping("/enterprise")
    public String enterprisePage(Model model){
        EnterpriseDto enterpriseDto=new EnterpriseDto();
        model.addAttribute("enterpriseDto",enterpriseDto);
        return "enterprise";
    }

 @PostMapping("/enterprise")
public String postEnterprise(Model model,EnterpriseDto enterpriseDto,@RequestParam("file") MultipartFile file){
Map<String,String> response=enterpriseServices.createEnterprise(enterpriseDto,file);
return "redirect:/home";}}


