package SchoolDatabase;

public class Course implements Comparable<Course> {
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;

	// Constructor
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}

	// Getters
	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}

 public String getCourseName() {
	if (isGraduateCourse) {
		return "G" + courseDept + courseNum;
	} else {
		return "U" + courseDept + courseNum;
	}
}

	// Equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null) {
			return false;
		}
			  
		Course other = (Course) obj;
		
		if (this.numCredits == other.numCredits && this.isGraduateCourse == other.isGraduateCourse && this.courseDept.equals(other.courseDept) && this.courseNum == other.courseNum){
			return true;
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
	
	String graduteOrNo = "";
	if (isGraduateCourse) {
		graduteOrNo += "Graduate";
	} else {
		graduteOrNo += "Undergraduate";
	}
	
		return String.format("Course: %3s-%3d | Number of Credits: %02d | %s",
				courseDept, courseNum, numCredits, graduteOrNo);
	}


	
	
	@Override
public int compareTo(Course c) {
	if (this.courseNum < c.courseNum) {return -1;} 
else if (this.courseNum > c.courseNum) {return 1;} 
		else {return 0;}
}
	
}