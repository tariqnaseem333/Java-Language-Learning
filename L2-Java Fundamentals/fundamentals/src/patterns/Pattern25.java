package patterns;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 4
//		1******1
		
		int num, k;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		k = 1;
		while( k <= 2 * num ) {
			
			if( k == 1 || k == 2*num ) {
				System.out.print("1");
			} else {
				System.out.print("*");
			}
			k++;
		}
		

////		For Printing Starting 1
//		System.out.print("1");
//
////		For Printing *
//		k = 1;
//		while( k <= ( 2 * ( num - 1 ) ) ) {
//			System.out.print("*");
//			k++;
//		}
//			
////		For Printing Ending 1
//		System.out.print("1");


	}

}
