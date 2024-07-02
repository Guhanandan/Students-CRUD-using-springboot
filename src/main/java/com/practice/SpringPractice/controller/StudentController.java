package com.practice.SpringPractice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.practice.SpringPractice.model.Student;
import com.practice.SpringPractice.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    // controller to handle the GET request for fetching all the students detail
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // controller to handle the GET request for fetching only one student details by Id
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    // controller to handle the POST request to add the student details to the database
    @PostMapping
    public Student postStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    // controller to handle the PUT request to update the student details to the database
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
        student.setId(id);
        return studentService.saveStudent(student);
    }


    // controller to handle the DELETE request and deleting the data by Id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteById(id);
    }
}
