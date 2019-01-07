import java.util.Scanner;

public class TutScan {

	public static void main(String[] args) {
		//create scanner OBJECT
		Scanner input = new Scanner(System.in);
		//Output the prompt
		System.out.println("Enter the line:");
		//wait for user to enter something
		String text = input.nextLine();
		//Output the prompt
		System.out.println("Enter a number");
		//wait for user to enter something		
		int t = input.nextInt();
		//Output the prompt
		System.out.println("Enter a double");
		//wait for user to enter something		
		double d = input.nextDouble();
		//show the output
		System.out.println("You entered line: " + text + ", the number is: " +t +" and the float is: " +d);
		//the warning was:Resource leak: 'input' is never closed, you can check this by removing the line
		input.close();
	}

}
