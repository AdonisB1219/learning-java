import java.util.ArrayList;

public class Courses {
	String courseName;
	String professorName;
	int year;
	ArrayList<Student> students = new ArrayList<Student>();
	
	public Courses(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}//Constructor
	
	   public void enroll(Student student){
		   students.add(student);
	   }
	   
	   public void enroll(Student[] students){
		   for (Student s:students) {
			  enroll(s);
		   }
	   }

		   public void unEnroll(Student student){
			   if(students.contains(student)) {
				   students.remove(student);
			   }
		   }

		   public int countStudents(){
			   return students.size();
		   }
		   
		   public int bestGrade(){
			   int higherGrade = 0;
		       for (Student s: students) {
		    	   higherGrade = (s.grade > higherGrade)?s.grade:higherGrade;
		       };//For each
		       return higherGrade;
		   }//bestGrade
		   
		   public float avgGrade(){
			   float promedio = 0f;
			   for (Student s: students) {
		    	   promedio += s.grade;
		       };//For each
			   promedio /= students.size();
		       return promedio;
		   }
		   
		   public void sortByGrade(){
			   for (int i=0; i < countStudents()-1; i++) {
				   if (students.get(i+1).grade > students.get(i).grade) {
					   Student siguiente = students.get(i+1);
					   Student actual = students.get(i);
					   students.set(i+1, actual);
					   students.set(i, siguiente);
					   System.out.println("Se intercambiaron " + siguiente.firstName + actual.firstName);
					   }//if
					   
				   }//for 
			   
			   for (Student s: students) {
		    	   System.out.println(s.firstName + " " + s.lastName + " : " + s.grade);
		       };//For each
		   }//sortByGrade
		   
		   public void aboveAvg(){
			   for (Student s: students) {
				   String res = (s.grade > avgGrade())?"Congrats, you're above the average":"Not above the average";
		    	   System.out.println(s.firstName + " " + s.lastName + " : " + res + " " + s.grade);
		       };//For each
		   }//sortByGrade
		   
		   
		   public static void main(String[] args) {
			Courses course = new Courses("Programación Java", "JC", 1);
			Student michell = new Student("Michell", "Cazares", 1, 60, 1);
			Student michael = new Student("Michael", "Razo", 14, 80, 2);
			Student daniela = new Student("Daneila", "Heredia", 14, 65, 4);
			Student[] arreglo = {daniela, michael, michell};
//			course.enroll(arreglo);
			

			
			course.enroll(michael);
			course.enroll(michell);
			course.enroll(daniela);
			System.out.println(course.bestGrade());
			System.out.println(course.avgGrade());
			System.out.println(course.countStudents());
//			course.unEnroll(daniela);
//			System.out.println(course.countStudents());
			course.sortByGrade();
			course.aboveAvg();

		}
	
		   
}//class Courses
