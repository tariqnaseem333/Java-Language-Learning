package patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		ABC
//		ABC
//		ABC
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
        	
            j = 1;
            while (j <= num) {
            	char jthChar = (char)('A' + j - 1);
                System.out.print(jthChar);
                j++;
            }
            
            System.out.print("\n");
            i++;
        }

	}

}
