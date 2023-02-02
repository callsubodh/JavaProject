package Super;

public class Child extends BaseClass{

	int rate=12;
	
	public Child() {
		super();
		System.out.println("This is child class contructor.");

	}

	public static void main(String[] args) {

		Child ch = new Child();
		System.out.println(ch.rate);
		ch.showIntRateFromRBI();
		ch.IntRatePvtBank();

	}
	
	public void interestRate(int rate) {
		
		System.out.println("Interest rate in Child class is: "+rate);
	}
	
	public void showIntRateFromRBI() {
		
		System.out.println("Current Interest Rate from RBI is: "+ super.rate);
	}
	
	public void IntRatePvtBank() {
		
		super.interestRate(33);

		System.out.println("Current Interest Rate from Pvt bank is: "+rate);
	}

}
