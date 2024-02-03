package LearnJavaFromStarting;

import java.util.Scanner;

public class lengthString 
{
	public int length(String str)
	{
		int num= str.length();
		return num;
		
	}
	
	

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter string");
		String str= sc.nextLine();
		
		lengthString ob= new lengthString ();
		int rtr= ob.length(str);
		
		System.out.println(rtr);

	}

}
