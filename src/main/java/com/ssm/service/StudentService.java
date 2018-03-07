package com.ssm.service;

import com.ssm.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public Student getStudentById(int id);
}
