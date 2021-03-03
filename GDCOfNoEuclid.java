package imp_repeatative_concepts;

public class GDCOfNoEuclid {

	public static void main(String[] args) 
	{
		System.out.println(GCD(18, 21));
	}
	
	
	static int GCD(int a, int b)
	{
		return a%b == 0 ? b : GCD(b, a%b) ;
	}

}
