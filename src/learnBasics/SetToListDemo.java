package learnBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetToListDemo {

	public static void main(String[] args) {

		Set<String> hs = new TreeSet<>();
		hs.add("Subodh");
		hs.add("Mintu");
		hs.add("321");
		hs.add("sfsdfs");
		
		for(String strhs: hs) {
			
			System.out.println(strhs);	
			
		}
		
		ArrayList<String> arrstr = new ArrayList<>(hs);
		
		String str = arrstr.get(1);
		System.out.println("String in Array List value is: "+str);
	}

}
