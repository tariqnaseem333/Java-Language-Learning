package fundamentalsAdvanced;

import java.util.Scanner;

public class BinaryToDecimalAlternative {

	public static void main(String[] args) {
		
//		Binary number as an integer N, 
//		Convert it into decimal and print.
		
//		Taking Input from User
        int num, N, rem, decNum, factor;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		factor = 1;
		N = num;
		decNum = 0;
		rem = 0;
		while ( N > 0 ) {
			rem = N % 10;
			decNum = decNum + rem * factor;
			factor = factor * 2;
			N = N / 10;
		}
		
		System.out.println(decNum);

	}

}
