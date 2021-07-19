package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private Environment environment;

    @GetMapping("/info")
    public String ping() {
        String port = environment.getProperty("local.server.port");
        return "Student instance with port " + port;
    }

    @GetMapping("/")
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable int id) {
        return studentRepository.findById(id);
    }

    @GetMapping("/teachers/{id}")
    public List<Student> getForClassTeacher(@PathVariable int id) {
        return studentRepository.findByClassTeacherId(id);
    }
}
