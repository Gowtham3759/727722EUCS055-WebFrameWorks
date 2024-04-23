package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.GowthamPerson;
import com.example.springapp.repository.GowthamPersonRepo;

@Service
public class GowthamPersonService {
    @Autowired
    private GowthamPersonRepo rep;

    public boolean post(GowthamPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<GowthamPerson> getAll()
    {
        return rep.findAll();
    }

    public List<GowthamPerson> getbyAge(int age)
    {
        return rep.findByAge(age);
    }
    
}
