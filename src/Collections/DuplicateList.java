package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateList {

	public static void main(String[] args) {
		
		String s="My name is Roshan Roshan. java us my fav subject";
		
		//String names[]={"Java", "Selenium", "C++","C","Ruby","Java","C","Java"};
		String names[]=s.split(" ");
		Integer count=0;
		
		HashMap<String, Integer> storeMap=new HashMap<String, Integer>();
		for(String name : names){
			
		 count=storeMap.get(name);
			if(count==null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}	
		}
		
		Set<Entry<String, Integer>> entryset=storeMap.entrySet();
		for(Entry<String, Integer> entry : entryset){
			if(entry.getValue()>1 || entry.getValue()>0){
				System.out.println("Duplicate element is : "+entry.getKey()+" time number : "+entry.getValue());
			}
			
			
		}
		

	}

}
