package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.GowthamAddress;
import com.example.ce1.repository.GowthamAddressRepo;
import com.example.ce1.repository.GowthamEmployeeRepo;

@Service
public class GowthamAddressService {
    @Autowired
    GowthamAddressRepo addressRepo;
    @Autowired
    GowthamEmployeeRepo employeeRepo;
    public GowthamAddress setAddressById(int id,GowthamAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
