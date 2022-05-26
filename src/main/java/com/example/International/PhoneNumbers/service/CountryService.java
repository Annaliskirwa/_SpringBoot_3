package com.example.International.PhoneNumbers.service;

import com.example.International.PhoneNumbers.entity.Country;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();
    Country createCountry(Country country);
    Country updateCountry(Long countryId, Country country);
    void deleteCountry(Long countryId);
    Country getCountryById(Long countryId);
}
