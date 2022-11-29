package com.quanhuynh.simplereactproject.service;

import com.quanhuynh.simplereactproject.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
