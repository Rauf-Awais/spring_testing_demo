package com.example.spring_testing_demo.repositories;

import com.example.spring_testing_demo.model.Employee;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface Employeerepository extends CrudRepository<Employee, Long> {

}
