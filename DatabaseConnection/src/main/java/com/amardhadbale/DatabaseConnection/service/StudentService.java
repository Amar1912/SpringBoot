package com.amardhadbale.DatabaseConnection.service;

import com.amardhadbale.DatabaseConnection.dto.StudentDto;
import com.amardhadbale.DatabaseConnection.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
