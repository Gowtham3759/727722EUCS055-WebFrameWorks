package com.example.cw4.service;

import com.example.cw4.model.GowthamCompany;
import com.example.cw4.repository.GowthamCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GowthamCompanyService {

    @Autowired
    private GowthamCompanyRepository companyRepository;

    public List<GowthamCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public GowthamCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public GowthamCompany addCompany(GowthamCompany company) {
        return companyRepository.save(company);
    }
}