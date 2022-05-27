package com.example.International.PhoneNumbers.service;

import com.example.International.PhoneNumbers.entity.PhoneNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhoneNumberService {
    List<PhoneNumber> getAllPhoneNumbers();
    PhoneNumber addPhoneNumber(PhoneNumber phoneNumber);
    PhoneNumber updatePhoneNumber(Long phoneId, PhoneNumber phoneNumber);
    String deletePhoneNumber(Long phoneId);
    PhoneNumber getPhoneById(Long phoneId);

    //non jpa
//    int count();
//    List<PhoneNumber> listByCountry(String countryName);


}
