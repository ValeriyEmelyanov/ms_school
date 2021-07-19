package com.example.teacher.controller;

import com.example.teacher.client.StudentBean;
import com.example.teacher.client.StudentClient;
import com.example.teacher.model.Teacher;
import com.example.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TeacherRestController {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentClient studentClient;

    @GetMapping("/")
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> getById(@PathVariable int id) {
        return teacherRepository.findById(id);
    }

    @GetMapping("/{id}/students")
    public List<StudentBean> getStudentsForClassTeacherId(@PathVariable int id) {
        return studentClient.getForClassTeacherId(id);
    }
}
