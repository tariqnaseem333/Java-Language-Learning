package patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
//		Pattern to Print
//		ABC
//		AB
//		A
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
            j = 1;
            char ch = 'A';
            while ( j <= (num - i +1) ) {
                System.out.print((char)(ch));
                ch++;
                j++;
            }
            System.out.print("\n");
            i++;
        }

	}

}
