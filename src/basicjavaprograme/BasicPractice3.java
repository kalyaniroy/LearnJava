package basicjavaprograme;

import java.util.Scanner;

public class BasicPractice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 input");
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
			
	}

}
