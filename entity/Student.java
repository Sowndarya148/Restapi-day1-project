package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    
	@Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="MARKS")
    private int marks;
    
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public int getMarks()
    {
    	return marks;
    }
    public void setMarks(int marks)
    {
    	this.marks=marks;
    }
    public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
    public Student()
    {
    	
    }
}