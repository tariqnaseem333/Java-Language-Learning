package fundamentals;

public class ScopeOfVariables {

	public static void main(String[] args) {
		
////		Scope of Variables in Loop
//		int i = 1;
//		while(i <= 5) {
//			int j = 10;
//			System.out.println(j);
//			j++;
//			i++;
//		}
//		System.out.println(i);
//		
////		j scope is only in while loop
////		System.out.println(j);
		
		
		
		
//		Scope of Variables in Block
		int a = 10;
		a = 100;
		
		if ( a >= 100 ) {
			int b = 10;
			System.out.println(b);
		} else {
			int b = 20;
			System.out.println(b);
		}
		
//		Variable b is not accessible outside the scope of if 
//		block
//		System.out.println(b);
//		
		System.out.println(a);

	}

}
