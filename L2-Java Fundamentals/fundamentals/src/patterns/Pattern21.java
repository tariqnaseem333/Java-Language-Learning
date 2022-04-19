package patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		
//		Pattern to Print
//		  1
//		 12
//		123
		
		int num, i, j, k;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= num ) {
			j = 1;
			while( j <= (num - i) ) {
				System.out.print(" ");
				j++;
			}
			k = 1;
			while( k <= i ) {
				System.out.print(k);
				k++;
			}
			System.out.print("\n");
			i++;
		}

	}

}
