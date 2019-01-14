import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		File file = new File("text.txt");
		
		//this try with resources is present on Java 7 version onwards
		//u can see previous tutorial how messed up it was without this try with resources
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + file.toString() );
		} catch (IOException e) {
			System.out.println("Unable to Read " + file.toString() );
		};
		

	}

}
