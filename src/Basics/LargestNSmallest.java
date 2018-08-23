package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class LargestNSmallest {

	public static void main(String[] args) throws IOException {
	
		int lar=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n=Integer.parseInt(br.readLine());
		System.out.println(n);
		
		
		for (int i=0 ;i<n;i++){
			System.out.println("Enter the "+i+" number :");
			int num=Integer.parseInt(br.readLine());
			System.out.println(num);
			
			if(num>lar){
				lar=num;
			}
			
			if(num<small){
				small=num;
			}
		}
		
		System.out.println("The Largest number is : "+lar);
		System.out.println("The Smallest number is : "+small);
		
		

	}

}
