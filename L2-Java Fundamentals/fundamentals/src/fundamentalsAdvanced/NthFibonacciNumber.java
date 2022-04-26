package fundamentalsAdvanced;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		
		int num, a, b, c;
		a = 0;
		b = 1;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		if ( num == 0 ) {
			System.out.println("0");
			return;
		}
		if ( num == 1 ) {
			System.out.println("1");
			return;
		}
		
		for( int i = 1; i <= num; i++ ) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(a);
	}

}
