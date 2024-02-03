package basicjavapractice;

import java.util.Scanner;

public class ArmstrongOrNot {
	
	public void getarmstrong (int num)
	{
		int temp = num;
		int len = 0;
		
		while (temp!=0)
		{
			temp = temp/10;
			len = len +1;
			
		}
		
		int temp2= num;
		int arm =0;
		int r;
		
		while (temp2!=0)
		{
			r= temp2%10;
			int multi = 1;
			for (int i=1; i<=len;i++)
			{
				multi = multi*r;
			}
			arm = arm + multi;
			temp2 = temp2/10;
		}
		if (num==arm);
		{
			System.out.println(num + " is an Armstrong number");
		}
		else
			
		{
			System.out.println(num + " is not an Armstrong number");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		ArmstrongOrNot ob = new ArmstrongOrNot();
		
		ob.getarmstrong(num);
		


	}

}
