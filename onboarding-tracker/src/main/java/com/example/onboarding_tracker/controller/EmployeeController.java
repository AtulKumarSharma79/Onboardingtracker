
package com.example.onboarding_tracker.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.example.onboarding_tracker.entity.Employee;
import com.example.onboarding_tracker.repository.EmployeeRepository;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository repository) {
        this.employeeRepository = repository;
    }

    // POST API - Create Employee
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@Valid @RequestBody Employee employee) {

        Employee savedEmployee = employeeRepository.save(employee);

        return savedEmployee;
    }

    // GET API - Fetch All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();

        return employees;
    }
}
