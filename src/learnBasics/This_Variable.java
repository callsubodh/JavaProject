package learnBasics;

public class This_Variable {
	
	int x, y;
	
	public This_Variable(int x, int y) {
		
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		
		This_Variable tv = new This_Variable(5,7);
		tv.sum();
		
	}
	
	public void sum() {
		
		int add = x+y;
		System.out.println(add);
	}

}
