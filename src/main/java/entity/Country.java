package entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
@NoArgsConstructor
@Builder
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long countryId;

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
}
