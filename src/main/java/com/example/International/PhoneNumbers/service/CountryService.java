package com.example.International.PhoneNumbers.service;

import com.example.International.PhoneNumbers.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {

    List<Country> getAllCountries();

    Country createCountry(Country country);
    Country updateCountry(Long countryId, Country country);

    String deleteCountry(Long countryId);
    Country getCountryById(Long countryId);
}
