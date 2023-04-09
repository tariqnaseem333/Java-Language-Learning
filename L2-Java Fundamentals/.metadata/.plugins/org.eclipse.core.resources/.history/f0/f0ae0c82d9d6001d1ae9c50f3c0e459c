package patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 4
//		1
//		11
//		202
//		3003
//		Divide this pattern into 3 parts
		
		int num, i, j, k;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		i = 1;
		while( i <= num )  {
			
			j = 1;
			while( j <= i ) {
				
				if (i == 1) {
//					For Printing 1 in first row which is independent of num
					System.out.print("1");
				} 
				
				else {
					
					if( j == 1 || j == i ) {
//						For Printing first and last number in each row
						System.out.print(i-1);
					} else {
						System.out.print("0");
					}
					
				}
				
				j++;
			}
			
			System.out.print("\n");
			i++;
		}

	}

}
