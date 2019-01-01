import java.util.Scanner;

public class DoWhileProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Please enter number: ");
		int value = scan.nextInt();
		
		while(value != 5) {
			System.out.println("Please enter number: ");
            value = scan.nextInt();
		}*/
		
		int value = 5;
		do {
			System.out.println("Please enter number: ");
            value = scan.nextInt();
		}while(value !=5);
		
		System.out.println("Got 5!");
		scan.close();
	}

}
