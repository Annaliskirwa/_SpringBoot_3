package com.example.International.PhoneNumbers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.International.PhoneNumbers.repository.CountryRepository;

@RestController
public class CountryController {
    @Autowired
    CountryRepository countryRepository;
}
