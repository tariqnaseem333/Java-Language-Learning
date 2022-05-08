package patterns;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 4
//		4555
//		3455
//		2345
//		1234
		
		int num, i, j, k, p;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= num )  {
			
//			For Print first half of Pattern
			j = 1;
			p = num - i + 1;
			while( j <= i ) {
				System.out.print(p);
				p++;
				j++;
			}
			
//			For Printing 5
			k = 1;
			while( k <= ( num - i ) ) {
				System.out.print(num + 1);
				k++;
			}
			
			System.out.print("\n");
			i++;
		}

	}

}
