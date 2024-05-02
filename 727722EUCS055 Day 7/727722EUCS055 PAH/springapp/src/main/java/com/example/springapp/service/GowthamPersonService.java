package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;

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

    public List<GowthamPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<GowthamPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
