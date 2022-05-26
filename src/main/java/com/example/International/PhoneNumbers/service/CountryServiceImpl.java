package com.example.International.PhoneNumbers.service;

import com.example.International.PhoneNumbers.entity.Country;
import com.example.International.PhoneNumbers.repository.CountryRepository;

import java.util.List;

public class CountryServiceImpl implements CountryService{
    private final CountryRepository countryRepository;
    public CountryServiceImpl(CountryRepository countryRepository){
        super();
        this.countryRepository = countryRepository;
    }
    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country createCountry(Country country) {
        return null;
    }

    @Override
    public Country updateCountry(Long countryId, Country country) {
        return null;
    }

    @Override
    public void deleteCountry(Long countryId) {

    }

    @Override
    public Country getCountryById(Long countryId) {
        return null;
    }
}
