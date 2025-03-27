package SchoolDatabase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Driver_SchoolDB {

	public static void main(String[] args) {



		//Read file 
		FileInputStream fileByteStream = null; 
		Scanner scnr = null; 
		try {
			fileByteStream = new FileInputStream("SchoolDB_Initial.txt");
			scnr = new Scanner(fileByteStream);
			while (scnr.hasNext()) {
				scnr.nextLine();
				//System.out.println(scnr.nextLine());
			}
			scnr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		System.out.println();
		for (int i = 0; i <62; i++ ) {
			System.out.print("*");
		}
		System.out.println();

		System.out.println("SCHOOL DATABASE INFO:");
		System.out.println();
		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();


		System.out.println("COURSES:");
		Course course1 = new Course(true, 771,"MAT",4);
		Course course2 = new Course(true, 777,"CMP",4);
		Course course3 = new Course(true, 711,"CMP",4);
		Course course4 = new Course(true, 723,"MAT",4);
		Course course5 = new Course(false, 168,"CMP",4);
		Course course6 = new Course(false, 338,"CMP",4);

		System.out.println(course1.toString());
		System.out.println(course2.toString());
		System.out.println(course3.toString());
		System.out.println(course4.toString());
		System.out.println(course5.toString());
		System.out.println(course6.toString());   

		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}

		System.out.println();
		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();



		System.out.println("PERSONS:");
		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();


		System.out.println("EMPLOYEES:");
		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();



		System.out.println("GENERAL STAFF:");

		Faculty fac1 = new Faculty();
		Faculty fac2 = new Faculty(true);
		Faculty fac3 = new Faculty("MAT", false);
		Faculty fac4 = new Faculty("Superman", 1938,"PHY",true);

		GeneralStaff gen1 = new GeneralStaff();
		GeneralStaff gen2 = new GeneralStaff("advise students");
		GeneralStaff gen3 = new GeneralStaff("Sanitation","clean");
		GeneralStaff gen4 = new GeneralStaff("Flash Gordon", 1934,"Security","safety");

		System.out.println(gen1.toString());
		System.out.println(gen2.toString());
		System.out.println(gen3.toString());
		System.out.println(gen4.toString());

		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();


		System.out.println("FACULTY:");



		System.out.println(fac1.toString());
		System.out.println(fac2.toString());
		System.out.println(fac3.toString());
		System.out.println(fac4.toString()); 

		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}

		System.out.println();
		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();


		System.out.println("STUDENTS:");
		Student student1 = new Student();
		Student student2 = new Student(false);
		Student student3 = new Student("Math",false);
		Student student4 = new Student("Wonderwoman",1941,"JST",true);

		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());

		for (int i = 0; i <48; i++ ) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i <62; i++ ) {System.out.print("*");}
		System.out.println();
		System.out.println();






		//Menu


		Scanner scnr1 = new Scanner(System.in);

		
		// Course objects
		
		//01 Course
		boolean isGraduateCourse;
		int courseNum;
		String courseDept;
		int numCredits;
		
		System.out.println("Type true for graduate course 1 or false otherwise: ");
		isGraduateCourse = scnr1.nextBoolean();
		
		System.out.println("Enter course number for Course 1: ");
		courseNum = scnr1.nextInt();
		
		System.out.println("Enter course department for Course 1: ");
		courseDept = scnr1.next();
		
		System.out.println("Enter num credit for Course 1: ");
		numCredits = scnr1.nextInt();
		
		Course c1 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
		System.out.println("");
		
		
		
		// 02 Course
		System.out.println("Enter true for graduate course 2 or false otherwise: ");
		isGraduateCourse = scnr1.nextBoolean();

		System.out.println("Enter course number for Course 2: ");
		courseNum = scnr1.nextInt();

		System.out.println("Enter course department for Course 2: ");
		courseDept = scnr1.next();

		System.out.println("Enter num credit for Course 2: ");
		numCredits = scnr1.nextInt();

		Course c2 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
		System.out.println("");

		
		// 03 Course
		System.out.println("Enter true for graduate course 3 or false otherwise: ");
		isGraduateCourse = scnr1.nextBoolean();

		System.out.println("Enter course number for Course 3: ");
		courseNum = scnr1.nextInt();

		System.out.println("Enter course department for Course 3: ");
		courseDept = scnr1.next();

		System.out.println("Enter num credit for Course 3: ");
		numCredits = scnr1.nextInt();

		Course c3 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
		System.out.println("");

		
		
		// Faculty objects
		String nameFaculty;
		int birthYear;
		String deptName;
		boolean isTenured;

		// 01 Faculty
		System.out.println("Enter name for Faculty 1: ");
		nameFaculty = scnr1.next();
		scnr1.nextLine();
		
		System.out.println("Enter birth year for Faculty 1: ");
		birthYear = scnr1.nextInt();

		System.out.println("Enter department name for Faculty 1: ");
		deptName = scnr1.next();
		scnr1.nextLine();
		
		System.out.println("Enter true/false for isTenured for Faculty 1: ");
		isTenured = scnr1.nextBoolean();

		Faculty f1 = new Faculty(nameFaculty, birthYear, deptName, isTenured);
		System.out.println("");

		// 02 Faculty
		System.out.println("Enter name for Faculty 2: ");
		nameFaculty = scnr1.next();
		scnr1.nextLine();
		
		System.out.println("Enter birth year for Faculty 2: ");
		birthYear = scnr1.nextInt();

		System.out.println("Enter department name for Faculty 2: ");
		deptName = scnr1.next();
		scnr1.nextLine();
		
		System.out.println("Enter true/false for isTenured for Faculty 2: ");
		isTenured = scnr1.nextBoolean();

		Faculty f2 = new Faculty(nameFaculty, birthYear, deptName, isTenured);
		System.out.println("");
		
		
		// 03 Faculty
		System.out.println("Enter name for Faculty 3: ");
		nameFaculty = scnr1.next();
		scnr1.nextLine();

		
		System.out.println("Enter birth year for Faculty 3: ");
		birthYear = scnr1.nextInt();

		System.out.println("Enter department name for Faculty 3: ");
		deptName = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter true/false for isTenured for Faculty 3: ");
		isTenured = scnr1.nextBoolean();

		Faculty f3 = new Faculty(nameFaculty, birthYear, deptName, isTenured);
		System.out.println("");
	
		
		// GeneralStaff objects
		String nameStaff;
		int birthYearStaff;
		String dptName;
		String duty;

		// 01 GeneralStaff
		System.out.println("Enter name for GeneralStaff 1: ");
		nameStaff = scnr1.next();
		scnr1.nextLine();

		
		System.out.println("Enter birth year for GeneralStaff 1: ");
		birthYearStaff = scnr1.nextInt();

		System.out.println("Enter department name for GeneralStaff 1: ");
		dptName = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter duty for GeneralStaff 1: ");
		duty = scnr1.next();
		scnr1.nextLine();

		GeneralStaff g1 = new GeneralStaff(nameStaff, birthYearStaff, dptName, duty);
		System.out.println("");

		
		// 02 GeneralStaff
		System.out.println("Enter name for GeneralStaff 2: ");
		nameStaff = scnr1.next();
		scnr1.nextLine();

		
		System.out.println("Enter birth year for GeneralStaff 2: ");
		birthYearStaff = scnr1.nextInt();

		System.out.println("Enter department name for GeneralStaff 2: ");
		dptName = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter duty for GeneralStaff 2: ");
		duty = scnr1.next();
		scnr1.nextLine();

		GeneralStaff g2 = new GeneralStaff(nameStaff, birthYearStaff, dptName, duty);
		System.out.println("");
		

//		// 03 GeneralStaff
		System.out.println("Enter name for GeneralStaff 3: ");
		nameStaff = scnr1.next();
		scnr1.nextLine();

		
		System.out.println("Enter birth year for GeneralStaff 3: ");
		birthYearStaff = scnr1.nextInt();

		System.out.println("Enter department name for GeneralStaff 3: ");
		dptName = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter duty for GeneralStaff 3: ");
		duty = scnr1.next();
		scnr1.nextLine();

		GeneralStaff g3 = new GeneralStaff(nameStaff, birthYearStaff, dptName, duty);
		System.out.println("");

		
		// Student objects
		String nameStudent;
		int birthYearStudent;
		String major;
		boolean isGraduate;

		// 01 Student
		System.out.println("Enter name for Student 1: ");
		nameStudent = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter birth year for Student 1: ");
		birthYearStudent = scnr1.nextInt();

		System.out.println("Enter major for Student 1: ");
		major = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter true/false for isGraduate for Student 1: ");
		isGraduate = scnr1.nextBoolean();

		Student s1 = new Student(nameStudent, birthYearStudent, major, isGraduate);
		System.out.println("");

		// 02 Student
		System.out.println("Enter name for Student 2: ");
		nameStudent = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter birth year for Student 2: ");
		birthYearStudent = scnr1.nextInt();

		System.out.println("Enter major for Student 2: ");
		major = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter true/false for isGraduate for Student 2: ");
		isGraduate = scnr1.nextBoolean();

		Student s2 = new Student(nameStudent, birthYearStudent, major, isGraduate);
		System.out.println("");

		// 03 Student
		System.out.println("Enter name for Student 3: ");
		nameStudent = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter birth year for Student 3: ");
		birthYearStudent = scnr1.nextInt();

		System.out.println("Enter major for Student 3: ");
		major = scnr1.next();
		scnr1.nextLine();

		System.out.println("Enter true/false for isGraduate for Student 3: ");
		isGraduate = scnr1.nextBoolean();

		Student s3 = new Student(nameStudent, birthYearStudent, major, isGraduate);
		System.out.println("");
		
		
		
		//Add 2 new Courses to a Faculty object
		f1.addCourseTaught(c1);
		f1.addCourseTaught(c2);

		//Add 2 new Courses to a Student object
		s1.addCourseTaken(c1);
		s1.addCourseTaken(c2);

		//Add an array of 2 Courses to a Faculty object
		Course[] coursesArray = new Course[] {c1,c2};
		f2.addCoursesTaught(coursesArray);


		//Adding an array of 2 Courses to a Student object
		Course[] coursesArray1 = new Course[] {c1,c2};
		s2.addCoursesTaken(coursesArray1);
		
		// Get the Course at index (valid and invalid indexes) from a Faculty object
		System.out.println("Enter a course index for Faculty object: between 0 and " + (f1.getNumCoursesTaught() -1) + ".");
		int index = scnr1.nextInt();

		// Keep prompting until a valid index is entered
		while (index < 0 || index >= f1.getNumCoursesTaught()) {
		    System.out.println("Invalid index. Enter a valid index: ");
		    index = scnr1.nextInt();
		}

		String courseName = f1.getCourseTaught(index).getCourseName();
		System.out.println("Course is: " + courseName);
		
		

		// Get the Course at index (valid and invalid indexes) from a Student object
		System.out.println("Enter a course index for Student object: between 0 and " + (s1.getNumCoursesTaken() -1) + ".");
		int index2 = scnr1.nextInt();

		// Keep prompting until a valid index is entered
		while (index2 < 0 || index2 >= s1.getNumCoursesTaken()) {
			System.out.println("Invalid index. Enter a valid index: ");
			index2 = scnr1.nextInt();
		}

		String courseNameStudent = s1.getCourseTaken(index2).getCourseName();
		System.out.println("Course is: " + courseNameStudent);




		
		// Allow the user to select a Faculty object and a Course object from menus 
		//and query the Faculty object for the Course to determine whether the Faculty object teaches it or not.
		
		//Displaying the menu for the user to select the Faculty for query
		System.out.println("Select a Faculty to query for a Course: ");
		System.out.println("1. " + f1.getName());
		System.out.println("2. " + f2.getName());
		System.out.println("3. " + f3.getName());

		// Storing the user choice for faculty
		int facultyChoice = scnr1.nextInt();
		
		// Keep prompting until a valid choice is entered
		while (facultyChoice < 0 || facultyChoice > 3) {
			System.out.println("Invalid choice. Enter a valid choice: ");
			facultyChoice = scnr1.nextInt();
		}

		//assigning the user choice to the selectedFaculty
		Faculty selectedFaculty = null;
		if (facultyChoice == 1) {selectedFaculty = f1;}
		else if (facultyChoice == 2) {selectedFaculty = f2;}
		else if (facultyChoice == 3) {selectedFaculty = f3;}
		
		//Displaying the menu for the user to select the Course for query
		System.out.println("Select a Course to query: ");
		System.out.println("1. " + c1.getCourseName());
		System.out.println("2. " + c2.getCourseName());
		System.out.println("3. " + c3.getCourseName());
		
		// Storing the user choice for Course
		int courseChoice = scnr1.nextInt();
		
		// Keep prompting until a valid choice is entered
		while (courseChoice < 0 || courseChoice > 3) {
			System.out.println("Invalid index. Enter a valid choice: ");
			courseChoice = scnr1.nextInt();
		}
		
		//assigning the user choice to the selectedFaculty
		Course selectedCourse = null;
		if (courseChoice == 1) {selectedCourse = c1;}
		else if (courseChoice == 2) {selectedCourse = c2;}
		else if (courseChoice == 3) {selectedCourse = c3;}
		
		//using teachCourse from Faculty class that return true or false depend on whether the Faculty teaches the selected course
		boolean teach = selectedFaculty.teachCourse(selectedCourse);
		
		if (teach) {
			System.out.println(selectedFaculty.getName() + " teaches " + selectedCourse.getCourseName() + " course\n");
		}else {
			System.out.println(selectedFaculty.getName() + " don't teaches " + selectedCourse.getCourseName() + " course\n");
		}
		

		
		
//		Determine which Faculty object teaches the most and the least courses.
		
		//Creating a array to store all the faculty objects to loop through it 
		Faculty[] facultyArray = {f1, f2, f3};
		
		//assigning the first index of facultyArray to maxFaculty and minFaculty
		Faculty maxFaculty = facultyArray[0];
        Faculty minFaculty = facultyArray[0];
        int maxCourses = facultyArray[0].getNumCoursesTaught();
        int minCourses = facultyArray[0].getNumCoursesTaught();

        for (int i = 0; i < facultyArray.length; i++) {
            int courses = facultyArray[i].getNumCoursesTaught();
            if (courses > maxCourses) {
                maxCourses = courses; //Assigning the maximum number of courses a faculty teaches to maxCourses
                maxFaculty = facultyArray[i];  //getting the which faculty teaches the  maximum number of courses
            }
            if (courses < minCourses) {
                minCourses = courses;
                minFaculty = facultyArray[i];
            }
        }

        System.out.println(maxFaculty.getName() + " teaches the most courses of " + maxCourses + " courses. \n");
        System.out.println(minFaculty.getName() + " teaches the least courses of " + minCourses + " courses. \n");

		
		
		
		
//        Determine which Course is the minimum of all Course objects in the catalog.
        Course[] courseArray = {c1, c2, c3};
        Course minCourse = courseArray[0];

        for (int i = 0; i < courseArray.length; i++) {
            if (courseArray[i].compareTo(minCourse) < 0) { // -1 < 0  //Comparing the course number of each course object 	  
                minCourse = courseArray[i]; 				// and if the compareTo method return -1 then that course has the minimum number
            }
        }

        System.out.println("The course with the smallest course number is: " + minCourse.getCourseName() + "\n");

        
//      Determine which Course is the maximum of all Course objects in the catalog.
      Course maxCourse = courseArray[0];

      for (int i = 0; i < courseArray.length; i++) {
          if (courseArray[i].compareTo(maxCourse) > 0) { // 1 > 0    // if the compareTo method return 1 then that course has the maximum number
        	  maxCourse = courseArray[i];
          }
      }

      System.out.println("The course with the largest course number is: " + maxCourse.getCourseName() + "\n");

        
        
      
      
//      Determine which Student has the most and least credits.
      
    //Creating a array to store all the student objects to loop through it 
      Student[] studentArray = {s1, s2, s3};

    //assigning the first index of facultyArray to maxStudent and minStudent
      Student maxStudent = studentArray[0];
      Student minStudent = studentArray[0];
      int maxCredits = maxStudent.getTotalCredits();
      int minCredits = minStudent.getTotalCredits();

      for (int i = 1; i < studentArray.length; i++) {
          int totalCredits = studentArray[i].getTotalCredits();
          if (totalCredits > maxCredits) {  //if the totalCredits is greater than maxCredits then assign totalCredits to maxCredits since the new maximum is in totalCredits
              maxCredits = totalCredits; //getting the maximum number of credit a student has 
              maxStudent = studentArray[i]; //getting the which Student has the  maximum number of credit
          }
          if (totalCredits < minCredits) {
              minCredits = totalCredits;
              minStudent = studentArray[i];
          }
      }

      System.out.println(maxStudent.getName() + " has the most credit of " + maxCredits + " credits. \n");
      System.out.println(minStudent.getName() + " has the least credit of " + minCredits + " credits. \n\n");



  
  
  
        
        
		
		//Display all the Objects using toString on the console 
		System.out.println("COURSES: ");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println("");
        
        System.out.println("FACULTY: ");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println("");
        
        System.out.println("GENERAL STAFF: ");
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());
        System.out.println("");
        
        System.out.println("STUDENTS: ");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println("");
        
        
        
     // Write all of the Object details to a plain text output file
        
        try {
        	String filePath = "SchoolDB_Updated.txt";
        	FileWriter file = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(file);

            // Writing Courses
            writer.write("COURSES:");
            writer.newLine();
            writer.write(c1.toString());
            writer.newLine();
            writer.write(c2.toString());
            writer.newLine();
            writer.write(c3.toString());
            writer.newLine();

            // Writing Faculty
            writer.write("FACULTY:");
            writer.newLine();
            writer.write(f1.toString());
            writer.newLine();
            writer.write(f2.toString());
            writer.newLine();
            writer.write(f3.toString());
            writer.newLine();

            // Writing GeneralStaff
            writer.write("GENERAL STAFF:");
            writer.newLine();
            writer.write(g1.toString());
            writer.newLine();
            writer.write(g2.toString());
            writer.newLine();
            writer.write(g3.toString());
            writer.newLine();

            // Writing Students
            writer.write("STUDENTS:");
            writer.newLine();
            writer.write(s1.toString());
            writer.newLine();
            writer.write(s2.toString());
            writer.newLine();
            writer.write(s3.toString());
            writer.newLine();

            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        scnr1.close();


	}
	

}