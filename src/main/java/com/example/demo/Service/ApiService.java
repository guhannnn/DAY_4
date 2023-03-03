package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.student;
import com.example.demo.Repositories.StudentRepo;

@Service
public class ApiService {
	
@Autowired
StudentRepo repository;
	public Optional<student> getStudent(int id){
		return repository.findById(id);
	}

	public String updateDetails(student stu) {
		repository.save(stu);
		return "updated";
	}

	public String deleteDetails(int id) {
		repository.deleteById(id);
		return "Id deleted";
	}

	
}
