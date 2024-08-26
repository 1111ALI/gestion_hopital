package com.gestion_hopital.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseDto {
    private String name;
    private String email;
    private String phoneNumber;
    private String slogan;
    private String uniqueIdentificationNumber;
private MultipartFile file;
    private double balanceCredit;
}
