package patterns;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		
//		For Printing Pattern for n = 4
//		    *
//		   ***
//		  *****
//		 *******
		
		int num, i, j, k, r;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= num ) {
			
//			For Printing Spaces
			j = 1;
			while( j <= ( num - i ) ) {
				System.out.print(" ");
				j++;
			}
			
//			For Printing *
			k = 1;
			while( k <= i ) {
				System.out.print("*");
				k++;
			}
			
//			For Printing * in second half of pattern
			r = 1;
			while( r <= ( i - 1 ) ) {
				System.out.print("*");
				r++;
			}
			
	
			System.out.print("\n");
			i++;
		}

	}

}
