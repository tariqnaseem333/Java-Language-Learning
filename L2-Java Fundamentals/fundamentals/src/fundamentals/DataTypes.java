package fundamentals;

public class DataTypes {

	public static void main(String[] args) {
		
		
		
		 int n=10,r=6;
		    int factn=1,factr=1,factnr=1;
		    for(int i=2;i<=n;i++)
		    {
		        factn*=i;
		        if(i<=r)
		            factr*=i;
		        if(i<=n-r)
		            factnr*=i;
		    }
		    int ncr=factn/(factr*factnr);
		    System.out.print(ncr);
		
//		int a;
//		a = 10;
//		
//		int var1 = 33;
//		int Var;
//		
//		boolean isValid = false;
		
//		The different dataTypes are given below:-
//		int a = 10;
//		short s = 15;
//		byte b = 1;
//		long l = 117L;
//		double d = 10.5559;
//		float f = 10.5F;
//		
//		char ch = 'a';
//		boolean bl = false;

	}

}