package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.GowthamStudent;
import com.example.relation.repository.GowthamStudentRepository;

@Service
public class GowthamStudentService {
    public GowthamStudentRepository studentRepository;
    public GowthamStudentService(GowthamStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public GowthamStudent saveStudent(GowthamStudent student)
    {
        return studentRepository.save(student);
    }
    public List<GowthamStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
