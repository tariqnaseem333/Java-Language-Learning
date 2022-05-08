package patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
//		Print Square Pattern, n = 3
//		321
//		321
//		321
		
		int n, i, j;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		i = 1;
		while( i <= n ) {
			j = 1;
			while( j <= n ) {
				System.out.print(n - j + 1);
				j++;
			}
			System.out.print("\n");
			i++;
		}

	}

}
