package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
//		Pattern to Print, n = 3
//		1
//		23
//		456
		
		int num, i, j;
		int p = 1;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        i = 1;
        while(i <= num) {
            j = 1;
            while(j <= i) {
                System.out.print(p);
                p++;
                j++;
            }
            System.out.print("\n");
            i++;
        }

	}

}
