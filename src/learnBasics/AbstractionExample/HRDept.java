package learnBasics.AbstractionExample;

public class HRDept extends ITDept {

	public static void main(String[] args) {
		
		ITDept obj = new HRDept();
		obj.employeeDetails();
		obj.salary();
		obj.work();
		
		System.out.println("===========================");
		
		HRDept obj2 = new HRDept();
		obj2.employeeDetails();
		obj2.salary();
		obj2.work();
		obj2.bonus();
		
		System.out.println("===========================");
		
		HRDept.empId();

	}


	public void salary() {
		System.out.println("Salary is 5 lpa implemented in HR Dept class");
		ITDept.empId();
		
	}

	public void bonus() {
		System.out.println("Bonus is 2 lpa implemented in HR Dept class");
		
	}

}
