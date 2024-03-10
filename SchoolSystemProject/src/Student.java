
public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;
    }
    
    public Student(String firstName, String lastName, int registration) {
    	this(firstName, lastName, registration, 0, 0);
    }
    
    public Student(String lastName, int registration, int grade, int year) {
    	this("Sin datos de nombre", lastName, registration, grade, year);
    }
    
    
    public void printFullName(){
        System.out.println(this.firstName + " " + this.lastName);
     }

     public boolean isApproved(){
    	 boolean res = (this.grade>=60)? (true): (false);
    	 return res;
    	 //return (this.grade>=60);
     }

     public int changeYearIfApproved(){
    	 if (isApproved()) {
    		 year ++;
    		 System.out.println("Congratulations!");
    	 }
         return year;
     }
     

}//class Student
