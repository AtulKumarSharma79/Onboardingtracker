package com.example.demo.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank 
    private String name;
    @NotBlank 
    private String role;
    @NotNull 
    private LocalDate onboardingDate;


    public Employee(int id, String name, String role, LocalDate onboardingDate){
        this.id = id;
        this.name = name;
        this.role = role;
        this.onboardingDate = onboardingDate;
    }

    public Employee(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public LocalDate getOnboardingDate(){
        return onboardingDate;
    }

    public void setOnboardingDate(LocalDate onboardingDate){
        this.onboardingDate = onboardingDate;
    }
    
}