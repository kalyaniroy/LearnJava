package LearnJavaFromStarting;

import java.util.Scanner;

public class lengthOfString1 {
public void getintegervalue(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print(i+ " ");
		}
	}

	public static void main(String[] args) {
		lengthOfString1 ob = new lengthOfString1();
		ob.getintegervalue();	
	}
}
