package fundamentals;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
//		int rem = number%2;
//		boolean result = rem==0;
		
//		if ( number%2 == 0 ) {
//			System.out.println(number + " is even");
//		} 
//		if ( number%2 != 0 ) {
//			System.out.println(number + " is odd");
//		}
		
		if ( number%2 == 0 ) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is Odd");
		}

	}

}
