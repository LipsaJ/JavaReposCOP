
public class ProgStringArr {
	public static void main(String[] args) {
		String[] words = new String[2];
		// allocating enough memory for reference and not allocating for actual string;
		// default value for reference is null

		words[0] = "Hello to ";
		words[1] = "You!";

		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]);
		}
		System.out.println("");

		String[] fruits = { "Kiwi", "Apple", "Orange" };
		for (String iter : fruits) {
			System.out.println(iter);
		}

		// int value = 156;
		// primitive type actually
	}

}
