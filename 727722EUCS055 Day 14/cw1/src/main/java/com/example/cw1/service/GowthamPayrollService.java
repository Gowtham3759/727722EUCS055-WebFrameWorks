package com.example.cw1.service;

import com.example.cw1.model.GowthamPayroll;
import com.example.cw1.repository.GowthamPayrollRepo;
import org.springframework.stereotype.Service;

@Service
public class GowthamPayrollService {
    private final GowthamPayrollRepo payrollRepo;

    public GowthamPayrollService(GowthamPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public GowthamPayroll createPayroll(GowthamPayroll payroll) {
        return payrollRepo.save(payroll);
    }

    public GowthamPayroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
