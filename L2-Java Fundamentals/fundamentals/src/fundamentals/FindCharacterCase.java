package fundamentals;

import java.util.Scanner;

public class FindCharacterCase {
    
    public static void main(String[] args) {
//    	return:- 
//    	1, if the character is an uppercase alphabet (A - Z)
//    	0, if the character is a lowercase alphabet (a - z)
//    	-1, if the character is not an alphabet
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = s.next().charAt(0);
        
        if (ch >= 65 && ch <= 90) {
            System.out.println("1");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }

    }
}
