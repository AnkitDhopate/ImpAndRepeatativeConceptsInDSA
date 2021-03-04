package imp_repeatative_concepts;

public class ComputeAnsInModulo {

	public static void main(String[] args) 
	{
		// To find 3^5
		fastPower(3, 5, 10);
	}
	
	static long fastPower(long a, long b, int n)
	{
		long res = 1 ;
		
		while(b>0)
		{
//			( a * b ) % n = ( a%n * b%n ) % n 
			if((b&1) != 0 ) // Check for odd
			{
				res = (res%n * a%n) % n ;
			}
			
			a = (a%n * a%n ) % n ;
			b = b/2 ;
		}
		return res;
	}

}
