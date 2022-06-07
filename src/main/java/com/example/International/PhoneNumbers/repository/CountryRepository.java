package com.example.International.PhoneNumbers.repository;

import com.example.International.PhoneNumbers.entity.Country;
import com.example.International.PhoneNumbers.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
