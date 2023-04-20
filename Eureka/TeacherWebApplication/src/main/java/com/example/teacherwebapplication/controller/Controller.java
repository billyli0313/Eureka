package com.example.teacherwebapplication.controller;

import com.example.teacherwebapplication.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    TeacherService teacherService;
    @GetMapping(value = "/get/student")
    public String getStudentFromOtherService(@RequestParam(value = "id")String id){
        return teacherService.getStudentFromStudentProject(id);
    }
}
