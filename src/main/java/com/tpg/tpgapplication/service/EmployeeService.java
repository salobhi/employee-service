package com.tpg.tpgapplication.service;

import com.tpg.tpgapplication.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    Employee addEmployee(Employee employee);

    Employee findEmployeeById(Long id);

    List<Employee> getEmployeeList();
}
