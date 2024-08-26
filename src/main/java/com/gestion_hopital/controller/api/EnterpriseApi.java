package com.gestion_hopital.controller.api;

import com.gestion_hopital.dto.EnterpriseDto;
import com.gestion_hopital.services.interfaces.EnterpriseInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/entreprise/")
@RequiredArgsConstructor
public class EnterpriseApi {
    private final EnterpriseInterfaces enterpriseInterfaces;
    @PostMapping("create")
    private Map<String,String> createEnterprise(@RequestBody EnterpriseDto enterpriseDto, MultipartFile file){
        return enterpriseInterfaces.createEnterprise(enterpriseDto,file);
    }
}
