package functions;

public class FunctionCalling {
	
	public static int sum( int a, int b ) {
		int result = a + b;
		return result;
	}
	
	public static int increment( int n ) {
		n++;
		
//		Cannot access i because it's outside the scope
//		System.out.println(i);
		
		System.out.println("Increment " + n);
		return n;
	}
	

	public static void main(String[] args) {
		
//		int n = 10;
//		int i = 50;
//		n = increment(n);
//		System.out.println("Main " + n);
		
		int a = 10;
		int b = 5;
		int result = sum( a, b );
		System.out.println(result);

	}

}
