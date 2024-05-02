package com.example.cw1.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cw1.model.GowthamPerson;
import com.example.cw1.service.GowthamPersonService;

@RestController
public class GowthamPersonController {
    @Autowired
    private GowthamPersonService service;

    private static final Logger logger = LoggerFactory.getLogger(GowthamPersonController.class);

    @PostMapping("/persons")
    public ResponseEntity<GowthamPerson> create(@RequestBody GowthamPerson person) {
        logger.info("POST Request received for /persons ");
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPerson(person));
    }

    @GetMapping("/persons")
    public ResponseEntity<List<GowthamPerson>> getallpersons() {
        logger.debug("GET Request received for /persons");
        return ResponseEntity.ok(service.getAllPersons());
    }
}


