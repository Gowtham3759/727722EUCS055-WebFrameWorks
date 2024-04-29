package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.GowthamEmployee;
import com.example.ce1.repository.GowthamEmployeeRepo;

@Service
public class GowthamEmployeeService {
    @Autowired
    GowthamEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public GowthamEmployee setEmployee(GowthamEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GowthamEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<GowthamEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
