package com.example.International.PhoneNumbers.entity;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PHONENUMBER")
@NoArgsConstructor
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long phoneId;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    public PhoneNumber(long phoneId, String phoneNumber) {
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(long phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @OneToOne
    @JoinColumn(name = "countryId", referencedColumnName = "countryId")
    private Country country;
}
