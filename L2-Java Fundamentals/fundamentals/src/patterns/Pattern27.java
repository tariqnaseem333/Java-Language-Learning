package patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		
//		Pattern to Print
//		1
//		11
//		202
//		3003
//		Divide this pattern into 3 parts
		
		int num, i, j, k;
		boolean isRun = false;
		
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
					
//					For Printing first num in each row
					System.out.print(i-1);
					
//					For Printing 0 in each row
					k = 1;
					while( k <= ( i - 2 ) ) {
						System.out.print("0");
//						System.out.println(i-1);
//						isRun = true;
						k++;
					}
				}
				
				j++;
			}
			
			System.out.print("\n");
			i++;
		}

	}

}