package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.GowthamPerson;
import java.util.List;


@Repository
public interface GowthamPersonRepo extends JpaRepository<GowthamPerson,Integer>{

    List<GowthamPerson> findByAge(int age);
    
}
