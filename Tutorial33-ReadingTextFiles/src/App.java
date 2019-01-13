import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//String filename = "C:\\Users\\yashpal123\\Desktop\\example.txt";
		
		//drag the file in project folder and keep, thats one more way to access files
	
		String filename = "example.txt";
		File textfile = new File(filename);
		Scanner in = new Scanner(textfile);
		
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		
		int count = 2;
		
		//an invisible character here which next int doesn't read, and next line does read 
		//and it is new line character
		
		in.nextLine();
		
		//  to verify the above comment just remove in.nextLine and check
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + ": "+line);
			count++;
		}
		
		in.close();
	}

}
