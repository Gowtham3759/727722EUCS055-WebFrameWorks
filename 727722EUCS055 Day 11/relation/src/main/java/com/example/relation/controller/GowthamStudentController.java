package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.GowthamStudent;
import com.example.relation.service.GowthamStudentService;
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
    @PostMapping("/api/student")
    public GowthamStudent postMethodName(@RequestBody GowthamStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<GowthamStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
