package patterns;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		
//		Half Diamond Patter : Pattern to Print for n = 5
//		*
//		*1*
//		*121*
//		*12321*
//		*121*
//		*1*
//		*
		
	int num, i, j, k, p;
		
//	Taking Input from the user
	Scanner scanner = new Scanner(System.in);
	num = scanner.nextInt();
		
	i = 1;
	while( i <= ( 2 *num + 1 ) ) {
			
		p = 1;
		
		if ( i <= (int)Math.ceil( ( 2*num + 1 ) / 2 ) ) {
			
			j = 1;
			p = 1;
			while( j <= ( 2*(i-1) + 1 ) ) {
				
//				For Printing first and last value as * 
				if( j == 1 || j == ( 2*(i-1) + 1 ) ) {
					System.out.print("*");
				} else {
					System.out.print(p);
//					For Printing increasing and decreasing number Pattern
					if ( j <= (int)Math.ceil( ( 2*(i-1) + 1 ) / 2 ) ) {
						p++;
					} else {
						p--;
					}
				}
				j++;
			} 
			}
		else {
			j = 1;
			while( j <= ( 2 * (2*num+1) - i) + 1 )  {
				
//				For Printing first and last value as * 
				if( j == 1 || j == ( ( 2 * (2*num+1) - i) + 1 ) ) {
					System.out.print("*");
				} else {
					System.out.print(p);
//					For Printing increasing and decreasing number Pattern
					if ( j <= (int)Math.ceil( ( ( 2 * (2*num+1) - i) + 1 ) / 2 ) ) {
						p++;
					} else {
						p--;
					}
				}
				j++;
			} 
		}
		
		
			
			
			System.out.print("\n");
			i++;
		}
		
		
		
		

	}

}
