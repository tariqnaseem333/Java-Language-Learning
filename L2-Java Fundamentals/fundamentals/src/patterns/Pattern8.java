package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		1
//		23
//		345
		
		int num, i, j, p;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while(i <= num) {
        	
        	p = i;
            j = 1;
            while(j <= i) {
//            	System.out.print(i+j-1);
              System.out.print(p);
                p++;
                j++;
            }
            
            System.out.print("\n");
            i++;
        }

	}

}
