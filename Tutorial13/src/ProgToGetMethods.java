class Person{
	String name;
	int age;
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	int calculateYearsToRetirement() {
		int yearsToRetire = 60 - age;
		return yearsToRetire;
	}
}
public class ProgToGetMethods {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Lipsa";
		person1.age = 27;
		
		String name = person1.getName();
		int age = person1.getAge();
		
		System.out.println("My name is " + name + " and my age is " + age);
		int yearsToRetire = person1.calculateYearsToRetirement();
		System.out.println("years to retire: " + yearsToRetire);
		System.out.println("Years to retire are : " + person1.calculateYearsToRetirement());
		
	}

}
