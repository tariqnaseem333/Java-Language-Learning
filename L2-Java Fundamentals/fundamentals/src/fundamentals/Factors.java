package fundamentals;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
//		Print all the factors of a number other than 1 and the
//		number itself.
		
		int num;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        
        int i = 2;
        while(i < num) {
            if (num % i == 0 ) {
                System.out.print(i + "  ");
            }
            i++;
        }
		
	}

}
