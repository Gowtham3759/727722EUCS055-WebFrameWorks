package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.GowthamProduct;
import java.util.List;


@Repository
public interface GowthamProductRepo extends JpaRepository<GowthamProduct,Integer>{

    List<GowthamProduct> findByProductNameStartingWith(String name);
    List<GowthamProduct> findByProductNameEndingWith(String name);
    
}
