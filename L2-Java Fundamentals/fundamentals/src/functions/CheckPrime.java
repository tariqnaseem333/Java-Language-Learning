package functions;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean checkPrime( int n ) {
		int num, div;
		boolean isPrime = true;
		
		div = 2;
		while( div <= (n/2) ) {
			if ( n % div == 0 ) {
				isPrime = false;
				return isPrime;
			}
			div++;
		}
		
		return isPrime;
	}
	
	

	public static void main(String[] args) {
		
//		Program to check whether entered positive number is Prime or not
		
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		boolean result = checkPrime(num);
		
		if ( result ) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is Composite Number");
		}

	}

}
