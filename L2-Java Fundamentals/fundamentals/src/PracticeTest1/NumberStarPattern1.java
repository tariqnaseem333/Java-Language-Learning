package PracticeTest1;

import java.util.Scanner;

public class NumberStarPattern1 {

	public static void main(String[] args) {
		
//		Print the Pattern for n = 5
//		 5432*
//		 543*1
//		 54*21
//		 5*321
//		 *4321
		
		int num, i, j, k, p;
		
//      Taking Input from the User
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while ( i <= num ) {
        	
//        	For Printing 1st Half of the Pattern
        	j = 1;
        	while ( j <= num - i + 1 ) {
        		if ( j == num - i + 1 ) {
        			System.out.print("*");
        		} else {
        			System.out.print( num - j + 1 );
        		}	
            	j++;
        	} 
        	
//        	For Printing 2nd Half of the Pattern
        	k = 1;
        	p = i - 1;
        	while ( k <= ( i - 1 ) ) {
        		System.out.print(p);
        		p--;
        		k++;
        	}
        	
        	System.out.print("\n");
        	i++;
        }

	}

}
