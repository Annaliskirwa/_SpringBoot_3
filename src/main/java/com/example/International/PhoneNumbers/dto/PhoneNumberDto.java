package com.example.International.PhoneNumbers.dto;


import com.example.International.PhoneNumbers.model.Country;
import com.example.International.PhoneNumbers.model.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhoneNumberDto {
    private String phoneNumber;
    private String countryName;
}