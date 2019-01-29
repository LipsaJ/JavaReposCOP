import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		map.put("two", 2);
		//even if you add duplicate, it doesnt add
		for(String key : map.keySet()) {
			System.out.println(key + " : " +  map.get(key));
		}
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		
		set.add("one");
		
		//even if you add duplicate, it doesnt add
		for(String elem: set) {
			System.out.println(elem);
		}
		///////////////////The same logic works for objects as well/////////////////
		//should be able to remove duplicate 
		
		Person p1 = new Person(1,"Lif");
		Person p2 = new Person(2,"Hanz");
		Person p3 = new Person(3,"Kif");
		Person p4 = new Person(1,"Lif");
		
		Map<Person,Integer> mapPerson = new LinkedHashMap<Person,Integer>();
		
		mapPerson.put(p1, 1);
		mapPerson.put(p2, 2);
		mapPerson.put(p3, 3);
		mapPerson.put(p4, 4);
		
		for(Person key : mapPerson.keySet()) {
			System.out.println(key + " : " + mapPerson.get(key));
		}
		
		//it doesnt work without the equals code and hashcode
		
       Set<Person> setPerson = new LinkedHashSet<Person>();
		
       setPerson.add(p1);
       setPerson.add(p2);
       setPerson.add(p3);
		
       setPerson.add(p4);
		
		//even if you add duplicate, it doesnt add
		for(Person elem: setPerson) {
			System.out.println(elem);
		}
		
		//it doesnt work without the equals code and hashcode
		
	}

}
