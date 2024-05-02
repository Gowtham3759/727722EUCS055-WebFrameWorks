package com.example.cw1.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cw1.model.GowthamPerson;
import com.example.cw1.repository.GowthamPersonRepo;

@Service
public class GowthamPersonService {
    @Autowired
    private GowthamPersonRepo repo;

    public GowthamPerson createPerson(GowthamPerson person) {
        return repo.save(person);
    }

    public List<GowthamPerson> getAllPersons() {
        return repo.findAll();
    }
}
