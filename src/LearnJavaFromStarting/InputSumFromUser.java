package LearnJavaFromStarting;

import java.util.Scanner;

public class InputSumFromUser {
	
	public int sum (int a,int b)
	{
	int c= a+b;
	return c;	
	}
	

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter 2 number");
		int first= sc.nextInt();
		int sec= sc.nextInt();
		
		InputSumFromUser ob = new InputSumFromUser();
		//int s = ob.sum(first, sec);
		
		System.out.println(ob.sum(sec, first));
		
	}

}
