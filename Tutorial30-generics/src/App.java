import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}
public class App {
	public static void main(String[] args) {

		/*So, a generic class is a class that can work with other objects and you specify what 
		 * type of object it can work with when you,instantiate a class, when you create objects 
		 *  from the class.
		 */

//old method
		ArrayList arr1 = new ArrayList();
		
		arr1.add("apple");
		arr1.add("Pear");
		arr1.add("Orange");
		
		//we have to downcast here
		String fruit = (String)arr1.get(2);
		System.out.println(fruit);
		
		//modern method
		
		ArrayList<String> arr2 = new ArrayList<String>();
		
		arr2.add("Cat");
		arr2.add("Dog");
		
		String animal = arr2.get(1);
		
		System.out.println(animal);
		
		//we dont need to downcast here
		
		//there can be more than one type of argument
		HashMap<Integer,String> hash1 = new HashMap<Integer,String>();
		
		ArrayList<String> l1 = new ArrayList<>();
		ArrayList<Animal> l2 = new ArrayList<>();
		
	}

}
