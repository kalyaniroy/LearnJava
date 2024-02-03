package BasicJavaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(stringPractice[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input");
		 int input= sc.nextInt();
		 int count=0;
		 
		 if(input==0||input==1) {
			 System.out.println("Input is not prime number");
		 }
		 else {
			 for(int i=2;i<input;i++) {
				 if(input%i==0) {
					 System.out.println("Input is not prime number");
					 count++;
					 break;
				 }
				 
			 }
			 if (count==0) {
				 System.out.println("Input is prime number");
			 }
		 }
		 
	}

}
