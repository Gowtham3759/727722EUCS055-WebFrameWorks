package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.GowthamStudent;
import com.example.bidirection.model.GowthamStudentInfo;
import com.example.bidirection.repository.GowthamStudentInfoRepository;
import com.example.bidirection.repository.GowthamStudentRepository;

@Service
public class GowthamStudentService {
    public GowthamStudentRepository studentRepository;
    public GowthamStudentInfoRepository studentInfoRepository;
    public GowthamStudentService(GowthamStudentRepository studentRepository,GowthamStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public GowthamStudent saveStudent(GowthamStudent student)
    {
        return studentRepository.save(student);
    }
    public GowthamStudentInfo saveStudentInfo(GowthamStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<GowthamStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
