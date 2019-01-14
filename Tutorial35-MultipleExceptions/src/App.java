import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
	
	//first like this:
	public static void main(String[] args)/* throws IOException, ParseException*/ {
		
		Test test = new Test();
		//single catch
		/*
		try {
			test.run();
		} catch (IOException e) {
			System.out.println("It is Input output exception");
		} catch (ParseException e) {
			System.out.println("It is parse exception!");
		}
		
		*/
		
		//multi-catch
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		*/
		//if u have child exception you need to handle it before the parent exception otherwise the
		//would never let it reach.
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*We have to have file not found exception.Exception first. And the reason for that is 
		 * that if we had IO Exception first here,then IO Exception would catch File Not Found 
		 * Exception as well.So, what happens is Java works down. Here the catch blocks cant be 
		 * exchanged
		 */

		//Multicatch doesnt work here
		/*
		try {
			test.input();
		} catch (FileNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/



	}

}
