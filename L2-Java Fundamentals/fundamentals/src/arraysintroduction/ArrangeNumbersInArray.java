package arraysintroduction;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	
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
        int p = 1;
        for( int i = 0; i < length ; i++ ) {
            
            arr[i] = p;
            
            if ( p != n ) {
            	p++;
            }
            
            arr[n-i-1] = p;
            p++;
  
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