package BasicJavaProgram;

import java.util.Scanner;

public class firstNPrimeNum {

	public static void main(stringPractice[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input");
		int input= sc.nextInt();
		int count=0;
		
		for(int i=0;i<input;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
					break;
				}	
			}
			if (count == 0) {
		        System.out.print(i+" ");
		      }

		}

}
}