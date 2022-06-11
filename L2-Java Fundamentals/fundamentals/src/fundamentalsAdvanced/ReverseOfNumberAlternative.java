package fundamentalsAdvanced;

import java.util.Scanner;

public class ReverseOfNumberAlternative {

	public static void main(String[] args) {
		
//		Find Reverse of a given number N. 
//		Print the corresponding reverse number.
		
//		Taking Input from User
        int num, rem, N;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		N = num;
		rem = 0;
		
//		Checking for zero
		if ( num == 0 ) {
			System.out.println("0");
			return;
		}
		
//		For Trimming Zero from Input number
		while( N > 0 ) {
			if ( N % 10 == 0 ) {
				N = N / 10;
			} else {
				break;
			}
		}
		
//		For Printing Number in Reverse Order	
		while( N > 0 ) {
			rem = N % 10;
			System.out.print(rem);
			N = N / 10;
		}

	}

}
