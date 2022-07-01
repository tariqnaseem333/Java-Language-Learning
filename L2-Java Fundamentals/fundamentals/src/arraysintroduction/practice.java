package arraysintroduction;

public class practice {
	public static void main(String[] args) {
    	
    	int[] arr = { 2, 3, 1, 6, 3, 6, 2 };
        boolean isUnique = true;
        int unique = -1;
        int n = arr.length;
		for( int i = 0; i < n-1; i++ ) {
            for( int j = i+1; j < n; j++ ) {
            	isUnique = true;
            	if( arr[i] == arr[j] ) {
                    isUnique = false;
                    break;
                }
        	}
            if( isUnique == true ) {
                unique = arr[i];
                System.out.println(unique);
                break;
            }
        }
		System.out.println(unique);
	}
}
