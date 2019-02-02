import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else
			return 0;
	}

}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);
	}

}

public class App {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("ant");
		animals.add("zebra");
		animals.add("tiger");
		animals.add("elephant");
		animals.add("dog");

		// this sorts in natural order
		// Collections.sort(animals);
		// this is in length comparison
		// Collections.sort(animals,new StringLengthComparator());
		// this is for alphabetical order
		// Collections.sort(animals,new AlphabeticalComparator());
		// this is for reverse
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(100);
		numbers.add(31);
		numbers.add(15);
		numbers.add(61);
		numbers.add(1);
		numbers.add(180);

		Collections.sort(numbers);

		// sort in reverse
		// this time you can use anonymous class instead of using a seperate
		// here we want integer in reverse order
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});

		for (Integer number : numbers) {

			System.out.println(number);

		}

		// sorting random objects
		List<Person> people = new ArrayList<Person>();

		people.add(new Person(3, "Bob"));
		people.add(new Person(1, "Sue"));
		people.add(new Person(4, "Hanz"));
		people.add(new Person(2, "Lif"));

		// sort in order of id
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				} else
					return 0;
			}
		});

		for (Person itr : people) {
			System.out.println(itr);
		}
		// sort in order of name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		for (Person itr : people) {
			System.out.println(itr);
		}
	}
}
