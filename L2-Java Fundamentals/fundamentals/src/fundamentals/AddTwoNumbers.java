package fundamentals;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
////		For accessing character from terminal
//		String str = s.next();
//		char ch = str.charAt(0);
//		
//		System.out.println(ch);
		
//		Adding two numbers here by taking input from the user
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	
		int c = a + b;
		System.out.println(c);
		
	}

}