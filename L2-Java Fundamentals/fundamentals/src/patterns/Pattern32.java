package patterns;

import java.util.Scanner;
import java.lang.Math;

public class Pattern32 {

	public static void main(String[] args) {

		//		For Printing Pattern
		//		  1=1
		//		  1+2=3
		//		  1+2+3=6
		//		  1+2+3+4=10
		
		int num, i, j, k, p, r, a;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		p = 0;
		r = 0;
		a = 12345;
		while( i <= num ) {
			
			
			if ( p > a ) {
				p = 1;
			} else {
				p = i + r;
			}
			j = 1;
			while( j <= num ) {
				System.out.print(p);
				p = p + 2;
				j++;
			}
			a = p;
			

			
			
			System.out.print("\n");
			r++;
			i++;
		}



	}

}