package Collections;

import java.util.HashMap;

public class CompareHashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map1=new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		
		HashMap<String, Integer> map2=new HashMap<>();
		map2.put("C", 1);
		map2.put("A", 2);

		map1.equals(map2);
	}

}
