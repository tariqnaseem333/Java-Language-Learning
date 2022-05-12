package functions;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static boolean checkMember(int n){
		boolean isMember = false;
        int a = 0;
        int b = 1;
        int c;
        while ( a < n ) {
            c = a + b;
            a = b;
            b = c;
        }

        if ( a == n ) {
        	isMember = true;
        }
        
        return isMember;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));

	}

}
