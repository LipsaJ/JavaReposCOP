class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}

	//hashcode is nothing but the unique id. It looks like memory location but it is not
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Object());//java.lang.Object@15db9742 this is hashcode
		
		Person person1 = new Person(1,"Sue");
		Person person2 = new Person(1,"Sue");

		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
		//so == equal equals just check if two references are pointing towards same object
		//.equals tells us if they are the same or not in terms of the value.
		System.out.print("check if person1 == person2 :");
		System.out.println(person1 == person2);
		System.out.println("check if person1.equals(person2): " + person1.equals(person2));
		//so make sure in case of non primitive numbers in equal equal (==) only do this when you thing
		//they are referng to same object
		
		//in case of string java optimizes to it and points to the same object
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hellogfht".substring(0,5);
		System.out.println("String three is :"+ str3);
		
		System.out.print("check if str1 == str2 :" );
		System.out.println(str1 == str2);
		//this is false because in this case they are different object so that why use .equals it checks
		//the value instead of object
		System.out.print("check if str1 == str3 :" );
		System.out.println(str1 == str3);
		//this gives answer as true
		System.out.println("check if str1.equals(str3) "+ str1.equals(str3));
		
	}

}