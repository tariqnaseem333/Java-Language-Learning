package fundamentalsAdvanced;

public class ForLoops {

	public static void main(String[] args) {
		int n = 5;
		
////		While Loop
//		int i = 1;
//		while( i <= n ) {
//			System.out.println(i);
//			i++;
//		}
		
		
////		For Loop
//		for ( int i = 1; i <= n; i++ ) {
//			System.out.println(i);
//		}
		
////		Nesting in For Loops
//		for ( int i = 1; i <= 5; i++ ) {
//			for ( int j = 1; j <= 4; j++ ) {
//				System.out.println("i: " + i + " j: " + j);
//			}
//		}
		
		
		
////		Using 2 Loop Variable
//		for ( int i = 1, j = 100; i <= n && j <=200; i++, j += 20 ) {
//			System.out.println(i + " " + j);
//		}
//		
		int i = 1;
		for ( ; i <= n; i++ ) {
			System.out.println(i);
		}
		System.out.println(i);


	}

}

