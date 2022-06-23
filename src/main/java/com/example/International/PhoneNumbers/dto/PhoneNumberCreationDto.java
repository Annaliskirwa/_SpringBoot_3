package com.example.International.PhoneNumbers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhoneNumberCreationDto {
    private String PhoneNumber;
    private String countryName;
}
