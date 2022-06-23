package com.example.International.PhoneNumbers.controller;

import com.example.International.PhoneNumbers.dto.PhoneNumberCreationDto;
import com.example.International.PhoneNumbers.dto.PhoneNumberDto;
import com.example.International.PhoneNumbers.entity.PhoneNumber;
import com.example.International.PhoneNumbers.repository.PhoneNumberRepository;
import com.example.International.PhoneNumbers.service.PhoneNumberService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/internationalnumbers/v1")
public class PhoneNumberController {
    @Autowired
    private PhoneNumberRepository phoneNumberRepository;
    @Autowired
    private PhoneNumberService phoneNumberService;
    @Autowired
    private ModelMapper modelMapper;

    public PhoneNumberController(PhoneNumberService phoneNumberService){
        super();
        this.phoneNumberService = phoneNumberService;
    }

//    @GetMapping("/phoneNumber")
//    public List<PhoneNumber> getAllPhoneNumbers(){
//        return phoneNumberService.getAllPhoneNumbers();
//    }
    @GetMapping("/phoneNumber")
    public List<PhoneNumberDto> getAllPhoneNumbers(){
        return phoneNumberService.getAllPhoneNumbers().stream().map(post -> modelMapper.map(post, PhoneNumberDto.class))
                .collect(Collectors.toList());
    }
    @PostMapping("/phoneNumber")
    public PhoneNumber addPhoneNumber(@Valid @RequestBody PhoneNumber phoneNumber){
        return phoneNumberService.addPhoneNumber(phoneNumber);
    }
//    @PostMapping("/phoneNumber")
//    public @Valid PhoneNumberCreationDto addPhoneNumber(@Valid @RequestBody PhoneNumberCreationDto phoneNumberCreationDto){
//        PhoneNumber phoneNumber1 = modelMapper.map(phoneNumberCreationDto, PhoneNumber.class);
//        PhoneNumber phoneNumber = phoneNumberService.addPhoneNumber(phoneNumber1);
//        PhoneNumberCreationDto phoneNumberCreationDto1 = modelMapper.map(phoneNumber, PhoneNumberCreationDto.class);
//        return phoneNumberCreationDto;
//    }

    @PutMapping("/phoneNumber/{id}")
    public PhoneNumber updatePhoneNumber(@PathVariable(name = "id") Long phoneId, @Valid @RequestBody PhoneNumber phoneNumber ){
        return phoneNumberService.updatePhoneNumber(phoneId, phoneNumber);
    }
    @GetMapping("/phoneNumber/{id}")
    public PhoneNumber getPhoneById(@PathVariable("id") Long phoneId){
        return phoneNumberService.getPhoneById(phoneId);
    }
    @DeleteMapping("/phoneNumber/{id}")
    public String deletePhoneNumber(@PathVariable("id") Long phoneId){
        return phoneNumberService.deletePhoneNumber(phoneId);
    }
}