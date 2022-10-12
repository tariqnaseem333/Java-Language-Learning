package patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		A
//		AB
//		ABC
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
        	
            j = 1;
            while (j <= i) {
            	char ch = (char)('A' + j - 1);
                System.out.print(ch);
                j++;
            }
            
            System.out.print("\n");
            i++;
        }

	}

}
