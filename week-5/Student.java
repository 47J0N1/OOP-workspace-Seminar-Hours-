package src;

import java.util.List;
import java.util.ArrayList;

//0.Identity
public class Student {
	
//1.1.List of Properties	
	
    private String StudentId;
    private String name;
    private double Gpa;
    private final int enrollmentYear;
    private int currentYear = 2026;
    private static int counter = 0;
    private final static int MAX_COURSES = 6;
    private final List <Course> Courses = new ArrayList<>();
    
//1.1.Constructor
    
        public Student(String StudentId,String name,double Gpa,int enrollmentYear){
        
        this.StudentId = "S-" + counter++;
        if(name == null || name.isBlank()) {
        	throw new IllegalArgumentException("Name must not be null or blank!!");
        }
        this.name = name;
        if(Gpa < 0 || Gpa > 4) {
    		throw new IllegalArgumentException("The given Gpa must between 0 and 4!!");
    	}
        this.Gpa = Gpa;
        if(enrollmentYear <2000 || enrollmentYear > currentYear )
        	throw new IllegalArgumentException("Your enrollment year has to be between 2000 and the year we are on!! ");
        this.enrollmentYear = enrollmentYear;
       

}
//2.2.Get/Set methods
        
        public String getStudentId() {
        	return StudentId;	
        }
        public String getname() {
        	return name;	
        }
        public double getGpa() {
        	return Gpa;	
        }
        public int getenrollmentYear() {
        	return enrollmentYear;	
        }
        
        public void setStudentId(String Id) {
        	this.StudentId = Id;
        }
        public void updateGpa(double newGpa) {
        	if(newGpa < 0.0 || newGpa > 4.0) {
        		throw new IllegalArgumentException("The given Gpa must between 0 and 4");
        	}
        	this.Gpa = newGpa;
        }
//2.4 Other Methods
        
        public String academicStanding() {
        	if(Gpa == 2.0 || Gpa <= 4.0) 
        		return "Good Standing";
        		else if (Gpa == 1.5 || Gpa < 2)
        			return "Academic Probation";
        		else
        			return "Academic Warning";
        	}
        
        public int yearsEnrolled(int currentYear) {
        	
        	if(currentYear < enrollmentYear)
        		throw new IllegalArgumentException("Current year that you have put should not be smaller than the enrollment Year");
        	
        	return currentYear-enrollmentYear;
        }
        public boolean hasCourse(String courseCode) {
        	for (Course c : Courses) {
        		if(c.getCourseCode().equals(courseCode));
        		return true;
        	}
        	return false;
        	
        }
        public boolean register(Course newCourse) {
        	if(newCourse == null)
        		throw new IllegalArgumentException("Course can not be null!!");
        	else if(hasCourse(newCourse.getCourseCode()) || Courses.size() >= MAX_COURSES)
        		return false;
        	else {
        		Courses.add(newCourse);
        	return true;
        	}
        }   
        public boolean drop(String courseCode) {
            	if(courseCode == null) {
            		throw new IllegalArgumentException("Course can not be null!!");
            	}
            	if(hasCourse(courseCode)) return false;
            	for (int i = 0; i < Courses.size(),i++) {
            		if(Courses.getCourseCode(i).equals(courseCode)) Courses.remove(Courses.getCourseCode(i));
            		return true;
            	}
            	return false;
        }
        
        @Override
        
        public String toString() {
        	
        	return "Student with the ID: " + StudentId +  ", named  " + name + 
        	       ", has a grade point average of " + Gpa + 
        	       ", is enrolled in the year " + enrollmentYear + ".";
      }
      
}      