package PracticeTest1;

import java.util.Scanner;

public class CheckArmStrong {

	public static void main(String[] args) {
		
//		Check if number is ArmStrong or not
//		371, as 3^3 + 7^3 + 1^3 = 371
//		1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
		
		
		int num, N, rem, sum, l;
		
//      Taking Input from the User
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
//		Converting entered number from int to string
//		12345 to "12345"
		String str = String.valueOf(num);
			
//		Calculating length of the String
		l = str.length();
        
        rem = 0;
        sum = 0;
        N = num;
        while ( N > 0 ) {
        	rem = N % 10;
        	int numValue = 1;
        	for( int i = 1; i <= l; i++ ) {
        		numValue = rem*numValue;
        	}
        	sum = sum + numValue;
        	N = N / 10;
        }
        
        if ( sum == num ) {
            System.out.println("true");
        } else {
        	System.out.println("false");
        }
        
	}

}
