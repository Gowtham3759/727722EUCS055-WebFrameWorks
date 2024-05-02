package com.example.cw4.service;

import com.example.cw4.model.GowthamEmployee;
import com.example.cw4.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<GowthamEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public GowthamEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public GowthamEmployee addEmployee(GowthamEmployee employee) {
        return employeeRepository.save(employee);
    }
}