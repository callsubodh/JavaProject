package InterviewCode;

public class Palindrome {
	
	static String value = "malayalam";
	static Character res2=null;
	static String obj="";
	static Boolean isPalin = false;
	
	public static void main(String[] args) {
		
		checkPalin(value);
		if(isPalin) {
			System.out.println("It's a Palindrome.");
		}else {
			System.out.println("It's not a Palindrome.");
		}
		
	}
	
	public static boolean checkPalin(String str) {
		
		System.out.println(str);
		int count = str.length();
		
		for(int i=count-1; i>=0; i--) {
			
			obj = obj + str.charAt(i);
			
			if(i==0) {
				System.out.println(obj);
		
				if(str.equalsIgnoreCase(obj)) {				
					isPalin = true;
			}else {
				
				isPalin = false;
			}
				
		}
	}
		return isPalin;

	}

}
