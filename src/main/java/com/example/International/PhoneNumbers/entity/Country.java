package com.example.International.PhoneNumbers.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "COUNTRY")
@Data
@NoArgsConstructor
public class Country implements Serializable {

    @Serial
    private static final long serialVersionUID = -3784966700234315230L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    @Column(name = "countryName", nullable = false)
    private String countryName;

    @Column(name = "countryCode", nullable = false)
    private String countryCode;

    public Country(long countryId, String countryName, String countryCode) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

//    @OneToMany(mappedBy = "country")
//    private List<PhoneNumber > phoneNumber;

}
