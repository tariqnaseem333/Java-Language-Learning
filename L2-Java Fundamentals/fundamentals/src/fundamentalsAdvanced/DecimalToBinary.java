package fundamentalsAdvanced;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
//		Taking Input from the user
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		
		int N = num;
		int rem;
		int tens = 1;
		long binaryNum = 0;
		while( N > 0 ) {
			rem = N % 2;
			N = N / 2;
			binaryNum = binaryNum + tens * rem;
			tens = tens * 10;		
		}
		
		System.out.println(binaryNum);
		
		

	}

}