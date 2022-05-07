package functions;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static boolean checkMember(int n){
		boolean isMember = false;
        int a = 0;
        int b = 1;
        int c;
        for ( int i = 0; i < n; i++ ) {
            c = a + b;
            a = b;
            b = c;
        }

        if ( a == n || a == 1 || a == 2 ) {
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
