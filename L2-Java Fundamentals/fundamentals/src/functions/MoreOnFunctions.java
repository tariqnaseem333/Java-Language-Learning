package functions;

public class MoreOnFunctions {
	
	public static double sum( int a, int b, double c ) {
		double ans = a + b + c;
		return ans;  // or, return a + b + c
	}
	
	public static void printEvenNumbers( int start, int end ) {
		if( start % 2 != 0 ) {
			start++;
		}
		for ( int i = start; i <= end; i+=2 ) {
				System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 6;
		
		printEvenNumbers( 3, 17 );
		
//		Function with no input and no output
//		printEvenNumbers();
		
//		function returned result but we didn't collect it here
		sum( num1, num2, 10.5 );
		
		double result = sum( num1, num2, 10.5 );
		System.out.println(result);

	}

}
