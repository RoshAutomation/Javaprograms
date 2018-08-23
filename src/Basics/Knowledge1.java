package Basics;

public class Knowledge1 {

	static int number;
	static String name;
	
	 public Knowledge1(int no, String nm){
			this.number=no;
			this.name=nm;
		}
		
	public static void main(String[] args) {
		
		Knowledge1 k=new Knowledge1(1,"Roshan");
		
		System.out.println("Number is : "+number);
		System.out.println("Name is : "+name);
		
		
	}

}
