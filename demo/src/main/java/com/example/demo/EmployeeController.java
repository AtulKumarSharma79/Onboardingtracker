package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


//posting imports
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // mark class as web api controller

//controller handles URLs beginning with
@RequestMapping("/api/employees") 

public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping // Get Req call
    public List<Employee> getEmployees() {
    return employeeRepository.findAll();
    }

    @PostMapping // Post Req call

    //apply validation rules and convert json to Employee 
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee){

        //saved employee with ID
        Employee savedEmployee = employeeRepository.save(employee);

        //201 created and serialise to json
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }


}
