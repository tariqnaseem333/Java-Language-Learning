package fundamentalsAdvanced;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
//		Taking Input from User
        int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		
//		Converting entered number from int to string
//		12345 to "12345"
		String numbers = String.valueOf(num);
		
		
//		Converting String number to String Array
//		"12345" to [ "1", "2", "3", "4", "5" ]
		String[] numbersArr = numbers.split("");
		
		
//		Converting String Array to integer Array in 2 steps below:-
//		1.) Creating new array of integers of length of String Array
		int arr[] = new int[numbersArr.length];
//		2.) Populating integer array with String Array values
		for (int i = 0; i < numbersArr.length; i++) {
            arr[i] = Integer.parseInt(numbersArr[i]);
        }
		
//		Reversing the whole array and storing it into the new array
		int newArr[] = new int[arr.length];
		for ( int i = 0; i < arr.length; i++ ) {
			newArr[i] = arr[arr.length - i - 1];
		}
		
//		Creating new array of Strings of length of integer Array
		String[] arrFinal = new String[newArr.length];
//		Populating String array with integer Array values by converting into the string
		for (int i = 0; i < newArr.length; i++) {
            arrFinal[i] = String.valueOf(newArr[i]);
        }
		
//		Creating StringBuffer Object and Appending it with array values
	    StringBuffer sb = new StringBuffer();
	    for(int i = 0; i < arrFinal.length; i++) {
	       sb.append(arrFinal[i]);
	    }
//	    Converting stringBuffer object to String
	    String str = sb.toString();
	    
//	    Trimming 0 from the start of the string
	    String strPattern = "^0+(?!$)";
	    str = str.replaceAll(strPattern, "");
		
		System.out.println(str);
		

	}

}
