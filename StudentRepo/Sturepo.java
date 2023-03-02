package com.example.demo.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface Sturepo extends JpaRepository<Student,Integer> {

}