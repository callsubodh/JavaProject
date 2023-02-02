package learnBasics;

public class Polymorphism_Overriding_Child extends Polymorphism_Overriding_Parent{
	
	public void display() {
		
		System.out.println("This is child class.");
	}
	
	public void displayChild() {
		
		System.out.println("This is display child method in Child class.");
	}
	
	public static void main(String[] args) {
		
		Polymorphism_Overriding_Parent childobj= new Polymorphism_Overriding_Child();
		childobj.display();
		//childobj.displayChild();
		childobj.displayParent();
		
	}

}
