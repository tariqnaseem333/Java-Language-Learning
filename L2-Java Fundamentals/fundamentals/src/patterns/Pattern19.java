package patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		
//		Print Square Pattern for n = 4
//		12344321
//		123**321
//		12****21
		
		int n, i, j;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		i = 1;
		while( i <= n ) {
			j = 1;
			while( j <= n ) {
				System.out.print(j);
				j++;
			}
			System.out.print("\n");
			i++;
		}

	}

}
