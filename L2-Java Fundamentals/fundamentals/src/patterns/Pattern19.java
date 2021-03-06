package patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		
//		Print Square Pattern for n = 4
//		12344321
//		123**321
//		12****21
		
		int num, i, j, k, r, p;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= ( num - 1 ) ) {
			
//			Loop for incrementing numbers
			j = 1;
			while( j <= ( num - i + 1 ) ) {
				System.out.print(j);
				j++;
			}
			
//			Loop for printing *
			k = 1;
			while( k <= ( 2 * (i - 1) ) ) {
				System.out.print("*");
				k++;
			}
			
//			Loop for decrementing numbers
			r = 1;
			p = num - i + 1;
			while( r <= ( num - i + 1 ) ) {
				System.out.print(p - r + 1);
				r++;
			}
			
			System.out.print("\n");
			i++;
		}

	}

}
