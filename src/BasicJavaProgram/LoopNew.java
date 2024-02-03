package BasicJavaProgram;

import java.util.Scanner;

public class LoopNew {

	public static void main(stringPractice[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the lower limit");
		int lower = sc.nextInt();
		System.out.println("Enter the upper limit");
		int upper = sc.nextInt();
		
		
		for (int i= lower; i<=upper; i++)
			
		{
			System.out.println(i);
		}

	}

}
