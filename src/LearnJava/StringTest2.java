package LearnJava;

import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.examples.formula.CalculateMortgage;

public class StringTest2 {

		public static void main(String[] args) {
			int arr[]= {1,2,4,5,6,7,8,22,44,43
					};
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]);
					break;
				}
				else {
					System.out.println(arr[i]+" is not multiply by 2");
				}
			}
			
			
		}

	}

