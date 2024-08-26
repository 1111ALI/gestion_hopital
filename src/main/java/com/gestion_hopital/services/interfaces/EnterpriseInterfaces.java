package com.gestion_hopital.services.interfaces;

import com.gestion_hopital.dto.EnterpriseDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface EnterpriseInterfaces {
    Map<String, String> createEnterprise(EnterpriseDto enterpriseDto, MultipartFile file);
}
