package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.GowthamStudent;

@Repository
public interface GowthamStudentRepository extends JpaRepository<GowthamStudent,Integer>{
    
}
