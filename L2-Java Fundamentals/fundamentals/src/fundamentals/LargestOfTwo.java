package fundamentals;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();

		if( a > b ) {
			System.out.println("First Number is Greater");
		}
		else if(b > a) {
			System.out.println("Second Number is Greater");
		} 
		else {
			System.out.println("Both are Equal");
		}


//		if( a > b ) {
//			System.out.println("First Number is Greater");
//		} else {
//			if(b > a) {
//				System.out.println("Second Number is Greater");
//			} else {
//				System.out.println("Both are Equal");
//			}
//		} 
//
//		System.out.println("Outside If Else Block");



	}

}
