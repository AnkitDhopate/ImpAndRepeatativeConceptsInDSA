package imp_repeatative_concepts;

import java.util.Arrays;

public class PrimeNoUsingSieveOfEratosthenes {

	public static void main(String[] args) 
	{
		boolean arr[] = markPrimes(12);
		for(int i=0 ; i<12 ; i++)
		{
			System.out.println(i + " " + arr[i] + " ");
		}
		
	}
	
	static boolean[] markPrimes(int n)
	{
		boolean isPrime[] = new boolean[n+1] ;
		Arrays.fill(isPrime, true); // Init as all primes
		// Git change
		isPrime[0] = false ;
		isPrime[1] = false ;
		
		for(int i=2 ; i*i <= n ; i++) // Here i*i = n i.e. i = sqrt of n
		{
			for(int j = i*2 ; j <= n ; j += i)
			{
				isPrime[j] = false ;
			}
		}
		
		return isPrime ;
	}

}
