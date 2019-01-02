class Frog{
	
	private String name;
	private int id;
	
	public String toString() {
		//return "Hello";
		
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		
		return sb.toString();
	}
	
	//constructor
	
	public Frog(int id,String name) {
		
		this.id = id;
		this.name = name;
		
	}

		
	
	
}
public class AppToString {

	public static void main(String[] args) {
		Frog Freddy = new Frog(7,"Frez");
		Frog Derbs = new Frog(8,"Derx");
		
		// without the toString method defined it shows the Frog@23456 which is object name 
		//and hashcode
		System.out.println(Freddy.toString());
		System.out.println(Derbs);//even if you dont write by default it invokes toString method
		// for dbugging u can use this it tells you the object
		

	}

}
