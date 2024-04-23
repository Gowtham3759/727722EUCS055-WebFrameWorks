package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Door;
import com.example.springapp.repository.GowthamDoorRepo;

@Service
public class GowthamDoorService {
    @Autowired
    private GowthamDoorRepo rep;

    public boolean post(GowthamDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<GowthamDoor> getAll()
    {
        return rep.findAll();
    }

    public List<GowthamDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<GowthamDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
