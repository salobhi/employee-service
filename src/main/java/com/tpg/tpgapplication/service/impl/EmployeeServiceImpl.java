package com.tpg.tpgapplication.service.impl;

import com.tpg.tpgapplication.model.Employee;
import com.tpg.tpgapplication.repository.EmployeeRepository;
import com.tpg.tpgapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }

}
