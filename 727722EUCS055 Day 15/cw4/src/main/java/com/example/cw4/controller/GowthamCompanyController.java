package com.example.cw4.controller;

import com.example.cw4.model.GowthamCompany;
import com.example.cw4.service.GowthamCompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class GowthamCompanyController {

    private static final Logger logger = LoggerFactory.getLogger(GowthamCompanyController.class);

    @Autowired
    private GowthamCompanyService CompanyService;

    @GetMapping
    public ResponseEntity<List<GowthamCompany>> getAllCompanys() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Companies", "N/A");
        List<GowthamCompany> Companys = CompanyService.getAllCompanies();
        return ResponseEntity.ok(Companys);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GowthamCompany> getCompanyById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/Companies/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Company details", "N/A");
        GowthamCompany Company = CompanyService.getCompanyById(id);
        return ResponseEntity.ok(Company);
    }

    @PostMapping
    public ResponseEntity<GowthamCompany> addCompany(@RequestBody GowthamCompany Company) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Company, HttpStatus.CREATED.value(), "Company added successfully", "N/A");
        GowthamCompany savedCompany = CompanyService.addCompany(Company);
        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }
}