package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.GowthamEmployee;
import com.example.day5cw2.repository.GowthamEmployeeRepo;

@Service
public class GowthamEmployeeService {
    public GowthamEmployeeRepo employeeRepo;
    public GowthamEmployeeService(GowthamEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(GowthamEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,GowthamEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public GowthamEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
