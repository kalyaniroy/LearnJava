package BasicJavaProgram;

import java.util.Scanner;

public class Switch_Vowel 
{

	public void getVowel(char input)
	{
		switch(input)
		{
		
		case 'a':
		{
			System.out.println(input+" is a vowel");
			break;
		}
		case 'e':
		{
			System.out.println(input+" is a vowel");
			break;
		}
		case 'i':
		{
			System.out.println(input+" is a vowel");
			break;
		}
		case 'o':
		{
			System.out.println(input+" is a vowel");
			break;
		}
		case 'u':
		{
			System.out.println(input+" is a vowel");
			break;
		}
		default:
		{
			System.out.println(input+" is a consonant");
		}
		}
	}
	
	
	public static void main(stringPractice[] args)
	{
		Switch_Vowel ob = new Switch_Vowel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		char input = sc.next().charAt(0);
		ob.getVowel(input);
	}
}


