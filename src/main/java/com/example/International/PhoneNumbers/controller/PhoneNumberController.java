package com.example.International.PhoneNumbers.controller;

import com.example.International.PhoneNumbers.entity.PhoneNumber;
import com.example.International.PhoneNumbers.repository.PhoneNumberRepository;
import com.example.International.PhoneNumbers.service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        return phoneNumberService.getAllPhoneNumbers();
    }
    @PostMapping("/phoneNumber")
    public PhoneNumber addPhoneNumber(@Valid @RequestBody PhoneNumber phoneNumber){
        return phoneNumberService.addPhoneNumber(phoneNumber);
    }
    @PutMapping("/phoneNumber/{id}")
    public PhoneNumber updatePhoneNumber(@PathVariable(name = "id") Long phoneId, @Valid @RequestBody PhoneNumber phoneNumber ){
        return phoneNumberService.updatePhoneNumber(phoneId, phoneNumber);
    }
}
