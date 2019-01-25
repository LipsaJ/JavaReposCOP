import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//adding new numbers
		numbers.add(10);
		numbers.add(12);
		numbers.add(20);
		
		System.out.println("Number at o place is: "+numbers.get(0));
		
		System.out.println("First for loop: ");
		//retrieving data
		for(int i = 0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("Second for loop: ");
		//another forLoop
		for(Integer value:numbers ) {
			System.out.println(value);
		}
		
		//removing data, it just removes the last element
		numbers.remove(numbers.size() -1);
		
		//this is very slow, here has to copy
		numbers.remove(0);
		
		System.out.println("Last for loop: ");
		//retrieving data
		for(int i = 0;i<numbers.size();i++) {
			System.out.println("number at position " +i + " is " +numbers.get(i));
		}
		
		//List interfaces:
		
		List<String> values = new ArrayList<String>();
		
	}

}
