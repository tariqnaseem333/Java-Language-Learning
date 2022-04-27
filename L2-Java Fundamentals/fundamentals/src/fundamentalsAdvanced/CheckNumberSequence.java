package fundamentalsAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		
		boolean res = false;
		boolean dec = true;
		
//		Taking Input from the user
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int[] arr = new int[num];
		for ( int i = 0; i < num; i++ ) {
			arr[i] = scanner.nextInt();
		}
		
		for ( int i = 0; i < arr.length; i++ ) {
			
			if ( i+2 >= 0 && i+1 >= 0 && i >= 0 &&
					i+2 >= arr.length && i+1 >= arr.length && i >= arr.length	) {
			
			if ( ( arr[i+2] - arr[i+1] < 0 && arr[i+1] - arr[i] < 0)
				|| ( arr[i+2] - arr[i+1] > 0 && arr[i+1] - arr[i] > 0) ) {
				res = true;
			} else {
				res = false;
			}
			}
			
		}
		
		System.out.println(Arrays.toString(arr) + " " + res);

	}

}