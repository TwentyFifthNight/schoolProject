package com.example.schoolProject.service;

import com.example.schoolProject.domain.StudentEntity;
import com.example.schoolProject.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public StudentEntity getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    @Override
    public StudentEntity getStudentByName(String name) {
        return studentRepository.findByName(name);
    }
    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public boolean exists(String name) {
        if (studentRepository.findByName(name)!=null) {
            return true;
        }
        return false;
    }
    @Override
    public StudentEntity save(StudentEntity student) {
        return studentRepository.save(student);
    }
}
