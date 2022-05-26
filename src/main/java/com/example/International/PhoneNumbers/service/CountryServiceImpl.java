package com.example.International.PhoneNumbers.service;

import com.example.International.PhoneNumbers.entity.Country;
import com.example.International.PhoneNumbers.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryRepository countryRepository;

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
    public String deleteCountry(Long countryId) {
        Country country =  countryRepository.findById(countryId).get();
        countryRepository.delete(country);
        return ("country has been deleted");
    }

    @Override
    public Country getCountryById(Long countryId) {
        Optional<Country> result = countryRepository.findById(countryId);
        return result.orElse(null);
    }
}
