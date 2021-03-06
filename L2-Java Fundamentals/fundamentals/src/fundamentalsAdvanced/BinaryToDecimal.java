package fundamentalsAdvanced;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
//		Binary number as an integer N, 
//		Convert it into decimal and print.
		
//		Taking Input from User
        int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		
//		Converting entered number from int to string
//		1100 to "1100"
		String numbers = String.valueOf(num);
		
		
//		Converting String number to String Array
//		"1100" to [ "1", "1", "0", "0" ]
		String[] numbersArr = numbers.split("");
		
		
//		Converting String Array to integer Array in 2 steps below:-
//		1.) Creating new array of integers of length of String Array
		int arr[] = new int[numbersArr.length];
//		2.) Populating integer array with String Array values
		for (int i = 0; i < numbersArr.length; i++) {
            arr[i] = Integer.parseInt(numbersArr[i]);
        }
		
		int decNum = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			decNum = decNum + arr[arr.length - i -1] * (int)Math.pow(2, i);
		}
		System.out.println(decNum);

	}

}
