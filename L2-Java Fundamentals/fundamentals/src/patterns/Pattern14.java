package patterns;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		ABC
//		BCD
//		CDE
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
        	char p = (char)('A' + i - 1);
        	
            j = 1;
            while (j <= num) {
//                System.out.print((char)('A' + i + j - 2));
            	System.out.print(p);
                p = (char)(p + 1);
                j++;
            }
            
            System.out.print("\n");
            i++;
        }

	}

}
