package com.example.cw3.controller;


import com.example.cw3.model.GowthamProduct;
import com.example.cw3.service.GowthamProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class GowthamProductController {

    private static final Logger logger = LoggerFactory.getLogger(GowthamProductController.class);

    @Autowired
    private GowthamProductService ProductService;

    @GetMapping
    public ResponseEntity<List<GowthamProduct>> getAllProducts() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/products; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Products", "N/A");
        List<GowthamProduct> Products = ProductService.getAllProducts();
        return ResponseEntity.ok(Products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GowthamProduct> getProductById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/products/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Product details", "N/A");
        GowthamProduct Product = ProductService.getProductById(id);
        return ResponseEntity.ok(Product);
    }

    @PostMapping
    public ResponseEntity<GowthamProduct> addProduct(@RequestBody GowthamProduct Product) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/products; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Product, HttpStatus.CREATED.value(), "Product added successfully", "N/A");
        GowthamProduct savedProduct = ProductService.addProduct(Product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
}