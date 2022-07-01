package patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {

		//		For Printing Pattern for n = 4
		//		  1=1
		//		  1+2=3
		//		  1+2+3=6
		//		  1+2+3+4=10
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int i = 1;
		while( i <= num ) {
			
			int j = 1;
			int p = 1;
			while( j <= ( 2 * i + 1 ) ) {
				
//				For Printing +
				if ( j%2 == 0 && j != 2*i ) {
					System.out.print("+");
				}
				
//				For Printing =
				else if ( j == 2*i ) {
					System.out.print("=");
				}
				
//				For Printing the last number of pattern i.e., sum
				else if ( j == 2*i + 1 ) {
					int sum = 0;
					for( int k = 1; k <= i; k++) {
						sum = sum + k;
					}
					System.out.print(sum);
				}
				
//				For Printing numbers in pattern
				else {
				System.out.print(p);
				p++;
				}
				
				j++;
			}	
			
			System.out.print("\n");
			i++;
		} 
	}
}
