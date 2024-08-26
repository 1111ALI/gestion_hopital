package com.gestion_hopital.controller.view;

import com.gestion_hopital.dto.EnterpriseDto;
import com.gestion_hopital.services.interfaces.EnterpriseInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class EnterpriseView {
    EnterpriseInterfaces enterpriseInterfaces;

    @GetMapping("/enterprise")
    public String enterprisePage(Model model){
        EnterpriseDto enterpriseDto=new EnterpriseDto();
        model.addAttribute("enterpriseDto",enterpriseDto);
        return "enterprise";
    }

    @PostMapping("/enterprise")
    private String pageCreateEnterprise(@ModelAttribute EnterpriseDto enterpriseDto, @RequestParam MultipartFile file){
        Map<String,String> response=enterpriseInterfaces.createEnterprise(enterpriseDto,file);
        return "redirect:/enterprise";
    }

}
