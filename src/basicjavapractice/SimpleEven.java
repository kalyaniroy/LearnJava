package basicjavapractice;

import java.util.Scanner;

public class SimpleEven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter lower limit");
		int lower = sc.nextInt();
		
		System.out.println("Please enter lower limit");
		int upper = sc.nextInt();
		
		int multi=1;
		
		for (int i=lower; i<=upper; i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
				multi = multi*i;
			}
			
			
		}
		
		
		System.out.println("Multiplied number is "+ multi);
				

	}

}
