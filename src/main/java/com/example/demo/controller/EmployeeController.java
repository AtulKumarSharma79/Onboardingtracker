package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.EmployeeRepository;

import jakarta.validation.Valid;

import com.example.demo.model.Employee;
import java.util.*;
@RestController 
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping 
    @ResponseStatus(HttpStatus.CREATED)
    public Employee postEmployee(@Valid @RequestBody Employee employee){
        Employee employeeSaved = employeeRepository.save(employee);
        return employeeSaved;
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee;
    }
}
