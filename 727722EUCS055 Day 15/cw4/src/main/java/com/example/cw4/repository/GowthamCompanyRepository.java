package com.example.cw4.repository;

import com.example.cw4.model.GowthamCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GowthamCompanyRepository extends JpaRepository<GowthamCompany, Integer> {
}