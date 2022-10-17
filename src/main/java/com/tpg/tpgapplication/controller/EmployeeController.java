package com.tpg.tpgapplication.controller;

import com.tpg.tpgapplication.constants.URI;
import com.tpg.tpgapplication.model.Employee;
import com.tpg.tpgapplication.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin("*")
@RefreshScope
@RestController
@RequestMapping(URI.API + URI.VERSION)
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/message")
    public ResponseEntity<String> getMsg() {
        return ResponseEntity.ok(message);
    }

    @PostMapping(URI.EMPLOYEE)
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }

    @GetMapping(URI.EMPLOYEE + "/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.findEmployeeById(id));
    }

    @GetMapping(URI.EMPLOYEE + URI.ALL)
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getEmployeeList());
    }


}
