package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateHash {

	public static void main(String[] args) {

		int a[]={3,1,2};
		int b[]={4,5,6,2,3};
		findDupes(a, b);
	}

	
	public static void findDupes(int[] a, int[] b) {
		
	    HashSet<Integer> map = new HashSet<Integer>();
	    ArrayList<Integer> alist=new ArrayList<>();
	    for (int i : a)
	        map.add(i);
	    for (int i : b) {
	        if (map.contains(i)){
	          System.out.println("Duplicate values are : "+ i); 
	        	alist.add(i);}
	        else
	        	map.add(i);
	        continue;
	    }
	    
	    System.out.println(alist);
	    System.out.println(map);
	    
	    
	}
}
