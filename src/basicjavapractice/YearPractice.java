package basicjavapractice;

import java.util.Scanner;

public class YearPractice {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter month");
		
		String month =sc.next();
		
		if (month.equals("jan")||month.equals("mar")||month.equals("may")||month.equals("jul")||month.equals("aug")||month.equals("Oct")||month.equals("dec")) {
			System.out.println("Days are 31");
			
		}
		else if (month.equals("apr")||month.equals("jun")||month.equals("sep")||month.equals("nov")) {
			System.out.println("Days are 30");
		}
		else if (month.equals("feb")) {
			System.out.println("Year??");
			
			int year= sc.nextInt();
			
			if(year%4==0) {
				System.out.println("Days are 29");
			}
			else {
				System.out.println("Days are 28");
			}		
				
		}
		else {
			System.out.println("Invalid input");	
		}
		
		
	}

}
