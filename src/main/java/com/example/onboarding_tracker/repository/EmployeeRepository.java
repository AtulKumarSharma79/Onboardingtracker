package com.example.onboarding_tracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onboarding_tracker.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
