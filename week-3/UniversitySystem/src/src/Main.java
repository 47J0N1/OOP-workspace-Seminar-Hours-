package src;

public class Main {

	public static void main(String[] args) {
		
//Creating new objects named Student
		
		Student FirstStudent = new Student("","Marina Vjollca", 2.1,2002);
		Student SecondStudent = new Student("","Luana  Vjollca",3.8,2001);
		Student ThirdStudent = new Student("" ,"Michael Jackson",4.0,2005);
		Student FourthStudent = new Student("","Super Mario",1.1,2004);
	
		System.out.println(FirstStudent);
		System.out.println(SecondStudent);
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		Professor FirstProf = new Professor("","Evis Plaku","(AI) and Robotics",15);
		Professor SecondProf = new Professor("","Tester","Dummy Testing",6);
		
		System.out.println(FirstProf  + "\nHis Academic Title is: " + FirstProf.AcademicTitle());
		System.out.println(SecondProf + "\nHis Academic Title is: " + SecondProf.AcademicTitle());
//Getting one of the attributes to the corresponding objects
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Enrollment year for the 1st Student is : " + FirstStudent.getenrollmentYear());
		System.out.println("The grade point average of the 2nd Student is : " + SecondStudent.getGpa());
		System.out.println("The name of 3rd Student is : " + ThirdStudent.getname());
		System.out.println("The Unique ID of the 4th Student is : " + FourthStudent.getStudentId());
		
//Updating GPA for one specific student
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.print("The GPA of the first Student changed from " + FirstStudent.getGpa() + " to this ");
		FirstStudent.updateGpa(3.5);
		System.out.print(FirstStudent.getGpa());
		
	
	}

}
