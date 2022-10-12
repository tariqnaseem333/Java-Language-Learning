package patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		1
//		22
//		333
		
		int num, i, j;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while (i <= num) {
        	
            j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            
            System.out.print("\n");
            i++;
        }

	}

}
