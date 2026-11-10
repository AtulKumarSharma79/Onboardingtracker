package com.example.onboarding_tracker.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.onboarding_tracker.model.Employee;
import com.example.onboarding_tracker.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

private final EmployeeRepository employeeRepository;

public EmployeeController(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public Employee createEmployee(@Valid @RequestBody Employee employee) {
    return employeeRepository.save(employee);
}

@GetMapping 
public List<Employee> getAllEmployees(){
    return employeeRepository.findAll();
}
}
