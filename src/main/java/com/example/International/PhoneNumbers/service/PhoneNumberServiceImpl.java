package com.example.International.PhoneNumbers.service;

import com.example.International.PhoneNumbers.entity.PhoneNumber;
import com.example.International.PhoneNumbers.repository.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNumberServiceImpl implements  PhoneNumberService{
    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Override
    public List<PhoneNumber> getAllPhoneNumbers() {
        return null;
    }

    @Override
    public PhoneNumber addPhoneNumber(PhoneNumber phoneNumber) {
        return null;
    }

    @Override
    public PhoneNumber updatePhoneNumber(Long phoneId, PhoneNumber phoneNumber) {
        return null;
    }

    @Override
    public String deletePhoneNumber(Long phoneId) {
        return null;
    }

    @Override
    public PhoneNumber getPhoneById(Long phoneId) {
        return null;
    }
}
