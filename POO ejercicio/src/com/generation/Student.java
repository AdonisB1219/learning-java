package com.generation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
{
    private String name;

    private String id;

    private int age;

    private final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }//constructor
	
	public void addStudent(String name, String id, int age){
		Student nuevo = new Student(name, id, age);
	}
	
	public void addCourse(Course curso) {
		courseList.add(curso);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + "]";
	}
    
    
}
