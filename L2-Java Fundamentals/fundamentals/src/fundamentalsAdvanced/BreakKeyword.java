package fundamentalsAdvanced;

public class BreakKeyword {

	public static void main(String[] args) {
		
		int n = 5;
		
////		Break Keyword in Nested For Loops
//		for ( int i = 1; i <= n; i++ ) {
//			for( int j = 1; j <= n; j++ ) {
//				if ( i + 1 == j ) {
//					break;
////					return;
//				}
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("Outside For Loop");		
		
		
////		Break Keyword in While Loops
//		int i = 1;
//		while ( i <= n ) {
//			if ( i == 4 ) {
//				break;
////				System.out.println(i);
//			}
//			System.out.println(i);
//			i++;
//		}
		
//	Break Keyword in For Loops		
		for( int j = 1; j <= n; j++ ) {
			if( j == 4 ) {
				break;
//				System.out.println(j);
			}
			System.out.println(j);
		}
		System.out.println("Outside For Loop");
		
	}

}
