package patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3 
//		A
//		BB
//		CCC
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
        	
            j = 1;
            while (j <= i) {
            	char jthChar = (char)('A' + i - 1);
                System.out.print(jthChar);
                j++;
            }
            
            System.out.print("\n");
            i++;
        }

	}

}
