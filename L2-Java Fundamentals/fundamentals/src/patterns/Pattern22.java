package patterns;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		
//		Pattern to Print
//		***
//		**
//		*
		
		int num, i, j, k;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= num ) {
			
//			For Printing Stars
			j = 1;
			while( j <= (num - i + 1) ) {
				System.out.print("*");
				j++;
			}
			
			System.out.print("\n");
			i++;
		}

	}

}
