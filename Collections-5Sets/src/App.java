import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		//saves in any random order
		//Set<String> set1 = new HashSet<String>();
		//saves in input order
		//Set<String> set1 = new LinkedHashSet<String>();
		//saves in natural order
		Set<String> set1 = new TreeSet<String>();
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty at the start!!");
		}
		set1.add("Dog");
		set1.add("Cat");
		set1.add("Mouse");
		set1.add("Bear");
		set1.add("Snake");
		
		//adding duplicated does nothing
		
		set1.add("Mouse");
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty after adding elements!!");
		}
		
		System.out.println(set1);
		
		//iteration
		for(String elem :set1) {
			System.out.println(elem);
		}
		
		if(set1.contains("Asdfg")) {
			System.out.println("Set contains Asdfg");
		}
				
		
		if(set1.contains("Cat")) {
			System.out.println("It contains cat");
		}
		
		//search for set interface you will get details
		
		//set2 contains some common elements with set1 and some new
		
        Set<String> set2 = new TreeSet<String>();
		
        set2.add("Dog");
        set2.add("Cat");
        set2.add("Girrafe");
        set2.add("Monkey");
        set2.add("Lizard");
		//Intersection
        
        Set<String> intersection = new HashSet<String>(set1);
		//now intersection is copy of set1
        
        intersection.retainAll(set2);
        
        System.out.println(intersection);
        
        //difference
        
        Set<String> difference = new HashSet<String>(set1);
		//now difference is copy of set1
        
        difference.removeAll(set2);
        
        System.out.println(difference);
		
	}
}
