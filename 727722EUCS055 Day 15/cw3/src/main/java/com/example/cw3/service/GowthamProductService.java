package com.example.cw3.service;

import com.example.cw3.model.GowthamProduct;
import com.example.cw3.repository.GowthamProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GowthamProductService {

    @Autowired
    private GowthamProductRepo productRepo;

    public List<GowthamProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public GowthamProduct getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public GowthamProduct addProduct(GowthamProduct product) {
        return productRepo.save(product);
    }
}