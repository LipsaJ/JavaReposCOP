
public class App {
	
	public static void main(String[] args) {
		App app = new App();
		//=====================================
		int value = 7;
		
		System.out.println("1.Value is : "+value);
		
		int k = app.show(value);
		
		System.out.println("4.Value is : "+value);
		System.out.println("5.Value is : "+k);
		//=====================================
	
		// in java we have passing by value there is nothing like passing by reference;
		//passing of reference happened in lang like c++
		
		Person person = new Person("Bob");
		System.out.println("1.Person is : "+person);
		
		app.show(person);
		System.out.println("4.Person is : "+person);
	}
	
	
	
	public int show(int value){
		
		System.out.println("2.Value is : "+value);
		value = value+1;
		System.out.println("3.Value is : "+value);
		return value;
		
	}
	
	//this is called method overloading
	public void show(Person person) {
		
		System.out.println("2.Person is : "+person);
		//thats because we are actually changing the name of the object so in the 4th place its
		//Sue
		person.setName("Sue");
		person = new Person("Hanz!");
		
		System.out.println("3.Person is : "+person);
		
/* check here it becomes Sue after HAnz because of same reason
		person.setName("Sue");
		System.out.println("3.a.Person is : "+person);
		*/
	}

}
