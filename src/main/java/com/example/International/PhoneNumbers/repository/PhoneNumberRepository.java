package com.example.International.PhoneNumbers.repository;

import com.example.International.PhoneNumbers.dto.PhoneNumberDto;
import com.example.International.PhoneNumbers.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
}
