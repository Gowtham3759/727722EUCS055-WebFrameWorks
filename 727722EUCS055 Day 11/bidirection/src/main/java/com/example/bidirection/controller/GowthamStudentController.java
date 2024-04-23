package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.GowthamStudent;
import com.example.bidirection.model.GowthamStudentInfo;
import com.example.bidirection.service.GowthamStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class GowthamStudentController {
    public GowthamStudentService studentService;
    public GowthamStudentController(GowthamStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public GowthamStudent postMethodName(@RequestBody GowthamStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public GowthamStudentInfo postMethodName(@RequestBody GowthamStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<GowthamStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}