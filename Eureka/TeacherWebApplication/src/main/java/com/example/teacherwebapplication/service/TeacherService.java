package com.example.teacherwebapplication.service;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeacherService {
    public String getFromStudentProject(String studentId){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8762/student/" + studentId,String.class);
        String user = responseEntity.getBody();
        return user;
    }
    @Autowired
    private RestTemplate restTemplate;

    public String getStudentFromStudentProject(String studentId){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://STUDENT/student/" + studentId, String.class);
        String user = responseEntity.getBody();
        return user;
    }
}
