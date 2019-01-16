
public enum Animal {
	
	CAT("Freddy"),DOG("Tommy"),MOUSE("Mini");
	
	String name;

	private Animal(String name) {
		this.name = name;
	}
	
	public String getName(){
		return"Name is called: " +name;
	}
	

}
