package patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
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
            while ( j <= (num - i + 1) ) {
                System.out.print((char)(ch));
//            	System.out.print((char)('A' + j - 1));
                ch++;
                j++;
            }
            System.out.print("\n");
            i++;
        }

	}

}
