package patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		C
//		BC
//		ABC
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
        	char p = (char)('A' + num - i);
            j = 1;
            while (j <= i) {
                System.out.print(p);
//                System.out.print((char)('A' + num - i + j - 1));
                p = (char)(p + 1);
                j++;
            }
            System.out.print("\n");
            i++;
        }

	}

}
