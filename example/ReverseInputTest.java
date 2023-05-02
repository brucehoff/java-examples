import org.junit.Assert;
import org.junit.Test;

public class ReverseInputTest {

	@Test
	public void testReverseInput() {
		String[] testInput = new String[] {"Ryan", "Hamad", "Danny", "Bitey", "Humpy"};
		String expected = "Hi: Humpy Bitey Danny Hamad Ryan ";
		
		String actual = ReverseInput.reverseInput(testInput);
		
		Assert.assertEquals(expected, actual);
	}

}
