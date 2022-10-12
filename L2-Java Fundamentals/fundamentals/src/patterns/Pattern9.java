package patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		*
//		**
//		***
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
        	
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            
            System.out.print("\n");
            i++;
        }

	}

}
