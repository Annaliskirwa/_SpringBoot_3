package com.example.International.PhoneNumbers.repository;

import com.example.International.PhoneNumbers.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
//    @Query(value = "SELECT COUNT(1) FROM phonenumber WHERE phone_number= :phone_number", nativeQuery = true)
//    Optional<?> selectExistsPhoneNumber(String PhoneNumber);
}
