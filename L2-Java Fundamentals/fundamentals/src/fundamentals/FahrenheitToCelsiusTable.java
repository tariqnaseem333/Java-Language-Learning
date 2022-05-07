package fundamentals;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		
//		Table of conversion from Fahrenheit temperature to Celsius Temperature
//		Input: Fahrenheit Output: Celsius
        
        int startF, endF, step, celsius;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Start Number: ");
        startF = scanner.nextInt();
        System.out.println("Enter the End Number: ");
        endF = scanner.nextInt();
        System.out.println("Enter the Gap: ");
        step = scanner.nextInt();
        System.out.println("The Table is given below:- ");
        System.out.println("F" + "\t" + "C");
        
        int i = startF;
        while( i <= endF) {
            celsius = ( 5 * (i-32) )/9;
            System.out.println(i + "\t" + celsius);
            i = i + step;
        }

	}

}
