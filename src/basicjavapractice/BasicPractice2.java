package basicjavapractice;

import java.util.Scanner;

public class BasicPractice2 {

	public static void main(String[] args) {
		
		
		//0-18-kid; 19-60-elegible; 61-100-retired; else invalid input
		// (0-18)+5 (19-60)*2 (61-100)-10
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		
		if (age>=0 && age<=18)
		{
			System.out.println("Kid");
			System.out.println(age + 5);
			 
		}
		
		else if (age>=19 && age<=60)
		{
			System.out.println("Elegible");
			System.out.println(age * 2);
		}
		else if (age>=61 && age<=100)
		{
			System.out.println("Retired");
			System.out.println(age - 10);
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}

}
