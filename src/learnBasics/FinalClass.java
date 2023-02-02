package learnBasics;

public class FinalClass {
	
	final String PANCARD;

	public FinalClass(String pancard) {
		
		PANCARD = pancard;
	}

	public static void main(String[] args) {
		
		FinalClass fc = new FinalClass("XYZ");
		fc.display();
	}
	
	public void display() {
		
		System.out.println("Pancard details are: "+ PANCARD);
		
	}

}
