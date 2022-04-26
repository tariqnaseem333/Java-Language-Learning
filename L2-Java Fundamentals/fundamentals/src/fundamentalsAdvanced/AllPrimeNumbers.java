package fundamentalsAdvanced;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		
		int num;
		boolean isPrime;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		if( num == 1 ) {
			System.out.println("0");
			return;
		}
		if( num == 2 ) {
			System.out.println("2");
			return;
		}
		
		for ( int i = 2; i <= num; i++ ) {
			
			isPrime = false;
			
			if ( i == 2 ) {
				System.out.println("2");
				continue;
			}
			
			for ( int j = 2; j < i; j++ ) {
				if ( i % j == 0 ) {
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			if ( isPrime ) {
				System.out.println(i);
			}
		}
		
	}

}
