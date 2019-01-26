import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	
	public static void main(String[] args) {
		/*
		 * HashMaps are not sorted so to be sorted you have to use linked Hashmaps
		 * Linked Hashmaps has W link list that means it stays in same order in which you add
		 * Tree maps sorts the values you add, sp for numbers the natural oder is 1,2,3 for Strings it 
		 * alphabetical order
		 */
		/*
		HashMap<Integer , String> hashMap = new HashMap<Integer , String>();
		LinkedHashMap<Integer , String> linkedHashMap = new LinkedHashMap<Integer , String>();
		TreeMap<Integer , String> treeMap = new TreeMap<Integer , String>();
		*/
		//just replace HashMap,LinkedHashMap, TreeMap with Map
		Map<Integer , String> hashMap = new HashMap<Integer , String>();
		Map<Integer , String> linkedHashMap = new LinkedHashMap<Integer , String>();
		Map<Integer , String> treeMap = new TreeMap<Integer , String>();
		
		//testMap(hashMap);
		//here may be its coming with ascending key values but thats not the case always
		
		//testMap(linkedHashMap);
		//maintains the order
		
		testMap(treeMap);
		//it always maintain
	}
	
	/*
	 * Interface map is same like the bank example, so while creating the map you think which kind of map needs to be used
	 * once created you only worry about the properties,
	 */
	
	public static void testMap(Map<Integer , String> map) {
		
		map.put(10, "Dog");
		map.put(1, "Cat");
		map.put(6, "Elephant");
		map.put(8, "Girrafe");
		map.put(3, "Bear");
		map.put(2, "Lion");
		map.put(5, "Rat");
		map.put(4, "Dolphin");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + " : " +value);
		}
		
	}

}
