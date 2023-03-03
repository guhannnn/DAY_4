package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.student;

public interface StudentRepo extends JpaRepository<student,Integer> {
    
}
