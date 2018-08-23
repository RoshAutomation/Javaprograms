package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofDigits {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String you want to enter : ");
		String s=br.readLine();
		int sum=0;
		String s1=s.replaceAll("[^0-9]", "");
		System.out.println(s1);
		long n=Integer.parseInt(s1);
		
		while (n>0){
			int r=(int) (n%10);
			sum=sum+r;
			n=n/10;
		}
		
		System.out.println("Sum is : "+sum);

	}

}
