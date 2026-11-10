package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;







    @RestController
    public class EmployeeController {
        private final EmployeeRepository employeeRepository;
        public EmployeeController(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
        }
   

    @PostMapping("/api/employees")
    public ResponseEntity<Employee> createEmployee(
        @Valid @RequestBody Employee employee) {

    Employee savedEmployee = employeeRepository.save(employee);

    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(savedEmployee);
    }

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    
    @GetMapping ("/api/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .map(employee -> ResponseEntity.ok().body(employee))
                .orElse(ResponseEntity.notFound().build());
    }

    
    

    

}
