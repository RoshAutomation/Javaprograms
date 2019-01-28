package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperLowerCase {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String you want to enter : ");
		String s=(br.readLine());
		//int num=Integer.parseInt(s);
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<s.length();i++){
			if(i%2==0){
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
			else
				sb.append(Character.toUpperCase(s.charAt(i)));
		}
		
		System.out.println("The resultant string is : "+sb);

	}

}
