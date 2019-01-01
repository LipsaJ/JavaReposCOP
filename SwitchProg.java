import java.util.Scanner;

public class SwitchProg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter command(start or stop): ");
		String val = input.nextLine();
		switch (val) {
		case "start":
			System.out.println("Machine started!");
			break;// in case you dont use it prints all the case statements

		case "stop":
			System.out.println("Machine Stopped.");
			break;

		default:
			System.out.println("Selected none of the options");
		}

		input.close();
	}

}
