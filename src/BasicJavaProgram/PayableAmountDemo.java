package BasicJavaProgram;

import java.util.Scanner;

public class PayableAmountDemo {
	
	//parameterized and no return type
	public void amount(float p) { // created a method named amount which calculates the final price
		float amt = (float) (p + (0.18 * p));
		System.out.println("Total payable amount is "+amt);
		}
	
	// 1000 rs se jyada ki shopping : 5% discount
	// 2000 rs : 10 % discount
	// 3000 rs : 15% discount
	public void discount(float p) { // p=6000
		float dis;
		if(p<=999) { // 6000<=999 FALSE
			System.out.println("Not eligible for discount");
		}		
		else if(p>=1000 && p<=1999) { //6000>=1000 && 6000<=1999 FALSE
		 dis = (float) (p - (0.05 * p));
		System.out.println("Discounted price is "+dis);
		}
		else if (p>=2000 && p<=2999) { //6000>=2000 && 6000<=2999 FALSE
			dis = (float) (p - (0.10 * p));
			System.out.println("Discounted price is "+dis);
		}
		else { 
			dis = (float) (p - (0.15 * p));
			System.out.println("Discounted price is "+dis);
		}
	}
	

	public static void main(stringPractice[] args) { // main method
		PayableAmountDemo obj = new PayableAmountDemo(); // created an object of the class
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		stringPractice name = sc.next();
		System.out.println("Please enter your mobile no");
		int mobile = sc.nextInt();
		System.out.println("Enter product name");
		stringPractice prod = sc.next();
		System.out.println("Enter the price");
		float a = sc.nextFloat();
		obj.amount(a); //amount method ko call kia
		obj.discount(a);
		

	}

}