package LearnJavaFromStarting;

import java.util.Scanner;

public class trueFalse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter number");
		int num= sc.nextInt();
		boolean b= false;
		
		if (num%2==0)
		{
			b= true;
		}
		

		System.out.println(b);
	}

}
