package basicjavapractice;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of the array");
		
		int size  = sc.nextInt();
		int a[] = new int [size];
		System.out.println("Enter"+size+"numbers");
		
		for (int i=0; i<size;i++)
		{
			a[i]= sc.nextInt();
		}
		
		int temp = 0;
		for (int i=0; i<a.length-1; i++)
		{
			for (int j =i+1; j<a.length; j++)
			{
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println("Ascending order: ");
		for (int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
		 System.out.println();
		 System.out.println("Descending order: ");
		 for (int i=size-1; i>=0;i--)
		 {
			 System.out.print(a[i]+" ");
		 }

	}

}
