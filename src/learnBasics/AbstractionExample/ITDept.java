package learnBasics.AbstractionExample;

public abstract class ITDept implements Employee {

	public void employeeDetails() {
		System.out.println("This is the Employee Details method implemented in IT Dept class.");
		
	}

	public abstract void salary();

	public void work() {
		System.out.println("This is the work method implemented in IT Dept class.");
		
	}
	
	public static void empId() {
		System.out.println("This is the static employee id method implemented in IT Dept class.");
		
	}


}
