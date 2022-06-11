package fundamentalsAdvanced;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
//		Input: number N, find its square root. 
//		Print only the integral part of square root of N.
		
//		Taking Input from User
        int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int i = 1;
		int count = 0;
		int N = num;
		while( N >= 0 ) {
			N = N - i;
			if ( N < 0 ) {
				break;
			}
			i = i + 2;
			count++;
		}
		System.out.println(count);
		}

	}


