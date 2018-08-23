package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFromStrings {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String ::");
		String s=br.readLine();
		int sum=0;
		
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				
				sum = sum + Character.getNumericValue(s.charAt(i));
			}
			
		}
		
		System.out.println("Sum is : "+sum);
		
		
		
		//remove junk characters
		
		String remove="";
		remove=s.replaceAll("[^0-9a-zA-z]", "");
		System.out.println("After removing Junk Characters : "+remove);
		

	}

}
