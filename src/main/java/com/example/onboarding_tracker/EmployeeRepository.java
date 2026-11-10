package com.example.onboarding_tracker;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface EmployeeRepository extends ListCrudRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {
}
