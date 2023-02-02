package learnBasics;

public class ArrayCopy {
	
	
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,11,12,13,14,15,16};
		
		public static void main(String[] args) {
			
		ArrayCopy ac = new ArrayCopy();
		
		System.out.println(ac.arr1[1]);
		System.out.println(ac.arr2[2]);
		
		System.arraycopy(ac.arr1, 2, ac.arr2, 5, 1);
		System.arraycopy(ac.arr1, 0, ac.arr2, 2, 3);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(ac.arr2, 5, ac.arr1, 2, 2);
		
		System.out.print("array2 = ");
	    System.out.print(ac.arr2[0] + " ");
	    System.out.print(ac.arr2[1] + " ");
	    System.out.print(ac.arr2[2] + " ");
	    System.out.print(ac.arr2[3] + " ");
	    System.out.print(ac.arr2[4] + " ");	
	    System.out.print(ac.arr2[5] + " ");	
	    System.out.println(ac.arr2[6] + " ");	
	    
	    System.out.print("array1 = ");
	    System.out.print(ac.arr2[0] + " ");
	    System.out.print(ac.arr2[1] + " ");
	    System.out.print(ac.arr2[2] + " ");
	    System.out.print(ac.arr2[3] + " ");
	    System.out.print(ac.arr2[4] + " ");	
	    //System.out.print(ac.arr2[5] + " ");	
		
	}

}
