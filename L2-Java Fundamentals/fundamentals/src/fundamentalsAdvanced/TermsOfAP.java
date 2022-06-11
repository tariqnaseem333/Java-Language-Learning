package fundamentalsAdvanced;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		
//		 Print first x terms of the series 3N + 2,
//		 which are not multiples of 4
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for ( int i = 1; i <= num; i++ ) {
			
			int term = 3 * i + 2;
			
			if (term % 4 == 0) {
				num++;
				continue;
			}
			System.out.print(term + " ");
		}

	}

}
