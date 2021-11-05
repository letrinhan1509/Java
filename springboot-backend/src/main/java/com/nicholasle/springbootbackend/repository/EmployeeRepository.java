package com.nicholasle.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholasle.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
