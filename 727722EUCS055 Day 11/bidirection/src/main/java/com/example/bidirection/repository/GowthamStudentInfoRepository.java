package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.GowthamStudentInfo;

@Repository
public interface GowthamStudentInfoRepository extends JpaRepository<GowthamStudentInfo,Integer>{
    
}