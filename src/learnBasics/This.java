package learnBasics;

public class This {
	
	public This() {
		this(24);
		System.out.println("This is the default constructor.");
	}
	
	public This(String name) {
		
		System.out.println("This is the constructor with "+name);
	}

	public This(int number) {
		this("Mintu");
		System.out.println("This is the constructor with "+number);
	}
	
	public void display() {
		
		System.out.println("This is display method.");
	}
	
	public static void main(String[] args) {

		This obj = new This();
		//This objname = new This("Subodh");
		//This objno = new This(10);
		obj.display();
	}

}
