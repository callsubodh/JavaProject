package Super;

public class SubClass extends Parent{
		
	public SubClass(){
		System.out.println("Inside Sub class Contructor.");
	}
	
	public SubClass(String name){
		//super(name);
		System.out.println("Inside parameterized contructor of Sub class Contructor: " +name);
	}

	public static void main(String[] args) {
		

		SubClass sc = new SubClass("Tanuj");
		
	}

}
