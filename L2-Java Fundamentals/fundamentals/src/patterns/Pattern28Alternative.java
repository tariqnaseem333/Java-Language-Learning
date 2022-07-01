package patterns;

import java.util.Scanner;

public class Pattern28Alternative {

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
			while( k <= 2 * i - 1 ) {
				System.out.print("*");
				k++;
			}
	
			System.out.print("\n");
			i++;
		}

	}

}
