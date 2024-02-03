package LearnJavaFromStarting;

import java.util.Scanner;

public class PrintNumUsingForLoop {

	public static void main(String[] args) {
	
		/*for(int i=1; i<=20; i++)
		{
			System.out.print(i+" ");
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		for(int i=a; i<=b; i++) 
		{
			System.out.print(i +" ");
		}
			
		
	}

}
