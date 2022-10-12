package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
//		Print Square * Pattern, for n = 3
//		***
//		***
//		***
		
		int n, i, j;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		i =1;
		while( i <= n ) {
			
			j=1;
			while( j <= n ) {
				System.out.print("*");
				j++;
			}
			
			System.out.print("\n");
			i++;
		}

	}

}
