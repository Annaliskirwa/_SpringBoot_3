package com.example.International.PhoneNumbers.controller;

import com.example.International.PhoneNumbers.model.PhoneNumber;
import com.example.International.PhoneNumbers.repository.PhoneNumberRepository;
import com.example.International.PhoneNumbers.service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/internationalnumbers/v1")
public class PhoneNumberController {
    @Autowired
    private PhoneNumberRepository phoneNumberRepository;
    @Autowired
    private PhoneNumberService phoneNumberService;

    @GetMapping("/phoneNumber")
    public List<PhoneNumber> getAllPhoneNumbers(){
        phoneNumberService.getAllPhoneNumbers();
    }
}
