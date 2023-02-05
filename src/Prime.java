import java.util.Scanner;

public class Prime {

	public static int p, m, i=2, flag=0;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		p = s.nextInt();

		if(p==0 || p==1) {
			System.out.println("it is not a prime number."+p);
		}
		else {

			for(i=2;i<p;i++) {
				if(p%i==0) {
					System.out.println("-----It's not a prime number: "+p);
					flag=1;
					break;
				}
			} 
			
			if(flag==0) {
				System.out.println("=====It's a prime  number."+p);
			}
			
			}
		s.close();
	}
}

