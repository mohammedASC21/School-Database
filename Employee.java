package SchoolDatabase;

public class Employee extends Person {
	private String deptName;
	private int employeeID;
	private static int numEmployees = 0; 


	
	public Employee() {
		super(); 
		this.deptName = "";
		this.employeeID = ++numEmployees; 

	}

	
	public Employee(String deptName) {
		super(); 
		this.deptName = deptName;
		this.employeeID = ++numEmployees; 
	}

	
	public Employee(String name, int birthYear, String deptName) {
		super(name, birthYear); 
		this.deptName = deptName;
		this.employeeID = ++numEmployees; 

	}

	
	public String getDeptName() {
		return deptName;
	}

	public static int getNumEmployees() {
		return numEmployees;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || !(obj instanceof Employee)) {
	        return false;
	    }
	    
	    Employee other = (Employee) obj;
	    
	    return super.equals(other) && this.employeeID == other.employeeID && this.deptName.equals(other.deptName);
	}
	
	
	
	
	@Override
		public String toString() {
		return super.toString() + String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
	}

	
	
	@Override
	
public int compareTo(Person p) {
if (p instanceof Employee) {
		Employee other = (Employee)p;
	if (this.employeeID == other.getEmployeeID()){return 0;}
	else if (this.employeeID < other.getEmployeeID()){return -1;}
	else {return 1;}
	    
	}
	else {return super.compareTo(p);}
		
	}
	
}