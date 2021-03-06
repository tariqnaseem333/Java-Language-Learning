package functions;

import java.util.Scanner;

public class NcR {
	
	public static int factorial(int num) {
		int fact = 1;
		for( int i = 1; i <= num; i++ ) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int ncr( int n, int r ) {
//		Calculating factorial for n
		int factN = factorial(n);
		
//		Calculating factorial for r
		int factR = factorial(r);
		
//		Calculating factorial for n - r
		int factNR = factorial(n - r);
		
//		Calculating nCr
		int result = factN / ( factR * factNR );
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int result = ncr( n, r );
		
////		Now, Calculating factorial by using function 
//		
////		Calculating factorial for n
//		int factN = factorial(n);
//		
////		Calculating factorial for r
//		int factR = factorial(r);
//		
////		Calculating factorial for n - r
//		int factNR = factorial(n - r);
		
		
		
		
//		Now, Calculating factorial without using function 
		
////		Calculating factorial for n
//		int factN = 1;
//		for( int i = 1; i <= n; i++ ) {
//			factN = factN * i;
//		}
//		
////		Calculating factorial for r
//		int factR = 1;
//		for( int i = 1; i <= r; i++ ) {
//			factR = factR * i;
//		}
//		
////		Calculating factorial for n - r
//		int factNR = 1;
//		for( int i = 1; i <= ( n - r ); i++ ) {
//			factNR = factNR * i;
//		}
		
//		int result = factN / ( factR * factNR );
		
		System.out.println(result);
	}

}
