package BasicJavaProgram;

import java.util.Scanner;

public class Add4Num {
	
	public void Addition(int a, int b, int c, int d)
	{
		int e= a+b+c+d;
		System.out.println("Addition is :"+e);
	}
	
	public void Multiplication (int f, int g, int h, int i)
	{
		int j=f*g*h*i;
		System.out.println("Multiplication is :"+j);
	}

	public static void main(stringPractice[] args) {
		Add4Num ob = new Add4Num();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number");
		int u= sc.nextInt();
		int v= sc.nextInt();
		int w= sc.nextInt();
		int x= sc.nextInt();		
		
		System.out.println("Enter 1 for addition, enter 2 for multiplication");
		int y= sc.nextInt();
		if (y==1)
				{
			ob.Addition(u, v, w, x);
			
				}
		else if (y==2)
	
				{
			ob.Multiplication(u, v, w, x);
				}
		else
		{
			System.out.println("Invalid input");
		}
		
		
	
		
		}

}
