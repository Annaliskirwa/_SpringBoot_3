package com.example.International.PhoneNumbers.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "PHONENUMBER")
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber implements Serializable {
    @Serial
    private static final long serialVersionUID = -2092489523494435974L;
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
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "countryId", referencedColumnName = "countryId")
//    @JsonIgnoreProperties({"countryName"})
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneId=" + phoneId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", country=" + country +
                '}';
    }
}
