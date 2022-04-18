package fundamentals;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		
//		Sum of N Natural Numbers
		
		int i, num, sum;
		
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		i = 1;
		sum = 0;
		while( i <= num ) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum till " + num + " number is " + sum);

	}

}
