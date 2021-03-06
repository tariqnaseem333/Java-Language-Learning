package functions;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	
	public static void printFahrenheitTable(int start, int end, int step) {
        int celsius;
        for ( int fahrenheit = start; fahrenheit <= end; fahrenheit+=step ) {
            celsius = (int)( ( 5 * (fahrenheit-32) )/9 );
            System.out.println( fahrenheit + "\t" + celsius );
        }
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);

	}

}
