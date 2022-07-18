package patterns;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		333
//		22
//		1
		
		int num, i, j, k;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= num ) {
			
//			For Printing Row 
			j = 1;
			while( j <= (num - i + 1) ) {
				System.out.print(num - i + 1);
				j++;
			}
			
			System.out.print("\n");
			i++;
		}
		


	}

}
