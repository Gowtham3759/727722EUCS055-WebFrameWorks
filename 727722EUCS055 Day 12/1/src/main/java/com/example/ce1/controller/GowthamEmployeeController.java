package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.GowthamEmployee;
import com.example.ce1.service.GowthamEmployeeService;

@RestController
public class GowthamEmployeeController {
    @Autowired
    GowthamEmployeeService employeeService;

    @PostMapping("/employee")
    public GowthamEmployee setMethod(@RequestBody GowthamEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }
    @GetMapping("/employees-inner-join")
    public List<GowthamEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<GowthamEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
