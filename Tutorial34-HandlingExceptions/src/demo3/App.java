package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//Delete the text.txt file to see resultset
public class App {
	public static void main(String[] args) {
		try {
			openFile();
			//this part runs only after file is found otherwise goes directly to catch
			System.out.println("File opened!!");
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file");
		}
		
		System.out.println("Finished!");
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("text.txt");
		FileReader fr = new FileReader(file);
	}

}
