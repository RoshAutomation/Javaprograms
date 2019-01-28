package Basics;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[]={5,8,9,10,11};
		int n=arr.length;
		int key=10;
		
		BinarySearch bs=new BinarySearch();
		
		int pos=binSearch(arr, 0, n-1, key);
		
		
		if(pos==-1)
			System.out.println("Key value does not exists!");
		
		else
			System.out.println("Key exists at position : "+pos);
		

	}
	
	public static int binSearch(int a[],int l, int r,int k){
		
		if(r>=l){
			
			int mid=l+(r-l)/2;
			
			if(a[mid]==k)
				return mid;
			
			if(a[mid]>k){
				return binSearch(a, l, mid-1, k);
			}
			else{
				return binSearch(a, mid+1, r, k);
			}
			
		}
		return -1;
	}

}
