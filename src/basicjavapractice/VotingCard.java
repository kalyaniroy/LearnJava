package basicjavapractice;

import java.util.Scanner;

public class VotingCard
{
	
	public void validateAge(int age)
	{
		try 
		{
			if(age<18)
			{
				throw new Exception("Not eligible to vote");
			}
			else
			{
				System.out.println("Eligible to vote");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			main(null);
		}
				
	}
	
	public void validateAadhar()
	{
		
	}
	
	public void validateVoterId()
	{
		
	}
	
	public void vote(int v)
	{
		switch(v)
		{
			case 1:
			{
				System.out.println("Your vote is successfully submitted to CONGRESS");
				break;
			}
			case 2:
			{
				System.out.println("Your vote is successfully submitted to AAP");
				break;
			}
			case 3:
			{
				System.out.println("Your vote is successfully submitted to BJP");
				break;
			}
			case 4:
			{
				System.out.println("Your vote is successfully submitted to NOTA");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		VotingCard ob = new VotingCard ();
	
		System.out.println("Enter your name");
		String n = sc.nextLine();
		System.out.println("Enter your father's name");
		String fn = sc.nextLine();
		System.out.println("Enter your mobile number");
		long mob = sc.nextLong();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		ob.validateAge(age);
		
	}
}
