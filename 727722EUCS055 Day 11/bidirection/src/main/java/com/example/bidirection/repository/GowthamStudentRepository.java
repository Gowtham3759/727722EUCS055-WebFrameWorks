package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.GowthamStudent;



@Repository
public interface GowthamStudentRepository extends JpaRepository<GowthamStudent,Integer>{
    
}
