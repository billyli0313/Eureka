package com.example.studentwebservice1.controller;

import com.example.studentwebservice1.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentProfileController {
    @PostMapping(value = "/student/create")
    public String createStudent(@RequestBody Student student){
        return "Create student successfully!";
    }
    @GetMapping(value = "/student/{id}" )
    public String getStudentById(@PathVariable(value = "id")String id){
        return "Get student details from service 111 by id: " + id;
    }
    @PutMapping(value = "/student/update")
    public String updateStudent(@RequestParam(value = "name")String name){
        return "Update student successfully!";
    }
    @DeleteMapping(value = "/student/delete")
    public String deleteStudent(@RequestParam(value = "id")String id){
        return "Delete student successfully!";
    }

}
