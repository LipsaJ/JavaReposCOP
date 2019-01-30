import java.util.Iterator;
import java.util.LinkedList;

public class App {
	
	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Fox");
		animals.add("Lion");

		
		//old iterator, which is usefull now as well.
		System.out.println("/////////////////OLD METHOD////////////////");
		//this returns an iterator object
		Iterator<String> it  = animals.iterator();
		
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
			
			if(value.equals("Fox")){
				it.remove();
			}
		}
		
		
		//this is mordern dor loop for iteration since 
		System.out.println("/////////////////NEW METHOD////////////////");
		
		for(String animal: animals){
			System.out.println(animal);
		}
		
		//if u want to add in while loop use list iterator
	}

}
