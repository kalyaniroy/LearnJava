package BasicJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class seperateEvenOdd {

	public static void main(stringPractice[] args) {
		int[] input = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 11, 14};
		int sumOfeven = 0;
		int sumOfodd = 0;
		int[] evenArry = new int[input.length];
		int[] oddArry = new int[input.length];

		// Loop to separate even and odd numbers into different arrays
		for (int i = 0; i < input.length; i++) {
		    if (input[i] % 2 == 0) {
		        evenArry[i] = input[i];
		        sumOfeven = sumOfeven + evenArry[i];
		    } else {
		        oddArry[i] = input[i];
		        sumOfodd = sumOfodd + oddArry[i];
		    }
		}

		// Printing evenArry elements
		for (int j = 0; j < evenArry.length; j++) {
		    if (evenArry[j] != 0) {
		        System.out.print(evenArry[j] + " ");
		    }
		}
		System.out.println();

		// Printing oddArry elements
		for (int j = 0; j < oddArry.length; j++) {
		    if (oddArry[j] != 0) {
		        System.out.print(oddArry[j] + " ");
		    }
		}

		System.out.println();
		System.out.println("Addition of even numbers is " + sumOfeven);
		System.out.println("Addition of odd numbers is " + sumOfodd);
		System.out.println("Difference of sumOfeven and sumOfodd is " + (sumOfeven - sumOfodd));

		}

	}
