package com.example.demo.user;

import java.time.LocalDate;
import java.time.Period;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Entity // Create a table of flowers
public class AppUser implements User {
    @Id
    private Integer id;
    @Getter
    // @Column(unique = true)
    private String email;
    @Transient
    private int age;
    private String dateOfBirth;
    @Getter
    @Setter
    private String status;

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(LocalDate.parse(dateOfBirth), now); 
        return period.getYears();
    }

    public void update(String newStatus) {
        this.status = "Updated Status for " + newStatus;
    }
}