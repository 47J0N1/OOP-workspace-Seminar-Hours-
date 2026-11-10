package src;

//0.Identity
public class Student {
	
//1.1.List of Properties	
	
    private String StudentId;
    private String name;
    private double Gpa;
    private final int enrollmentYear;
    private int currentYear = 2026;
    private static int counter = 0;
    
    
//1.1.Constructor
    
        public Student(String StudentId,String name,double Gpa,int enrollmentYear){
        
        this.StudentId = "S-100" + counter++;
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
        
        @Override
        
        public String toString() {
        	
        	return "Student with the ID: " + StudentId +  ", named  " + name + 
        	       ", has a grade point average of " + Gpa + 
        	       ", is enrolled in the year " + enrollmentYear + ".";
      }
      
}      