package LearnJavaFromStarting;

import java.util.Scanner;

public class AviPractice {
	
	public void getintegervalue(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		AviPractice ob = new AviPractice();
		ob.getintegervalue();	
	}
}
