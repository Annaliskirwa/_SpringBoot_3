package com.example.International.PhoneNumbers.repository;

import com.example.International.PhoneNumbers.entity.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class PhoneNumberRepositoryTest {
    @Autowired
    private PhoneNumberRepository underTest;
    @Test
    void itShouldCheckIfPhoneNumberExists(){
        String number = "0712345678";
//        given
        PhoneNumber phoneNumber = new PhoneNumber(
                1,
                number
        );
        underTest.save(phoneNumber);
//        when
        boolean expected = underTest.selectExistsPhoneNumber(number);
//        then
        assertThat(expected).isTrue();

    }
}