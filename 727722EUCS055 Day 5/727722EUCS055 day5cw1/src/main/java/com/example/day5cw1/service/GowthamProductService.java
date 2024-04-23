package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.GowthamProduct;
import com.example.day5cw1.repository.GowthamProductRepo;

@Service
public class GowthamProductService {
    public GowthamProductRepo productRepo;
    public GowthamProductService(GowthamProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(GowthamProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,GowthamProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public GowthamProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
