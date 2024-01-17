package com.example.spring_testing_demo.controller;

import com.example.spring_testing_demo.model.Employee;
import com.example.spring_testing_demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class Employeecontoller {
    @Autowired
    private EmployeeService service;

    @GetMapping
   public Iterable<Employee> getAllEmployee(){
       return service.getAllEmployee();
   }
   @GetMapping("/{id}")
   public Optional<Employee> getOneEmployeeId(@PathVariable Long id){
       return service.getEmployeeById(id);
          }
    @PostMapping
    public Employee postEmployee(@RequestBody Employee employee){
       return service.createEmployee(employee);
    }
    @PutMapping ("/{id}")
    public Employee putEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return service.createEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public boolean deleteOneById(@PathVariable Long id){
       return service.deleteEmployeeById(id);
    }







}



