package patterns;

import java.util.Scanner;

public class Pattern36 {

	public static void main(String[] args) {

//		For Printing Pattern for n = 4
//		1     1
//		 2   2
//		  3 3
//		   4
//		  3 3
//		 2   2
			


		int number, num, n, N, i, j, k, l, r, p1, p2;
	
//		Taking Input from the user
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		
		
		num = 2 * number - 2;
		N = ( num + 2 ) / 2;
		n = ( num - 2 ) / 2;
		
		
		
//		For Upper Half of the Pattern 
		i = 1;
		while( i <= N ) {
			
//			For Printing Incrementing Spaces
			k = i - 1;
			while ( k >= 1 ) {
				System.out.print(" ");
				k--;
			}
			
//			For Printing Row Numbers
			j = i;
			while( j == i ) {
				System.out.print(i);
				j++;
			}
			
//			For Printing Spaces
			l = 1;
			while( l <= 2 * (N - i) - 1 ) {
				System.out.print(" ");
				l++;
			}
			
//			For Printing Row Number
			if ( i != N ) { 
				System.out.print(i);
			} else {
				
			}
				
			i++;
			System.out.print("\n");
		}
		
		
	
//		For Lower Half of the Pattern 
		i = 1;
		p1 = n + 1;
		p2 = n + 1;
		while( i <= n ) {
			
//			For Printing Incrementing Spaces
			k = 1;
			while ( k <= n - i + 1 ) {
				System.out.print(" ");
				k++;
			}
			
//			For Printing Row Numbers
			j = i;
			while( j == i ) {
				System.out.print(p1);
				p1--;
				j++;
			}
			
//			For Printing Spaces
			l = 1;
			while( l <= 2 * i - 1 ) {
				System.out.print(" ");
				l++;
			}
			
//			For Printing Row Number
			if ( i != N ) { 
				System.out.print(p2);
				p2--;
			} else {
				
			}
				
			i++;
			System.out.print("\n");
		}
	

	}

}
