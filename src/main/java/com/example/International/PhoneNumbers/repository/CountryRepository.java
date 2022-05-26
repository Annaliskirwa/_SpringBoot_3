package com.example.International.PhoneNumbers.repository;

import com.example.International.PhoneNumbers.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
