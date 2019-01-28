package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOfEachWord {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Sentence you want reversion : ");
		
		String s=br.readLine();
		
		String s1[]=splitString(s);
		String res="";
		
		for(int i=0;i<s1.length;i++){
			 res=res+reverse(s1[i])+ " ";
		}
		
		System.out.println(res);

	}
	
	public static String[] splitString(String s){
		
		String s1[]=s.split(" ");
		return s1;
	}
	
	public static String reverse(String s){
		String res="";
		for(int i=s.length()-1;i>=0;i--){
			res=res+s.charAt(i);
		}
		return res;
		
	}

	
}
