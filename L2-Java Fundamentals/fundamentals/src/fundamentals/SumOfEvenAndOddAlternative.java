package fundamentals;

import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class SumOfEvenAndOddAlternative {

	public static void main(String[] args) {
		
//		Print the sum of all N's even digits
//		and sum of all its odd digits separately.
		
//		Taking Input from User
        int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;
		int rem  = 0;
		int N = num;
		while ( N > 0 ) {
			rem = N % 10;
			if ( rem % 2 == 0 ) {
				sumEven = sumEven + rem;
			}
			else {
				sumOdd = sumOdd + rem;
			}	
			N = N / 10;
		}

		System.out.println(sumEven + " " + sumOdd);
	}

}
