package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string you want to do reversion : ");
		String str=br.readLine();
		
		ReverseStringUsingRecursion srev=new ReverseStringUsingRecursion();
		String result=srev.reverse(str);
		System.out.println("String after reversion is : "+result);
		
	}
	
	public String reverse(String s){
		if((s==null)||(s.length() <= 1))
			return s;
		return reverse(s.substring(1))+s.charAt(0);
		
	}

}
