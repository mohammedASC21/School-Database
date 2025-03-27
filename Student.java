package SchoolDatabase;

import java.util.Arrays;


public class Student extends Person {
	private static int numStudents = 0;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	
	public Student() {
		super();
		++numStudents;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = false;
		this.major = "undeclared";
		
	}
	public Student(boolean isGraduate) {
		super();
		++numStudents;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = "undeclared";
		
	}
	
	public Student(String major, boolean isGraduate) {
		super();
		++numStudents;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
	    this.numCoursesTaken = 0;
	    this.isGraduate = isGraduate;
	    this.major = major;
	    
	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
	    numStudents++;
	    this.studentID = numStudents;
	    this.coursesTaken = new Course[50];
	    this.numCoursesTaken = 0;
	    this.isGraduate = isGraduate;
	    this.major = major;
	    
	}
	
	//Getters and Setters



public boolean isGraduate() {
		return this.isGraduate;
}
	public int getNumCoursesTaken() {
		return numCoursesTaken;
		}
	
	public static int getNumStudents() {
		return numStudents;
		}
	public int getStudentID() {
		return this.studentID;
		}
	
	public String getMajor() {
		return this.major;
		}
	
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
		}
	
	public void setMajor(String major) {
		this.major = major;
		}
	
	
	public void addCourseTaken(Course course){
		if (numCoursesTaken < coursesTaken.length) {
			coursesTaken[numCoursesTaken] = course;
			numCoursesTaken++;
		}
	}
	
	public void addCoursesTaken(Course[] courses){
		for (int i = 0; i < courses.length; i++) {
			if (numCoursesTaken < coursesTaken.length) {
				coursesTaken[numCoursesTaken++] = courses[i];			
			}
		}
	}
		
	public Course getCourseTaken(int index){
		if (index < 0 || index >= coursesTaken.length) {
			return null; 
		}
		return coursesTaken[index]; 
		
	}
	
	public String getCourseTakenAsString(int index){
		if (index < 0 || index >= coursesTaken.length || coursesTaken[index] == null) {
			return ""; 
		}
		
		return coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum(); 
		
	}
	
	public String getAllCoursesTakenAsString(){

		String str = "";
		for (int i = 0; i < numCoursesTaken; i++) {
			str += getCourseTakenAsString(i);
			if (i < numCoursesTaken -1) {
				str += ", ";
				
			}
		}
		return str; 
		
	}
	
	
	
	
	// Method to calculate total credits
	// Used to get which student has the most and least credits
    public int getTotalCredits() {
        int totalCredits = 0;
        for (int i = 0; i < numCoursesTaken; i++) {
            totalCredits += coursesTaken[i].getNumCredits();
        }
        return totalCredits;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null) {
			return false;
		}

		Student other = (Student) obj;

		return super.equals(other) && studentID == other.studentID && numCoursesTaken == other.numCoursesTaken && isGraduate == other.isGraduate &&
	               major.equals(other.major) && Arrays.equals(coursesTaken, other.coursesTaken);

	}



	@Override
	public String toString() {
		String graduteOrNo = "";
		if (isGraduate) {
			graduteOrNo += "Graduate";
		} else {
			graduteOrNo += "Undergraduate";
		}
		
		return super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
                studentID, major, graduteOrNo, numCoursesTaken, getAllCoursesTakenAsString());
		}




	@Override

	public int compareTo(Person p) {
		if (p instanceof Student) {
			Student other = (Student) p;
			if (this.numCoursesTaken == other.getNumCoursesTaken()){return 0;}
			else if (this.numCoursesTaken < other.getNumCoursesTaken()){return -1;}
			else {return 1;}

		}
		else {return super.compareTo(p);}

}
	
	
	
	
}