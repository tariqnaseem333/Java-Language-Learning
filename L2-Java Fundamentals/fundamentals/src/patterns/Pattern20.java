package patterns;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		
//		Print Square Pattern for n = 4
//		  *
//		 **
//		***
		
		int n, i, spaces, stars;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		i = 1;
		while( i <= n ) {
			spaces = 1;
			while( spaces <= (n - i) ) {
				System.out.print(" ");
				spaces++;
			}
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
