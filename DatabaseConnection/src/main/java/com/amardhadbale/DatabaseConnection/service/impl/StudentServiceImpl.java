package com.amardhadbale.DatabaseConnection.service.impl;

import com.amardhadbale.DatabaseConnection.dto.StudentDto;
import com.amardhadbale.DatabaseConnection.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    public class StudentRepository {
        private List<StudentDto> students;
        public StudentRepository() {
            students = new ArrayList<>();
        }
    }
    @Override
    public List<StudentDto> getAllStudents() {
        return List.of();
    }

}
