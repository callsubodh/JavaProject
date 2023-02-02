package learnBasics;

public class StaticTest {
	
	public static int iStatic = 10; 
	
	public void nonStatic() { 
		
		System.out.println("can access static variable inside non-static method : " + iStatic); 
		staticMethod();
		
	} 
	
	public static void staticMethod() { 
		
		System.out.println("can access static method : " + iStatic); 
		
		
	} 
	
	public static void main(String[] args) { 
		System.out.println("Inside main method"); 
		
		StaticTest st = new StaticTest();
		st.nonStatic();
		
	} 

}
