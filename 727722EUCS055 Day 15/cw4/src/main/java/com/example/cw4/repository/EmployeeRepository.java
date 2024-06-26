package com.example.cw4.repository;

import com.example.cw4.model.GowthamEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<GowthamEmployee, Integer> {
}