package fundamentalsAdvanced;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		
//		Input: Number and Choice
//		if Choice = 1, then print the sum
//		if Choice = 2, then print the product
//		Any other number for Choice, then print -1
		
		int number, choice;
		
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		choice = scanner.nextInt();
		
		if ( choice == 1 ) {
			
//			if choice is 1, then print sum from 1 to N
			int sum = 0;
			int i = 1;
			while( i <= number ) {
				sum = sum + i;
				i++;
			}
			System.out.println(sum);
	
		} else if ( choice == 2 ) {
			
//			if choice is 2, then print product from 1 to N
			int prod = 1;
			int j = 1;
			while( j <= number ) {
				prod = prod * j;
				j++;
			}	
			System.out.println(prod);
			
		} else {
//			if choice is any other number, then print -1
			System.out.println("-1");
		}
	
	}

}
