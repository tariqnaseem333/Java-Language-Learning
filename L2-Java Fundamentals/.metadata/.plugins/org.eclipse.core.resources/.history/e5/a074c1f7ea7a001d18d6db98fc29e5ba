package fundamentals;

import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {

	public static void main(String[] args) {
		
//		Calculating the Total Salary based on Basic Salary and Grade by using the formula:-
//		totalSalary = basic + hra + da + allow – pf where,
//		hra   = 20% of basic
//		da    = 50% of basic
//		allow = 1700 if grade = ‘A’
//		allow = 1500 if grade = ‘B’
//		allow = 1300 if grade = ‘C' or any other character
//		pf    = 11% of basic.
		
        int basicSalary, allow;
        double totalSalary;
        char grade;
        
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the Basic Salary: ");
        basicSalary = scanner.nextInt();
        System.out.println("Enter the grade: ");
        grade = scanner.next().charAt(0);
        
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }
        
        totalSalary = basicSalary + 0.2*basicSalary + 0.5*basicSalary + allow - 0.11*basicSalary;
        
        System.out.println(Math.round(totalSalary));

	}

}
