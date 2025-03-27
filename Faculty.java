package SchoolDatabase;

public class Faculty extends Employee {
	private Course[] coursesTaught; 
	private int numCoursesTaught;   
	private boolean isTenured;      


	public Faculty() {
		super(); 
		this.coursesTaught = new Course[100]; 
		this.numCoursesTaught = 0;
		this.isTenured = false;
	}


	public Faculty(boolean isTenured) {
		super(); 
		this.coursesTaught = new Course[100]; 
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}


	public Faculty(String deptName, boolean isTenured) {
		super(deptName); 
		this.coursesTaught = new Course[100]; 
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}


	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name, birthYear, deptName); 
		this.coursesTaught = new Course[100]; 
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}


	public boolean isTenured() {
		return isTenured;
	}

	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}

	public void setIsTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}

	public void addCourseTaught(Course course){
		if(numCoursesTaught < coursesTaught.length){
			coursesTaught[numCoursesTaught] = course;
			numCoursesTaught++;  
		}

	}
	public void addCoursesTaught(Course[] courses){
		for (int i = 0; i < courses.length; i++){
			if(numCoursesTaught < coursesTaught.length){
				coursesTaught[numCoursesTaught] = courses[i];
				numCoursesTaught++;  
			}
		}
	}

	public Course getCourseTaught(int index) {
		if (index < 0 || index >= coursesTaught.length) {
			return null; 
		}
		return coursesTaught[index]; 
	}



	public String getCourseTaughtAsString(int index){
		if (index < 0 || index >= numCoursesTaught || coursesTaught[index] == null) {
			return "";
		}
		return coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
	}


	public String getAllCoursesTaughtAsString() {

		String str = "";
		for (int i = 0; i < numCoursesTaught; i++) {
			str += getCourseTaughtAsString(i);
			if (i < numCoursesTaught - 1) {
				str += ", ";
			}
		}
		return str;


	}
	
	
	//For Menu
	public boolean teachCourse(Course course) {
		for (int i = 0; i <numCoursesTaught; i++) {
			if (coursesTaught[i].equals(course)) {
				return true;
			}
		}
		return false;
	} 


	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Faculty)) {
            return false;
        }
        
        Faculty other = (Faculty) obj;
        return super.equals(other) && this.isTenured == other.isTenured && this.numCoursesTaught == other.numCoursesTaught;
    }


	@Override
	public String toString() {
		String TenturedOrNot;
		if (isTenured) {TenturedOrNot = "Is Tenured";} 
		else {TenturedOrNot = "Not Tenured";}
		
		return super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", 
				TenturedOrNot, numCoursesTaught, getAllCoursesTaughtAsString());
    }




	@Override

	public int compareTo(Person p) {
		if (p instanceof Faculty) {
			Faculty other = (Faculty) p;
			if (this.numCoursesTaught == other.getNumCoursesTaught()){return 0;}
			else if (this.numCoursesTaught < other.getNumCoursesTaught()){return -1;}
			else {return 1;}

		}
		else {return super.compareTo(p);}

}




}






