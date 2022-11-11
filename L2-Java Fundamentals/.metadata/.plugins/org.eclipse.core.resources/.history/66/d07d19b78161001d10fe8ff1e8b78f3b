package fundamentalsAdvanced;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		
//		Input: seq of number
//		Determine if seq is strictly inc or strictly dec or
//		dec then inc, return true if it is.
		
		int num, prev, curr;
		boolean isDec = true;
		
//		Taking Input from the user
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int[] arr = new int[num];
		for ( int i = 0; i < num; i++ ) {
			arr[i] = scanner.nextInt();
		}
		
		for ( int i = 0; i < arr.length - 1; i++ ) {
			
			prev = arr[i];
			curr = arr[i+1];
			
			if ( curr == prev ) {
				System.out.println("false");
				return;
			}
			
			else if ( curr > prev ) {
				isDec = false;
			}
			
			else if ( curr < prev ) {
				if ( isDec == false ) {
					System.out.println("false");
					return;
				}
				isDec = true;
			}
		}
		
		System.out.println("true");

	}

}
