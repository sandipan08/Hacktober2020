// Program to left rotate the elements of an array

import java.util.*;
public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n,i;
	    n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
	
		System.out.println("Enter the array element ");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
//		for(int j:a)
//			System.out.println(j);
		
		for(i=0;i<n;i++)
		{
			b[n-1-i]=a[i];
			//a[i]=scan.nextInt();
		}
		for(int j:b)
		System.out.println(j);
		
	}

}


