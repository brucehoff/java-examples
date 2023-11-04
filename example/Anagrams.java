
public class Anagrams {

	public Anagrams() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isAnagram(String a, String b) {
		int[] diff = new int[255];
		if (a==null) throw new IllegalArgumentException("a is null.");
		if (b==null) throw new IllegalArgumentException("b is null.");
		if (a.length()!=b.length()) return false;
		for (int i = 0; i<a.length(); i++) {
			diff[(int)a.charAt(i)]++;
			diff[(int)b.charAt(i)]--;
		}
		for (int d: diff) {
			if (d!=0) return false;
		}
		return true;
	}
	
	private static void printResult(String a, String b) {
		System.out.println(a+" "+b+" -> "+isAnagram(a,b));
	}
	
	public static void main(String[] args) {
		printResult("tea", "eat");
		printResult("tea", "teal");
		printResult("foo", "");
		printResult("aabb", "baaa");
	}
	

}
