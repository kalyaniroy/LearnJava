package BasicJavaProgram;

import java.util.Scanner;

public class ReverseNum {

	public static void main(stringPractice[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the no.");
		
		int num= sc.nextInt();
		int rev = 0;
		
		while(num>0) {
			
			int mod = num%10;
			rev = ((rev*10)+ mod );
			num = (num/10);
			
		}
		
		System.out.println("Reverse number = "+ rev);
		
	}

}
