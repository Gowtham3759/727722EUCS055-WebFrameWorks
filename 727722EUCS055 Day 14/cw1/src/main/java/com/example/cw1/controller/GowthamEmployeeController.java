package com.example.cw1.controller;

import com.example.cw1.model.GowthamEmployee;
import com.example.cw1.service.GowthamEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class GowthamEmployeeController {
    private final GowthamEmployeeService employeeService;

    public GowthamEmployeeController(GowthamEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<GowthamEmployee> createEmployee(@RequestBody GowthamEmployee employee) {
        GowthamEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<GowthamEmployee>> getAllEmployees() {
        List<GowthamEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<GowthamEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<GowthamEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

