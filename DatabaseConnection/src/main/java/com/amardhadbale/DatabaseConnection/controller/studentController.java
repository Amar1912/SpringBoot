package com.amardhadbale.DatabaseConnection.controller;

import com.amardhadbale.DatabaseConnection.dto.StudentDto;
import com.amardhadbale.DatabaseConnection.entity.Student;
import com.amardhadbale.DatabaseConnection.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class studentController {

    private final StudentRepository studentRepository;
    public studentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentRepository.findAll() ;
    }
}
