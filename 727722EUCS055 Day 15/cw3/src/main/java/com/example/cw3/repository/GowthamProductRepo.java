package com.example.cw3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw3.model.GowthamProduct;

public interface GowthamProductRepo extends JpaRepository<GowthamProduct, Integer>{
    
}