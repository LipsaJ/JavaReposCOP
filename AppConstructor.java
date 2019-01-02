class Machine{
	
	String name;
	int code;
	//constructor is a special method which runs everytime when you create your class
	//constructor method should have same name as class thats why starting with caps
	//no return like other methods where its mandatory to have return type
	//can have many constructors depending on your parameter
	//if calling a construtor from inside a constructor the use the "this" for example below
	// where we need to set the default code  to 0, used to set few default values
	public Machine() {
		this("bernie",0);
		
		System.out.println("Constructor1 running!");
	}
	
	public Machine(String name) {
		this(name,0);
		this.name = name;
		
		System.out.println("Constructor2 is running!!");
	}
	
	public Machine(String name, int code) {

		this.name = name;
		this.code = code;
		
		System.out.println("Constructor3 is running!!!");
	}
	
	String getName() {
		return name; 
	}
	
	int getCode() {
		return code;
	}
}
public class AppConstructor {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Liff",9);
		
		//here new invocates the constructor
		
		System.out.println(machine1.getName() + " :" + machine1.getCode());
		System.out.println(machine2.getName() + " :" + machine2.getCode());
		System.out.println(machine3.getName() + " :" + machine3.getCode());
	}

}
