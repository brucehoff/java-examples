import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Histogram {


	/**
	 * 
	 * @param data the data to be displayed as a histogram
	 * @param bins the bin boundaries, e.g. {100, 200, 300, 400} defines three bins, [100,200),[200,300), and [300,400]
	 * @return the number of data items in each bin. Values < bins[0] or greater than bins[bin.length-1] are omitted
	 * @exception if bins are not ordered
	 */
	public static int[] counts(Double[] data, double[] bins) {
		for (int i=1; i<bins.length; i++) {
			if (bins[i]<=bins[i-1]) throw new IllegalArgumentException("Invalid bins.");
		}
		int[] result = new int[bins.length-1];
		for (double d : data) {
			if (d<bins[0]) {
				continue;
			}
			for (int i=1; i<bins.length; i++) {
				if (d<bins[i]) {
					result[i-1]++;
					break;
				}
			}
		}
		return result;
	}

	/**
	 *  Print one row of a histogram
	 * @param binMin the low value of the bin
	 * @param binMax the high value of the bin
	 * @param count the number of values in the bin
	 */
	public static void printBin(double binMin, double binMax, int count) {
		System.out.print(binMin);
		System.out.print("-");
		System.out.print(binMax);
		System.out.print(": ");
		for (int i=0; i<count; i++) {
			System.out.print("-");
		}
		System.out.println(" "+count);
	}

	/**
	 * Print a histogram
	 * @param bins the low and high values of the bins, ordered low to high
	 * @param counts the number of items in each bin
	 * Note that counts.length must equal bins.length - 1
	 */
	public static void printHistogram(double[] bins, int[] counts) {
		for (int i=0; i<bins.length-1; i++) {
			printBin(bins[i], bins[i+1], counts[i]);
		}
	}

	private static final double[] bins = {0, 10, 20, 30, 40};

	public static void main(String[] args) throws Exception {
		List<Double> data = new ArrayList<Double>();
		try (Scanner scanner = new Scanner(new File("temperatures.txt"))) {
			while (scanner.hasNextDouble()) {
				data.add(scanner.nextDouble());
			}
		}
		int[] counts = counts(data.toArray(new Double[] {}), bins);
		printHistogram(bins, counts);
	}

}
