package BasicJavaProgram;

import java.util.Scanner;

public class ArrayPractice {
	
	public static void main(stringPractice[] args) {
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Please enter no.");
		 
		 int a[]= new int[5];
			
			for (int i=0; i<=4; i++)
			{
				a[i]= sc.nextInt();
			}
			 
		System.out.println("Elements are :");
		
		ArrayPractice arrObj = new ArrayPractice();
		arrObj.printArray(a);
	
	}
	
	void printArray(int ar[]) {
		for (int i=0; i<=ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
