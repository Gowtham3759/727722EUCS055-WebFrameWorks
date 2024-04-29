package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.GowthamStudentDetail;
import com.example.springapp.repository.GowthamStudentDetailRepository;
import com.example.springapp.repository.GowthamStudentRepository;

@Service
public class GowthamStudentDetailService {
    @Autowired
    GowthamStudentDetailRepository studentDetailRepository;
    @Autowired
    GowthamStudentRepository studentRepository;
    public GowthamStudentDetail addStudentDetail(int id,GowthamStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
