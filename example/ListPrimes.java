
public class ListPrimes {

	/**
	 * 
	 * @param n some positive integer
	 * @return the list of primes <= n
	 */
	public static int[] listPrimes(int n) {
		int[] result = new int[n];
		int p = 0;
		for (int i=2; i<=n; i++) { // i is a prospective prime number
			if (i==2) {
				// special case!
				result[p++]=i;
				continue;
			}
			// is i prime?
			boolean isPrime=true;
			int upperLimit = (int)( Math.sqrt(i)+1);
			for (int j=2; j<=upperLimit; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			// it IS prime.  Add i to the list
			if (isPrime) {
				result[p++]=i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] primes = listPrimes(121);
		for (int prime: primes) {
			if (prime!=0) {
				System.out.print(prime+" ");
			}
		}
		System.out.println("");
	}
}
