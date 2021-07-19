package com.example.teacher.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service")
public interface StudentClient {

    @GetMapping("/teachers/{id}")
    public List<StudentBean> getForClassTeacherId(@PathVariable int id);
}
