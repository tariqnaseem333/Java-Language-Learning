package fundamentals;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
//		Calculating the Power of a Number
		
		int x, n, res;
        
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); 
        x = scanner.nextInt(); 
        
        int i = 1;
        res = 1;
        while( i <= x ) {
            if (x == 0 && n == 0) {
                res = 1;
                System.out.println(res);
                return;
            }
            if ( n == 0 ) {
                res = 0;
                System.out.println(res);
                return;
            }
            res = res * n;
            i++;
        }
        System.out.println(res);

	}

}
