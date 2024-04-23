package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.GowthamProduct;
import com.example.day6cw3.repository.GowthamProductRepo;

@Service
public class GowthamProductService {
    public GowthamProductRepo productRepo;
    public GowthamProductService(GowthamProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(GowthamProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GowthamProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<GowthamProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public GowthamProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
