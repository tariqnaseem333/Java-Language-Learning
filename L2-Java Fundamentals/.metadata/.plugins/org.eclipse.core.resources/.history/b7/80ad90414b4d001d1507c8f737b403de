package fundamentalsAdvanced;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
//	    Input: Decimal number (integer N), 
//		convert it into binary and print.

//		Taking Input from the user
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();


		long N = num;
		long rem;
		long tens = 1;
		long binaryNum = 0;
		while( N > 0 ) {
			rem = N % 2;
			binaryNum = binaryNum + tens * rem;
			tens = tens * 10;	
			N = N / 2;
		}

		System.out.println(binaryNum);


	}

}
