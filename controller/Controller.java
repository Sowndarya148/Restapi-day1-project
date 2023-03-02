package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.Service1;
@RestController
public class Controller {
	@Autowired
	private Service1 stuService;
	
	@GetMapping("/getStudent")
	public List<Student> getDetails(){
		return stuService.getAllDetails();
	}
	
	@PostMapping("/addStudent")
	public Student postDetails(@RequestBody Student s) {
		return stuService.savedetails(s);
	}
	
		@DeleteMapping("/delete/{id}")
		public void delete(@PathVariable("id") int id)
		{
			stuService.deleteDepartmentById(id);
		}
		@PutMapping("/update/{id}")
		public Student update(@PathVariable int id,@RequestBody Student s)
		{
			return stuService.update(id, s);
		
		
	}
}