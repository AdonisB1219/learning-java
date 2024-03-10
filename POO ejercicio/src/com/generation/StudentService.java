package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class StudentService
{
    private HashMap<String, Course> courseList = new HashMap<>();
    private HashMap<String, Student> students = new HashMap<>();
    private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }//constructor

    public void enrollStudents( String courseName, String studentID ) throws CourseNotFoundException, StudentNotFoundException
    {
    	if(!courseList.containsKey(courseName)) {
    		throw new CourseNotFoundException();
    	}
        if(students.containsKey(studentID)) {
        	throw new StudentNotFoundException();

        }
        	Course course = courseList.get( courseName );
            	if ( !coursesEnrolledByStudents.containsKey( studentID ) ) {
            		coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
            		students.get(studentID).addCourse(course);
            	} //if agregar estudiante
            	coursesEnrolledByStudents.get( studentID ).add( course );

    }//enrollStudents
    
    
    

    public void unEnrollStudents( String courseName, String studentID ) throws CourseNotFoundException, StudentNotFoundException
    {
    	
    	if(!courseList.containsKey(courseName)) {
    		throw new CourseNotFoundException();
    	}
        if(students.containsKey(studentID)) {
        	throw new StudentNotFoundException();

        }
            Course course = courseList.get( courseName );
                if ( coursesEnrolledByStudents.containsKey( studentID ) )
                {
                    coursesEnrolledByStudents.get( studentID ).remove( course );
                }
            
    }//unEnrollStudents

    public void showEnrolledStudents(String courseId) throws CourseNotFoundException{
    	Course cursoConId = null;
    	for (String curso : courseList.keySet()) {
    		if (curso == courseId) {
    			cursoConId = courseList.get(curso);
    		}
    	}
    	if (cursoConId != null) {
    	System.out.println("+++++++++    Lista de estudiantes inscritos en el curso " + courseId + "    ++++++++++");
        for (String estudiante : coursesEnrolledByStudents.keySet()) {
			for(Course curso : coursesEnrolledByStudents.get(estudiante)) {
				if (curso.equals(cursoConId)) {
					System.out.println(students.get(estudiante)); 	
				}
			}
		}
    	} else {
    		throw new CourseNotFoundException();
    	}
    }//shorEnrolledStudents

    public void showAllCourses(){
    	System.out.println("+++++++++    Cursos   ++++++++++");
        for (Course curso : courseList.values()) {
        		System.out.println(curso);
        }
    }


	public void setStudents(String id, Student estudiante) {
		this.students.put(id, estudiante);
	}

    
}
