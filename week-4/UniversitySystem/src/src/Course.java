package src;

//0.0 Identity

public class Course {
	
	//1.1 List of Properties
	
	private final String courseCode;
	private String title;
	private int credits;
	private String semester;
	private static int counter = 0;
	
		//2.1Constructor
	
		public Course(String CourseID,String Title,int Credits,String semester) {
			if(CourseID == null || CourseID.isBlank()) {
				throw new IllegalArgumentException("courseID must not be blank or null");
			}
			this.courseCode = "CS" + counter++;
			
			if(Title == null || Title.isBlank()) {
				throw new IllegalArgumentException("courseID must not be blank or null");
			}
			this.title = Title;
			
			if(credits < 0 || credits > 6) {
				throw new IllegalArgumentException("Credits can not be negative or higher than 6");
			}
			this.credits = Credits;
			
			if(semester == null || semester.isBlank()) {
				throw new IllegalArgumentException("semester must not be blank or null");
			}
			this.semester = semester;
		}
		//2.2 Get/Set methods
		
		public String getCourseCode() {
			return courseCode;
		}
		
		public String getTitle() {
			return title;
		}
		
		public int getCredits() {
			return credits;
		}
		
		public String getSemester() {
			return semester;
		}
		
		public void setTitle(String newTitle) {
			this.title = newTitle;
		}
		
		public void setCredits(int newCredits) {
			this.credits = newCredits;
		}
		
		public void setSemester(String newSemester) {
			this.semester = newSemester;
		}
		
		public String fullName() {
			return courseCode + " : " + title ;
		}
		
		public boolean isMajorCourse() {
			if(getCredits() > 3 && getCredits() <= 6 ) {
				return true;
			}
			else if(getCredits() < 0 || getCredits() > 6 ) {
				return false;
			}
			else {
				return false;
			}
				
			
		}
		@Override
		
		public String toString() {
			return "The course ID : " + courseCode + ", title : " + title + ", credits : " + credits + "and semester : " + semester;
		}
}