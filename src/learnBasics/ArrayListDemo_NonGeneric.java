package learnBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_NonGeneric {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		arr.add(234);
		arr.add("Subodh");
		arr.add("Subodh");
		arr.add(230.54);
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			
			Object value = itr.next();
			System.out.println("Value of the Itr is: "+value);
		}

	}

}
