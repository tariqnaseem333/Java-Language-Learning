package arraysintroduction;

import java.util.Scanner;

public class ArrangeNumbersInArrayAlterntive {
	
	public static int[] takeInput() {
//		Taking Input n from the user
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
//		Declaring the array based on n
		int arr[] = new int[n];
		
//		Storing elements in the array
		for( int i = 0; i < n; i++ ) {
			System.out.println("Enter Element at " + i + "th index");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		int n = arr.length;
//		Printing the elements of an array
		for( int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");	
		}
	}
	
    public static void arrange(int[] arr, int n) {
        int length;
    	if( n % 2 == 0 ) {
    		length = n / 2;
    	} else {
    		length = (int)Math.ceil( n / 2 ) + 1;
    	}
        
        int val = 1;
        for( int i = 0; i < length; i++ ) {
            arr[i] = val;
            val = val + 2;
        }
        
        int val2 = 2;
        for( int i = n-1; i >= length; i-- ) {
            arr[i] = val2;
            val2 = val2 + 2;
        }
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		t = No. of test cases
        int t = scanner.nextInt();
		
        while( t > 0 ) {
        	
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            arrange(arr, n);
    		printArray(arr); 
		
    		t--;
        }

	}

}
