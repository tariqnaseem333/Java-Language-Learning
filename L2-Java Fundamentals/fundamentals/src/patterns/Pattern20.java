package patterns;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		
//		Print Square Pattern for n = 3
//		  *
//		 **
//		***
		
		int n, i, spaces, stars;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		i = 1;
		while( i <= n ) {
			
//			For Printing Spaces
			spaces = 1;
			while( spaces <= (n - i) ) {
				System.out.print(" ");
				spaces++;
			}
			
//			For Printing Stars
			stars = 1;
			while( stars <= i ) {
				System.out.print("*");
				stars++;
			}
			System.out.print("\n");
			i++;
		}

	}

}
