import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample {
	
	public static void appendSomeText(String filename, String content) throws IOException {
		File file = new File(filename);
		boolean append = true;
		try (FileWriter fileWriter  = new FileWriter(file, append)) {
			fileWriter.write(content);
		}
	}

	public static void main(String[] args) throws Exception {
		String filename = "myfile.txt";
		File file = new File(filename);
		file.delete();
		appendSomeText(filename, "first line of text\n");
		appendSomeText(filename, "second line of text\n");
		
		System.out.println("Here's the file content:");
		try (FileInputStream is = new FileInputStream(filename)) {
			is.transferTo(System.out);
		}
	}

}
