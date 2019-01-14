package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Delete the text.txt file to see resultset
public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("text.txt");
		FileReader fr = new FileReader(file);
		
	
	}
}
