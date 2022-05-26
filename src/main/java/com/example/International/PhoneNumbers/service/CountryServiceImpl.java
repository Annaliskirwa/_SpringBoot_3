package com.example.International.PhoneNumbers.service;

import com.example.International.PhoneNumbers.entity.Country;
import com.example.International.PhoneNumbers.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

public abstract class CountryServiceImpl implements CountryService{
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
        return countryRepository.save(country);
    }
    @Override
    public Country updateCountry(Long countryId, Country countryUpdate) {
        Country country = countryRepository.findById(countryId).get();
        country.setCountryCode(countryUpdate.getCountryCode());
        country.setCountryName(countryUpdate.getCountryName());

        return countryRepository.save(country);
    }
    @Override
    public void deleteCountry(Long countryId) {
        Country country =  countryRepository.findById(countryId).get();
        countryRepository.delete(country);
    }

    @Override
    public Country getCountryById(Long countryId) {
        Optional<Country> result = countryRepository.findById(countryId);
        return result.orElse(null);
    }
}
