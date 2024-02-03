package basicjavapractice;

import java.util.Scanner;

public class ArrayCarName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter car name");
	
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		for (int 
				i=0; i<cars.length; i++)
		{
			System.out.println(cars[i]);
		}
		

	}

}
