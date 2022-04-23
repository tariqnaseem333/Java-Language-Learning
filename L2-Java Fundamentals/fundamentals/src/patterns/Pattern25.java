package patterns;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		
//		Pattern to Print
//		1******1
		
		int num, k;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		

//		For Printing Starting 1
		System.out.print("1");

//		For Printing *
		k = 1;
		while( k <= ( 2 * ( num - 1 ) ) ) {
			System.out.print("*");
			k++;
		}
			
//		For Printing Ending 1
		System.out.print("1");


	}

}
