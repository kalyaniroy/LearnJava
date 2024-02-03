package basicjavapractice;

import java.util.Scanner;

public class ArrayVowelConst {
	
public void vowelconst () {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter 5 chars");
	
	char a[] = new char [5];
	
	for (int i=0; i<=4; i++)
	{
		a[i]= sc.next().charAt(0);
	}
	
	for (int k=0; k<=4; k++)
		
	{ if(a[k]=='a'|a[k]=='e'|a[k]=='i'|a[k]=='o'|a[k]=='u')
		{
		System.out.println(a[k] + " is vowel");
		}
	else
		{
			System.out.println(a[k] + " is consonant");
		}
	}
}


	public static void main(String[] args) {
		
		ArrayVowelConst obj = new ArrayVowelConst();
		obj.vowelconst();

	}
}

