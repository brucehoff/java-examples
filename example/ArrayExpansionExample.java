import java.io.File;
import java.util.Scanner;

public class ArrayExpansionExample {

	public static final void main(String[] args) throws Exception {
		Scanner file = new Scanner(new File("input.txt"));
		
		int[] array = new int[1]; // Wow, this array is only 1 element long!
		int count = 0;
		while (file.hasNextInt()) {
			if (count >= array.length) {
				// Oh no, we've run out of space!
				// Make a new array, twice as long
				int[] temp = new int[array.length * 2];
				// copy the old array into the new one
				System.arraycopy(array, 0, temp, 0, count);
				// finally, "point" the old array to the new one
				array = temp;
			}
			array[count++] = file.nextInt();
		}
		
		for (int i=0; i<count; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		System.out.println("We used an array of length "+array.length+" to hold "+count+" values.");
		
	}

}
