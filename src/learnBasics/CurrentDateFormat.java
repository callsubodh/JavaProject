package learnBasics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Date dte = new Date();
			
			DateFormat df = new SimpleDateFormat("MM_D_YYYY HH:MM:SS");
			
			System.out.println(df.format(dte));
			
			//System.out.println(System.getProperty("user.dir"));
		}

}
