package BasicJavaProgram;

import java.util.Scanner;

public class Add3Num {
	
	public void Addition(int A, int B, int C)
	{
		int D= A+B+C;
		System.out.println("Addition is :"+D);
	
	}
	
	public void Multiplication (int d, int e, int f)
	{
		int g=d*e*f;
		System.out.println("Multiplication is :"+g);
	}

	public static void main(stringPractice[] args) {
	Add3Num ob = new Add3Num();
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Please enter 3 inputs");
	int J= sc.nextInt();
	int K= sc.nextInt();
	int L= sc.nextInt();
	
	System.out.println("enter 1 for addition, enter 2 for multiplication");
	int h= sc.nextInt();
	
	if (h==1)
	{
		ob.Addition(J, K, L);
	}
	else if (h==2)
	{
		ob.Multiplication(J, K, L);
	}
	else 
	{
		System.out.println("Invalid input");
	}
		
	}

}
