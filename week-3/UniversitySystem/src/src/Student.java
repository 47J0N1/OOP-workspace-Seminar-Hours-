package src;


public class Student {

    private String StudentId;
    public  String name;
    private double Gpa;
    private int enrollmentYear;

        public Student(String StudentId,String name,double Gpa,int enrollmentYear){

        this.StudentId = "S-001";
        this.name = "Michael Jackson";
        this.Gpa = 3.92;
        this.enrollmentYear = 2025;
       

}

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
}