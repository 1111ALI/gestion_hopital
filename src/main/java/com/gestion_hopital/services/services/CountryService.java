package com.gestion_hopital.services.services;

import com.gestion_hopital.dto.CountryDto;
import com.gestion_hopital.entity.Country;
import com.gestion_hopital.repository.CountryRepository;
import com.gestion_hopital.services.interfaces.CountryInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CountryService implements CountryInterfaces {
    private final CountryRepository countryRepository;


    @Override
    public Map<String, String> createCountry(CountryDto countryDto) {
        Map<String,String> response=new HashMap<>();
        Optional<Country> existingCountry=countryRepository.findByName(countryDto.getName());
        List<Country> listCountry=countryRepository.findAll().stream()
                .sorted(Comparator.comparing(Country::getIdCountry).reversed())
                .toList();
        int numberRef=0;
        if(listCountry.size()>0){
            numberRef=listCountry.get(0).getIdCountry()+1;
        }else{
            numberRef=1;
        }
        if(existingCountry.isEmpty()){
            if(!countryDto.getName().isEmpty()){
                Country country=new Country();
                country.setRefCountry("CT0"+numberRef);
                country.setName(countryDto.getName().toUpperCase());
                countryRepository.save(country);
                response.put("message","Pays créé avec succès");
            }else{
                response.put("message","Nom du pays non renseigné");
            }
        }else{
            response.put("message","Ce pays a déjà été traité");
        }
        return response;
    }
}
