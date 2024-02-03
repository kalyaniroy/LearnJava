package basicjavapractice;

import java.util.Scanner;

public class ReverseString_sameposition {

	public void getReverse(String input)
	
	{
		String[] s = input.split(" ");
		String out="";
		
		for(int i=0;i<=s.length-1;i++) 
		{
			char[] c = s[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)  
			{
				out=out+c[j];
			}
			out=out+" ";
		}
		System.out.println(out);
	}
	public static void main(String[] args)
	{
		ReverseString_sameposition ob = new ReverseString_sameposition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String finp = sc.nextLine();
		
		
		System.out.println("Please enter the secound input");
		String sinp = sc.nextLine();
		if (finp.contains(sinp))
		{
		    ob.getReverse(finp);
		}
		else 
		{
			ob.getReverse(sinp);
		}
	}

}
