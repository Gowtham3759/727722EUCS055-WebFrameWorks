package com.example.cw1.service;

import com.example.cw1.model.GowthamEmployee;
import com.example.cw1.repository.GowthamEmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GowthamEmployeeService {
    private final GowthamEmployeeRepo employeeRepo;

    public GowthamEmployeeService(GowthamEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public GowthamEmployee createEmployee(GowthamEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<GowthamEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<GowthamEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
