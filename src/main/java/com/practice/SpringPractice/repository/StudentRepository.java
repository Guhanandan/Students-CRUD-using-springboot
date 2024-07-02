package com.practice.SpringPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.SpringPractice.model.Student;

public interface StudentRepository extends JpaRepository<Student , Long>{

}
