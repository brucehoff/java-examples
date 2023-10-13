
public class MatchingParens {
	private static int MAX = 10000;
	private char[] stack;
	private int p; // points to the next available position in the stack

	public MatchingParens() {
	}
	
	private void init() {
		p = 0;
		stack = new char[MAX];		
	}
	
	private void push(char c) {
		if (p>= MAX) {
			throw new IllegalStateException("stack exceeded");
		}
		stack[p++]= c;
	}
	
	private Character pop() {
		if (p==0) {
			return null;
		}
		return stack[--p];
	}
	
	private boolean isEmpty() {
		return p<=0;
	}
	
	private static boolean isOpenBracket(char c) {
		return c=='(' ||c=='[' ||c=='{';
	}
	
	private static boolean isCloseBracket(char c) {
		return c==')' ||c==']' ||c=='}';
	}
	
	private static char matchingOpenBracket(char c) {
		switch (c) {
		case ')':
			return '(';
		case ']':
			return '[';
		case '}':
			return '{';
		default:
			throw new IllegalArgumentException(c+" is not an open bracket.");
		}
	}
	
	
	private boolean validate(String s) {
		init();
		for (int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			if (isOpenBracket(c)) {
				push(c);
			} else if (isCloseBracket(c)) {
				if (pop()!=matchingOpenBracket(c)) {
					return false;
				}
			} else {
				return false; // unexpected character!
			}
		}
		return isEmpty(); // at the end the stack should be empty.  If not it's an invalid string
	}
	
	private static void validateAndPrint(String s) {
		MatchingParens mp = new MatchingParens();
		System.out.println(s+(mp.validate(s)?" is valid.":" is not valid."));
	}
	
	public static void main(String args[]) {
		validateAndPrint("");
		validateAndPrint("abc");
		validateAndPrint("()");
		validateAndPrint("([)]");
		validateAndPrint("(((())))[{()}{}]");
	}

}
