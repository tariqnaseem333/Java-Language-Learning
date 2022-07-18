package patterns;

import java.util.Scanner;

public class Pattern37 {

	public static void main(String[] args) {

//		For Printing Pattern for n = 4
//		1     1

		int num, i, j, N;
	
//		Taking Input from the user
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		N = 2 * num - 1;
		
		j = 1;
		while ( j <= N ) {
			if( j == 1 || j == N ) {
				System.out.print("1");
			} else {
				System.out.print(" ");
			}
			j++;
		}	
		
////		For Printing first number 1
//		System.out.print("1");
//			
//		j = 1;
//		while ( j <= N - 2 ) {
//			System.out.print(" ");
//			j++;
//		}	
//			
////		For Printing last number 1
//		System.out.print("1");	
	

	}

}
