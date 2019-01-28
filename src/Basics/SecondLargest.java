package Basics;

public class SecondLargest {

	public static void main(String[] args) {
		
		int a[]={1,6,9,3};
		int num=secondHighest(a);
		System.out.println(num);
		}
		
		
		static int secondHighest(int nums[]) {
		    int high1 = Integer.MAX_VALUE;
		    int high2 = Integer.MAX_VALUE;
		    for (int num : nums) {
		      if (num < high1) {
		        high2 = high1;
		        high1 = num;
		      } else if (num < high2) {
		        high2 = num;
		      }
		    }
		    return high2;
		 }
		
	}


