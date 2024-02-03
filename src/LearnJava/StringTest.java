package LearnJava;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
	
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please enter input");
		  String input = sc.next();
		  int sum=0;
		  String alpha= "";
		  
		  for(int i=0; i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				int n= Character.getNumericValue(input.charAt(i));
				sum= sum+n;
			}
			else {
				alpha= alpha+input.charAt(i);
			} 
		  }
		  System.out.println("sum of integer is : "+sum + " sum of character : "+alpha);
	    } 
}