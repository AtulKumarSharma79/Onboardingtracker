package com.example.onboarding_tracker.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String role;

    @NotNull
    private LocalDate onboardingDate;

    public Employee(){
        
    }

    public Long getId() {
            return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
            return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getOnboardingDate() {
            return onboardingDate;
    }

    public void setOnboardingDate(LocalDate onboardingDate) {
        this.onboardingDate = onboardingDate;
    }

}
