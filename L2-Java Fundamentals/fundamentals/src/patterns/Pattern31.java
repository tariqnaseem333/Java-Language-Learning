package patterns;

import java.util.Scanner;
import java.lang.Math;

public class Pattern31 {

	public static void main(String[] args) {

//		For Printing Pattern for n = 4
//		  ****
//		   ****
//		    ****
//		     ****
		
		int num, i, j, k;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= num ) {
			
//			For Printing Incrementing Spaces
			j = 1;
			while( j <= ( i - 1 ) ) {
				System.out.print(" ");
				j++;
			}
			
//			For Printing n stars
			k = 1;
			while( k <= num ) {
				System.out.print("*");
				k++;
			}
			
			
			System.out.print("\n");
			i++;
		}



	}

}
