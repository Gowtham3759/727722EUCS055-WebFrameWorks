package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Door;
import java.util.List;

@Repository
public interface GowthamDoorRepo extends JpaRepository<GowthamDoor,Integer>{

    List<GowthamDoor> findByDoorId(int doorId);
    List<GowthamDoor> findByAccessType(String accessType);
    
}
