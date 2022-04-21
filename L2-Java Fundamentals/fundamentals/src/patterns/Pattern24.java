package patterns;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		
//		Pattern to Print
//		  1
//		 121
//		12321
		
		int n, i, spaces, inc, dec;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		i = 1;
		while( i <= n ) {
			
			spaces = 1;
			while( spaces <= (n - i) ) {
				System.out.print(" ");
				spaces++;
			}
			
			inc = 1;
			while( inc <= i ) {
				System.out.print(inc);
				inc++;
			}
			
			dec = i - 1;
			while( dec >= 1 ) {
				System.out.print(dec);
				dec--;
			}
			
			System.out.print("\n");
			i++;
		}
		


	}

}
