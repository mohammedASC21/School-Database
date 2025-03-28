package SchoolDatabase;

public class GeneralStaff extends Employee {

	private String duty;

	GeneralStaff() {
		duty = "";
	}

	GeneralStaff(String duty) {
		this.duty = duty;
	}

	GeneralStaff(String deptName, String duty) {
		super.setDeptName(deptName);
		this.duty = duty;
	}

	GeneralStaff(String name, int birthYear, String deptName, String duty) {
		super(name, birthYear, deptName);
		this.duty = duty;
	}

	public String getDuty() {
		return duty;
	}
	


	

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null) {
			return false;
		}
			  
		GeneralStaff other = (GeneralStaff) obj;
		
		if (duty.equals(other.duty)){
		 return true;
			
		}
		return false;
	}
	
	
	@Override
	public String toString() {
	    return super.toString() + String.format(" GeneralStaff: Duty: %10s", duty);
	}
	
	
}