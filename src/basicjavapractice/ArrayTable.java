package basicjavapractice;

import java.util.Scanner;

public class ArrayTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the input for multiplication");
		
		int i = sc.nextInt();
		
		for (int j=1; j<=10; j++)
			
			System.out.println(i + "*" +j +"="+ i*j);
	
	}
}
