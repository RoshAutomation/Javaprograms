package Basics;

public class ReverseSentence {

	public static void main(String[] args) {

			String s="My Name is Roshan Kumar gupta";
			
			String sen[]=s.split(" ");
			String result="";
			
			for (int i=sen.length-1 ;i>=0;i--){
				result+=sen[i]+ " ";
				
			}
			
			System.out.println("The Sentence is : "+result);

	}

}
