package fundamentals;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
//		Print n natural numbers
		int i = 1;
		while(i <= n) {
			System.out.println(i);
			i++;
		}
		
//		Print Hello world n times
//		int i = 0;
//		while(i < n) {
//			System.out.println("Hello World");
//			i++;
//		}

	}

}
