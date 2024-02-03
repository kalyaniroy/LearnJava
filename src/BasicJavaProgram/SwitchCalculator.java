package BasicJavaProgram;

import java.util.Scanner;

public class SwitchCalculator {

	public int cal (int oprType, int firstNum, int secondNum, int thirdNum)
	{
		int output = 0;
		
		switch (oprType)
		{
		case 1:
		{
			output= add(firstNum,secondNum,thirdNum);
			break;
		}
		case 2 :
		{
			output= mul(firstNum,secondNum,thirdNum);
			break;
		}
		default:
		{
			break;
		}
		}
		return output;
	}
	
	public int add(int firstNum,int secondNum,int thirdNum)
	{
		
		return firstNum+secondNum+thirdNum;
	}
	
	public int mul(int firstNum,int secondNum,int thirdNum)
	{
		
		return firstNum*secondNum*thirdNum;
	}
	
	public static void main(stringPractice[] args) {

		SwitchCalculator ob = new SwitchCalculator ();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number");
		int firstNum= sc.nextInt();
		
		System.out.println("Enter sec number");
		int secondNum= sc.nextInt();
		
		System.out.println("Enter third number");
		int thirdNum= sc.nextInt();
		
		System.out.println("Enter 1 for addition, Enter 2 for multiplication");
		int oprType= sc.nextInt();
		
		int output = ob.cal(oprType,firstNum ,secondNum, thirdNum);
		System.out.println("the output is "+output);

	}

}
