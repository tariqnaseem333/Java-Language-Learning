package patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		
//		For Printing Pattern for n = 4
//		    1
//		   232
//		  34543
//		 4567654
		
		int num, i, j, k, r, inc, dec;
		
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
			
//			For Printing increasing numbers
			k = 1;
			inc = i;
			while( k <= i ) {
				System.out.print(inc);
				inc++;
				k++;
			}
			
//			For Printing decreasing numbers
			r = 1;
			dec = 2 * ( i - 1 );
			while( r <= ( i - 1 ) ) {
				System.out.print(dec);
				dec--;
				r++;
			}
				
			System.out.print("\n");
			i++;
		}

	}

}
