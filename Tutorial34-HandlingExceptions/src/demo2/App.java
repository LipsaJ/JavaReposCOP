package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//Delete the text.txt file to see resultset
public class App {
	public static void main(String[] args) {
		File file = new File("text.txt");
		try {
			FileReader fr = new FileReader(file);
			System.out.println("FileFound!");
		} catch (FileNotFoundException e) {
			System.out.println("Could not open the file " + file.toString());
		}
	}

}
