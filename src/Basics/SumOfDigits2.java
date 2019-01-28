package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String you want to enter : ");
		String s=br.readLine();
		
		String res=" ";
		
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				
				res=res+Character.getNumericValue(s.charAt(i));
			}
		}
		
		System.out.println(res);

	}

}
