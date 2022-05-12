package functions;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	
	public static void printFahrenheitTable(int start, int end, int step) {
        int c;
        for ( int f = start; f <= end; f+=step ) {
            c = (int)( ( 5 * (f-32) )/9 );
            System.out.println( f + "\t" + c );
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
