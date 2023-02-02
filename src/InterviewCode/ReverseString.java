package InterviewCode;

public class ReverseString {
	
	static String str = "This is";

	public static void main(String[] args) {	
	        
		ReverseString rs = new ReverseString();
		
		//First approach
		for(int i=str.length()-1;i>=0;i--) {
		
		System.out.print(str.charAt(i));

		}
		System.out.println("\n");
	    
		// Second approach
		rs.reverseString(str);	    
	        
	    }
	
	public String reverseString(String str) {
		
	    String res="";
	        for (int i = 0; i <=str.length()-1; i++) {
	            res = str.charAt(i)+res;
	            if(i==(str.length()-1))
	            System.out.println(res);
	    }
	        return res;

	}

}

   
    
    
    
