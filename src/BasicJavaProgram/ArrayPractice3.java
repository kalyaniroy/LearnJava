package BasicJavaProgram;

import java.util.Scanner;

public class ArrayPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter no.");
		int ar[]= new int[4];
		
		for (int i=0; i<=3; i++)
		{
			ar[i] sc.nextInt();
		}
		
		System.out.println("Elements are :");
		
		ArrayPractice3 obj = new ArrayPractice3();
		obj.arrayPractice(ar);
		
	}

	public void arrayPractice (int arr[]) {
	for (int i=0; i<=3; i++)
	{
		System.out.println(arr[i]);
	}
	}
	

}
