package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOfString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String you want to calculate the length : ");
		
		String s=br.readLine();
		
		System.out.println("The Length of the String is : "+lengthOfString(s));
		
		
		
		String blah = "HellO";
		int count = 0;
		for (char c : blah.toCharArray()) {
		    count++;
		}
		System.out.println("blah's length: " + count);
		

	}
	
	public static int lengthOfString(String s){
		
		int i=s.lastIndexOf("");
		return i;
	}

}
