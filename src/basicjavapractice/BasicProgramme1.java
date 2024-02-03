package basicjavapractice;

import java.util.Scanner;

public class BasicProgramme1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter cp and sp to cal profit or loss");
	int cp = sc.nextInt();
	int sp = sc.nextInt();
	
	if(cp<sp)
	{
		System.out.println("Profit");
		int p= sp-cp;
		
		System.out.println( p + " is profit amount");
		 float bt = p*18/100;
		 
		System.out.println("Tax amount is "+ bt);
		
		float Total= p + bt;
		System.out.println("Total amount is " + Total);
				
	}
	
	else 
	{
		System.out.println("loss");
		System.out.println(cp-sp + " is loss amount");	
	}
			

	}

}
