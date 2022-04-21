package patterns;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		
//		Pattern to Print
//		1******1
		
		int num, i, j, k, r;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i == 1 )  {
			
//			For Print starting 1
			j = 1;
			while( j == i ) {
				System.out.print("1");
				j++;
			}
			
//			For Printing *
			k = 1;
			while( k <= ( 2 * ( num - 1 ) ) ) {
				System.out.print("*");
				k++;
			}
			
//			For Printing ending 1
			r = 1;
			while( r == i ) {
				System.out.print("1");
				r++;
			}
			
			System.out.print("\n");
			i++;
		}

	}

}
