package com.example.International.PhoneNumbers.controller;

import com.example.International.PhoneNumbers.entity.Country;
import com.example.International.PhoneNumbers.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.International.PhoneNumbers.repository.CountryRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/internationalnumbers/v1")
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();

    }
    @PostMapping("/countries")
    public Country createCountry(@Valid @RequestBody Country country){
        return countryService.createCountry(country);
    }
    @PutMapping("/countries/{id}")
        public Country updateCountry(@PathVariable("id") Long countryId, @Valid @RequestBody Country country){
        return countryService.updateCountry(countryId,country);
    }
    @GetMapping("/countries/{id}")
    public Country getCountryById(@PathVariable("id") Long countryId){
        return countryService.getCountryById(countryId);
    }
}
