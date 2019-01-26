import java.util.HashMap;
import java.util.Map;

public class App {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		//here integer is key and string is value
		hashMap.put(1, "One");
		hashMap.put(2, "two");
		hashMap.put(10, "ten");
		hashMap.put(3, "three");
		hashMap.put(5, "five");
		hashMap.put(7, "seven");
		
		String  text  = hashMap.get(2);
		
		System.out.println(text);
		// so we cant keep duplicate keys in HashMap but the below line here updates the value from two to Hello
		hashMap.put(2, "Hello");
		System.out.println(hashMap.get(2));		
		
		//HashMap is not sorted  , if you iterate once you get some order next time the order might change
		
		for(Map.Entry<Integer , String> entry: hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " +value);
		}
		
		
		
	}

}
