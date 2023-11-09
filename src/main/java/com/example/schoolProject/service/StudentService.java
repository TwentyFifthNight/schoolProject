package com.example.schoolProject.service;

import com.example.schoolProject.domain.StudentEntity;

import java.util.List;

public interface StudentService {
    public StudentEntity getStudentById(Long id);
    public StudentEntity getStudentByName(String name);
    public List<StudentEntity> getAllStudents();
    public boolean exists(String name);
    public StudentEntity save(StudentEntity student);
}