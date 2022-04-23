package fundamentalsAdvanced;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 10; 
		int b = 2;
		
//		Bitwise AND Operator
		int c = a & b;
//		Bitwise OR Operator
		int d = a | b;
//		Bitwise XOR Operator
		int e = a ^ b;
//		Bitwise NOT Operator
		int f = ~a;
//		Bitwise LEFT SHIFT Operator
		int g = a<<3;
//		Bitwise RIGHT SHIFT Operator
		int h = a>>3;
			
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}
