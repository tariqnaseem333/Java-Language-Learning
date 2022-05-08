package patterns;

import java.util.Scanner;
import java.lang.Math;

public class Pattern30 {

	public static void main(String[] args) {

		//		For Printing Pattern for n = 5
		//		    *
		//		   ***
		//		  *****
		//		   ***
		//		    *

		int num, i, j, k, q, r, a, b, c;
		double N, n;
		

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		
//		Setting Upper Range 
		N = Math.ceil( num/2.0 );
//		Setting Lower Range
		n = Math.floor( num/2.0 );
		
		
//		For Printing Upper Half of the Pattern
		i = 1;
		while ( i <= (int)N ) {
			
//			For Printing decreasing Spaces
			k = 1;
			while( k <= ( (int)N - i ) ) {
				System.out.print(" ");
				k++;
			}
			
//			For Printing increasing Stars (left)
			q = 1;
			while( q <= i ) {
				System.out.print("*");
				q++;
			}
			
//			For Printing increasing Stars (right)
			r = 1;
			while( r <= ( i - 1 ) ) {
				System.out.print("*");
				r++;
			}
			
			System.out.print("\n");
			i++;
		}
		
		
//		For Printing Lower Half of the Pattern
		j = 1;
		while ( j <= (int)n ) {
			
//			For Printing increasing Spaces
			a = 1;
			while( a <= j ) {
				System.out.print(" ");
				a++;
			}
			
//			For Printing decreasing Stars (left)
			b = 0;
			while( b <= ( (int)n - j ) ) {
				System.out.print("*");
				b++;
			}
			
//			For Printing increasing Stars (right)
			c = 1;
			while( c <= ( (int)n - j ) ) {
				System.out.print("*");
				c++;
			}
			
			System.out.print("\n");
			j++;
		}

	}

}
