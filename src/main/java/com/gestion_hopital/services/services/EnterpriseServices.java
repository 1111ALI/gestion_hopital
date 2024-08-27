package com.gestion_hopital.services.services;

import com.gestion_hopital.dto.EnterpriseDto;
import com.gestion_hopital.entity.Enterprise;
import com.gestion_hopital.repository.EnterpriseRepository;
import com.gestion_hopital.services.interfaces.EnterpriseInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EnterpriseServices implements EnterpriseInterfaces {
    private final EnterpriseRepository enterpriseRepository;
private final Path route= Paths.get("src/main/resources/static/img/logo");
    @Override
    public Map<String, String> createEnterprise(EnterpriseDto enterpriseDto, MultipartFile file) {
Map<String,String> response=new HashMap<>();
        Optional<Enterprise> existingEnterprise=enterpriseRepository.findByName(enterpriseDto.getName());
        if(existingEnterprise.isEmpty()){
            Enterprise enterprise=new Enterprise();
            if(enterpriseDto.getEmail().matches(".*@.*")){
                enterprise.setName(enterpriseDto.getName().toUpperCase());
                enterprise.setEmail(enterpriseDto.getEmail());
                enterprise.setPhoneNumber(enterpriseDto.getPhoneNumber());
                enterprise.setSlogan(enterpriseDto.getSlogan());
                enterprise.setBalanceCredit(0);
                try{
                    Files.copy(file.getInputStream(),this.route.resolve(file.getOriginalFilename()));
                   enterprise.setFileName(file.getOriginalFilename());
                   enterprise.setFileType(file.getContentType());
                }catch(Exception e){
                   e.getMessage();
                }
                enterpriseRepository.save(enterprise);
            }else{
                response.put("message","Adresse Email incorrecte");
            }
        }else{
            response.put("message","Cette entreprise existe déjà");
        }
        return response;
    }
}
