package com.example.spring_testing_demo.services;

import com.example.spring_testing_demo.model.Employee;
import com.example.spring_testing_demo.repositories.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class EmployeeService {
    @Autowired
    private Employeerepository repository;

    public Iterable<Employee> getAllEmployee(){
        return repository.findAll();}


    public Optional<Employee> getEmployeeById (Long id){
        return repository.findById(id);
        }

        public Employee createEmployee(Employee employee){
        return repository.save(employee);
        }
        public Employee updateEmployeeById(Long id, Employee employee){
        employee.setId(id);
        return repository.save(employee);
        }

        public boolean deleteEmployeeById(Long id){

             return repository.existsById(id);
        }

    }


