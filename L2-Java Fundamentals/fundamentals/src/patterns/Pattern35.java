package patterns;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {

//		For Printing Pattern for n = 4
//		   1
//		  121
//		 12321
//	    1234321
//		 12321
//		  121
//		   1
			


		int number, num, n, N, i, j, k, l, p1, p2;
	
//		Taking Input from the user
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		
		
		num = 2 * number - 1;
		N = (int)Math.ceil(num/2.0);
		n = (int)Math.floor(num/2.0);
		
		
		
//		For Upper Half of the Pattern 
		i = 1;
		while( i <= N ) {
			
//			For Printing Spaces
			k = N - i;
			while ( k >= 1 ) {
				System.out.print(" ");
				k--;
			}
			
//			For Printing Incrementing Numbers
			j = 1;
			while( j <= i ) {
				System.out.print(j);
				j++;
			}
			
//			For Printing Decrementing Numbers
			p2 = i - 1;
			l = 1;
			while( l <= i - 1 ) {
				System.out.print(p2);
				p2--;
				l++;
			}
				
			i++;
			System.out.print("\n");
		}
		
		
		
//		For Lower Half of the Pattern 
		i = 1;
		while( i <= n ) {
			
//			For Printing Spaces
			k = 1;
			while ( k <= i ) {
				System.out.print(" ");
				k++;
			}
			
//			For Printing Incrementing Numbers
			k = n - i + 1;
			p1 = 1;
			while ( k >= 1 ) {
				System.out.print(p1);
				p1++;
				k--;
			}
			
//			For Printing Decrementing Numbers
			p2 = n - i;
			l = 1;
			while( l <= n - i ) {
				System.out.print(p2);
				p2--;
				l++;
			}
				
			i++;
			System.out.print("\n");
		}
	

	}

}
