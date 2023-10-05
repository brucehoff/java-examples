import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonPrefixTest {

	@Test
	public void testPairwisePrefix() {
		assertEquals("a", LongestCommonPrefix.longestCommonPrefix("abc", "a"));
		assertEquals("ab", LongestCommonPrefix.longestCommonPrefix("abc", "abz"));
		assertEquals("abc", LongestCommonPrefix.longestCommonPrefix("abcd", "abc"));
		assertEquals("", LongestCommonPrefix.longestCommonPrefix("abc", "xyz"));
	}
	
	@Test
	public void testLCP() {
		assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[] {"ab", "ac", "ad"}));
	}

}
