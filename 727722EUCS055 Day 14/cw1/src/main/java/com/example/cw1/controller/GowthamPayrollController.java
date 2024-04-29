package com.example.cw1.controller;

import com.example.cw1.model.GowthamPayroll;
import com.example.cw1.service.GowthamPayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/{employeeId}/payroll")
public class GowthamPayrollController {
    private final GowthamPayrollService payrollService;

    public GowthamPayrollController(GowthamPayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public ResponseEntity<GowthamPayroll> createPayrollForEmployee(@PathVariable Long employeeId, @RequestBody GowthamPayroll payroll) {
        GowthamPayroll createdPayroll = payrollService.createPayroll(payroll);
        if (createdPayroll != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPayroll);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping
    public ResponseEntity<GowthamPayroll> getPayrollForEmployee(@PathVariable Long employeeId) {
        GowthamPayroll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return ResponseEntity.ok(payroll);
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
