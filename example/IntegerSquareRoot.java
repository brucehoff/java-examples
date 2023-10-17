
// https://leetcode.com/problems/sqrtx/
public class IntegerSquareRoot {

	public static void main(String[] args) {
		System.out.println("sqrt(1) -> "+mySqrt(1));
		System.out.println("sqrt(2147395599) -> "+mySqrt(2147395599));
	}
	
	// if the max input is 2^31-1 then the max square root is less than 46341
	public static int MAX_GUESS = 46341;
	
	public static int mySqrt(int x) {
	   if (x<=0) return 0; // input should be >=0
	   long guess = x > MAX_GUESS ? MAX_GUESS : x;
	   long guessSq = guess*guess;
	   while ( ! (guessSq <= x && (guess+1)*(guess+1) > x) ) {
		   guess = (guessSq+x)/(2*guess);
		   guessSq = guess*guess;
	   }
	   return (int)guess;
	}

}
