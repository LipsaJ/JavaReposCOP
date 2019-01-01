
public class IfElseLoop {
	public static void main(String[] args) {
		int loop = 5;

		if (loop < 1) {
			System.out.println("Its true!");
		}

		else if (loop > 7) {
			System.out.println("No! Its false");

		}

		else {
			System.out.println("Non of the above");
		}

		int val = 0;
		while (val < 6) {
			System.out.println("Hi val: " + val);

			if (val == 5)
				break;
			System.out.println("Running!");
			val++;
		}
	}

}
