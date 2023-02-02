package learnBasics;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<>();
		hs.add("Subodh");
		hs.add("Mintu");
		hs.add("321");
		hs.add("sfsdfs");
		
		//System.out.println(hs);
		
		for(String strhs: hs) {
			
			System.out.println(strhs);
		}
	}

}
