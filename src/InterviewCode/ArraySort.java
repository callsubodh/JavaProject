package InterviewCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		sortArrayList(arr);
		
		System.out.println("Sorted Arraylist output is: "+arr);

	}
	
	public static void sortArrayList(List<String> alist) {
		
		alist.add("Jan");
		alist.add("Feb");
		alist.add("Mar");
		alist.add("Apr");
		alist.add("May");
		alist.add("Jun");
		alist.add("Jul");
		alist.add("Aug");
		alist.add("Jan");
		alist.add("apr");
		alist.add("aug");
		
		
		System.out.println("Arraylist output without sort is: "+alist);

		Collections.sort(alist, String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("Arraylist output with sort is: "+alist);

		Collections.sort(alist, Collections.reverseOrder());
		
		//Collections.sort(alist, String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("Arraylist output with reverse sort is: "+alist);
		
	}

}
