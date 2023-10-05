import java.util.Arrays;

public class LongestCommonPrefix {
	
	/**
	 * 
	 * @param in an array of strings
	 * @return the longest common prefix of the strings in the array or "" if no common prefix
	 */
	public static String longestCommonPrefix(String[] in) {
		if (in==null) throw new IllegalArgumentException("Null input not allowed.");
		if (in.length==0) return "";
		String result = in[0];
		for (int i=1; i<in.length; i++) {
			result = longestCommonPrefix(result, in[i]);
		}
		return result;
		
	}
	
	public static String longestCommonPrefix(String a, String b) {
		for (int i=0; i<a.length() && i<b.length(); i++) {
			if (a.charAt(i)!=b.charAt(i)) return a.substring(0, i);
		}
		// the common prefix is the shorter string
		return a.length()<b.length() ? a : b;
	}
	
	public static void printResult(String[] in) {
		String prefix = longestCommonPrefix(in);
		System.out.println(Arrays.asList(in));
		if (prefix.length()==0) {
			System.out.println("There is no common prefix among the input strings.");
		} else {
			System.out.println(prefix);
		}
		
	}
	
	public static void main(String[] args) {
		printResult(new String[] {"flower", "flow", "flight"});
		System.out.println("\n");
		printResult(new String[] {"dog", "racecar", "car"});
		
	}

}
