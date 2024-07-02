package com.practice.SpringPractice.service;

import com.practice.SpringPractice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.SpringPractice.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    // GET all the Students in the database
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // GET one Student by ID
    public Optional<Student> getStudentById(Long Id){
        return studentRepository.findById(Id);
    }

    // POST one Student to the database
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    // DELETE one Student by ID
    public void deleteById(Long Id){
        studentRepository.deleteById(Id);
    }
}
