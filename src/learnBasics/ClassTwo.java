package learnBasics;

public class ClassTwo {
	
	private String Fname;
	private String Lname;
	private int id;
	private int age;
	
	public String getFname() {
		System.out.println("Fname value is "+Fname);
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
