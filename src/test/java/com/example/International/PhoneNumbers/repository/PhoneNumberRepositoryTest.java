package com.example.International.PhoneNumbers.repository;

import com.example.International.PhoneNumbers.entity.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class PhoneNumberRepositoryTest {
    @Autowired
    private PhoneNumberRepository underTest;
    String number = "0712345678";
    @Test
    void itShouldCheckIfPhoneNumberExists(){

//        given
        PhoneNumber phoneNumber = new PhoneNumber(
                1,
                number
        );
        underTest.save(phoneNumber);
//        when
//        Optional<?> expected = underTest.selectExistsPhoneNumber(number);
//        then
//        assertThat(expected);

    }
    @Test
    void itShouldSaveAphoneNumber(){
        PhoneNumber phoneNumber = new PhoneNumber(
                1,
                number
        );
        assertThat(phoneNumber).hasFieldOrPropertyWithValue("phoneId", 1L);
        assertThat(phoneNumber).hasFieldOrPropertyWithValue("phoneNumber", "0712345678");
    }
}