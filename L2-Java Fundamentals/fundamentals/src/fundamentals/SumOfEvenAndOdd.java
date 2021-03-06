package fundamentals;

import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		
//		Print the sum of all N's even digits
//		and sum of all its odd digits separately.
		
//		Taking Input from User
        int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
//		Converting entered number from int to string
		String numbers = String.valueOf(num);
		
//		Converting String number to String Array
		String[] numbersArr = numbers.split("");
		
//		Creating new array of integers of length of String Array
		int arr[] = new int[numbersArr.length];
//		Populating integer array with String Array values
		for (int i = 0; i < numbersArr.length; i++) {
            arr[i] = Integer.parseInt(numbersArr[i]);
        }
		
//		Loop is running for integer array and calculating the sum of all
//		N's even digits and sum of all its odd digits
		int j = 0;
		int sumEven = 0;
		int sumOdd = 0;
		while(j < arr.length) {
			 if (arr[j] % 2 == 0) {
	                sumEven = sumEven + arr[j];
	            } else {
	                sumOdd = sumOdd + arr[j];
	            }
			 j++;
		}
		
		System.out.println(sumEven + " " + sumOdd);

	}

}
