package PracticeTest1;

import java.util.Scanner;

public class ZerosAndStarsPattern {

	public static void main(String[] args) {
		
//		Print the Pattern for n = 5
//		*0000*0000*
//		0*000*000*0
//		00*00*00*00
//		000*0*0*000
//		0000***0000
		
		int num, i, j, k, p, l, m;
		
//      Taking Input from the User
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        
        i = 1;
        while ( i <= num ) {
        	
        	
//        	For Printing Left Half of the Pattern
        	
//        	For Printing First Half of the Pattern
        	j = 1;
        	while ( j <= i ) {
        		if ( j == i ) {
        			System.out.print("*");
        		} else {
            		System.out.print("0");
        		}
        		j++;
        	}
        	
//        	For Printing Second Half of the Pattern
        	k = 1;
        	while ( k <= ( num - i ) ) {
            		System.out.print("0");
        		k++;
        	}
        	
//        	For Printing Middle Line
        	System.out.print("*");
        	
        	
//        	For Printing Right Half of the Pattern
        	
//        	For Printing First Half of the Pattern
        	l = 1;
        	while ( l <= ( num - i ) ) {
            	System.out.print("0");
        		l++;
        	}
        	
//        	For Printing Second Half of the Pattern
        	m = 1;
        	while ( m <= i ) {
        		if ( m == 1 ) {
        			System.out.print("*");
        		} else {
            		System.out.print("0");
        		}
        		m++;
        	}
        	
        	System.out.print("\n");
        	i++;
        }

	}

}
