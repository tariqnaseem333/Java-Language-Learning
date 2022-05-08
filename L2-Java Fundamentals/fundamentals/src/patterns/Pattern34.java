package patterns;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {

//		For Printing Pattern
//		1357
//		3571
//		5713
//		7135
			
		int num;
	
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int i = 1;
		while ( i <= num ) {
			
//			For Printing Increasing Number
			int j = 1;
			int p1 = 2 * i - 1;
			while ( j <= num - i + 1 ) {
				System.out.print(p1);
				p1 = p1 + 2;
				j++;
			}
			
//			For Printing Decreasing Number
			int k = 1;
			int p2 = 1;
			while ( k <= ( i-1 ) ) {
				System.out.print(p2);
				p2 = p2 + 2;
				k++;
			}
			
			System.out.print("\n");
			i++;
		}
		


	}

}
