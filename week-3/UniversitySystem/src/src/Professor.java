package src;

//0.0 Identity
	public class Professor {
	
//1.1 List of Properties
	
		private String EmployeeID;
		private String ProfessorName;
		private String Prof_Specialization;
		private int YearOfExperience;
		private static int counter = 0;

//2.1 Constructor

	public Professor(String EmployeeNID,String Professor_Name,String Professor_Spec,int Exp){
		this.EmployeeID = "P-" + counter++;
		
		if(Professor_Name == null || Professor_Name.isBlank()) {
			throw new IllegalArgumentException("The professor's name must not be null");
		}
		this.ProfessorName = Professor_Name;
		
		if(Professor_Spec == null || Professor_Spec.isBlank()) {
			throw new IllegalArgumentException("The professor's specialization must not be null");
		}
		this.Prof_Specialization = Professor_Spec;
		
		if(YearOfExperience < 0) {
			throw new IllegalArgumentException("Not Negative, Bozo!!!");
		}
		this.YearOfExperience = Exp;
		
		
}
//2.2Get/Set Methods

	public String getEmployeNoID(){
		return EmployeeID;
	}
	public String getProfessorName(){
		return ProfessorName;	
	}
	public String getProfessorSpec(){
		return Prof_Specialization;		
	}
	public int getAcademicYears(){
		return YearOfExperience;
	}
	
	public void setNewProfName(String ProfName) {
		this.ProfessorName = ProfName;
	}
//2.4 Other Methods
	public String AcademicTitle() {
		if(YearOfExperience == 0 || YearOfExperience <=5) 
			return "Assisant Professor";
		
		if(YearOfExperience > 10) 
		 	return "Professor";
		else
			return "Associate Professor";
		}


	public String isExperienced(){
		if(YearOfExperience > 5) 
		 	return "Experienced";
		else
			return "Not experienced";
	}
	
	public void completeAnotherYear() {
		
	}
	public String toString() {	
		return "The professor  with the employee ID : " + EmployeeID + 
			   " named " + ProfessorName + ", has a specialization on " + Prof_Specialization + 
			   ".Also He/she has around " + YearOfExperience + " years of experience" + ".";
	}
}