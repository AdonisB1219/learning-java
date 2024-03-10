package com.generation;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.setStudents( "1030", new Student( "Carlos", "1030", 31 ) );
        studentService.setStudents( "1040", new Student( "Ian", "1020", 28 ) );
        studentService.setStudents( "1050", new Student( "Elise", "1020", 26 ) );
        studentService.setStudents( "1020", new Student( "Santiago", "1020", 33 ) );

        try {
			studentService.enrollStudents( "Math", "1030" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        studentService.showAllCourses();
        try {
			studentService.showEnrolledStudents("Math");
		} catch (CourseNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			studentService.unEnrollStudents("Math", "1030");
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			studentService.showEnrolledStudents("Math");
		} catch (CourseNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//main
}//class main
