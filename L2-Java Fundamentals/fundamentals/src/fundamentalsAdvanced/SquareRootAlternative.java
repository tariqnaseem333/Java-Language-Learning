package fundamentalsAdvanced;

import java.util.Scanner;

public class SquareRootAlternative {

	public static void main(String[] args) {
		
//		Input: number N, find the nearest square root of this number N.
//		Ex:- number = 10 nearest square root is 9, So Output = 3
//		Print only the integral part of square root of N.
		
//		Taking Input from User
        int num, i;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		
		if ( num == 0 ) {
			System.out.println("0");
		}
		
		i = 0;
		while ( i <= num ) {
			if ( i*i <= num ) {
				i++;
				continue;
			} else {
				System.out.println( i - 1 );
				break;
			}
			
		}
		
		}

	}


