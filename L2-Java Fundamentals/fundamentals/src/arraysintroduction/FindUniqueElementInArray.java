package arraysintroduction;

import java.util.Scanner;

public class FindUniqueElementInArray {
	
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
		System.out.println();
	}
	
	public static int[] sort( int[] arr ) {
        int c;
        for( int i = 0; i < arr.length - 1; i++ ) {
                for( int j = i + 1; j < arr.length; j++ ) {
            		if ( arr[i] > arr[j] ) {
                        c = arr[i];
                        arr[i] = arr[j];
                        arr[j] = c;
                    }
        	}
        }
        return arr;
	}
	
    public static int findUnique(int[] arr){
		int uniqueValue;
		for(int i = 1; i < arr.length - 1; i++) {
			if( arr[i-1] != arr[i] && arr[i] != arr[i+1] ) {
				uniqueValue = arr[i];
				return uniqueValue;
			}
		}
		if( arr[0] != arr[1] && arr[0] != arr[arr.length - 1] ) {
			uniqueValue = arr[0];
			return uniqueValue;
		} else {
			uniqueValue = arr[arr.length - 1];
			return uniqueValue;
		}

		
    }
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
	        while(t > 0) {
	            int[] input = takeInput();
	            int[] arr = sort(input);
	            System.out.println(findUnique(arr));
	            t--;
	        }
		
		
	}

}
