package fundamentalsAdvanced;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		
//		Print all the Prime Numbers till number num
		
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
			
			isPrime = true;
			
			if ( i == 2 ) {
				System.out.print("2" + " ");
				continue;
			}
			
			for ( int j = 2; j < i; j++ ) {
				if ( i % j == 0 ) {
					isPrime = false;
					break;
				}
			}
			if ( isPrime ) {
				System.out.print(i + " ");
			}
		}
		
	}

}
