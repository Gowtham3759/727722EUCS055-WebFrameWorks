package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.GowthamStudent;
import com.example.springapp.repository.GowthamStudentRepository;

@Service
public class GowthamStudentService {
    @Autowired
    GowthamStudentRepository studentRepository;
    public GowthamStudent addStudents(GowthamStudent student)
    {
        return studentRepository.save(student);
    }
    public List<GowthamStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<GowthamStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<GowthamStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
