package fundamentals;


import java.util.Scanner;

public class AverageMarks {


	public static void main(String[] args) {
		
		/* Your class should be named AverageMarks.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        char name;
        int m1, m2, m3, average;
        
//      Reading Input from the user
        Scanner scanner = new Scanner(System.in);
        name = scanner.next().charAt(0);
        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();
        
//      Calculating the average marks of student
        average = (m1 + m2 + m3) / 3;
        
//      Output the name and average marks of the student
        System.out.println(name);
        System.out.println(average);

		
	}

}