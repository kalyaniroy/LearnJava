package LearnJavaFromStarting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintEvenNum {

	public static void main(String[] args) {
		
		int[] input= {1,2,3,4,5,6,7,8,9, 10, 12,11, 14};
		
		int sumOfeven=0;
		int sumOfodd =0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<input.length; i++) {
			if(input[i]%2==0) {
				
				System.out.print(input[i]+ " ");
				
				sumOfeven = sumOfeven + input[i];
		
			}
			else {
				
				list.add(input[i]);
				sumOfodd = sumOfodd + input [i];
			}
			
		}
		System.out.println();
		System.out.println("ODD" +list.toString());
		System.out.println("Addition of even number is "+sumOfeven);
		System.out.println("Addition of odd number is "+sumOfodd);
		System.out.println("Diffrence of sumOfeven and sumOfodd is "+(sumOfeven-sumOfodd));
		}
	}
	
		
	
	

