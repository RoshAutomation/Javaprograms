package Basics;

public class RotationalArray {

	public static void main(String[] args) {
		
		int a[]={0,1,1,1,2,2,2,2,2,2,2,2,0,1,2,0,1,1,1,0,0,0,2,2,1,2,0};
		
		int n=a.length;
		
		sortRot(a, n);
		
		for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();

	}
	
	public static void sortRot(int a[], int n){
		
		int c1=0,c2=0,c3=0;
		
		for(int i=0; i<n;i++){
			if (a[i]==0)
				c1++;
			if (a[i]==1)
				c2++;
			if (a[i]==2)
				c3++;	
		}
		
		for(int i=0;i<c1;i++){
			a[i]=0;
		}
		for(int i=c1;i<(c1+c2);i++){
			a[i]=1;
		}
		
		for(int i=(c1+c2);i<n;i++){
			a[i]=2;
		}
	}

}
