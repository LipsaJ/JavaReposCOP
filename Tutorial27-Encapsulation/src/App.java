class Plant{
	private String name;
	
	//even if we do expose any variable its final which cant be changed.
	public static final int id = 9;
	
	
	//the idea of encapsulation is to encapsulate the inner workings of the class within the class
	//in other words stop ppl to getting inside the class, but if you want them to use it you give 
	//certain public API

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData() {
		String data = "Some stuff" + calculateYeartoForecast();
		
		return data;
	}
	
	//so this is hidden but end use can use it through public getData()
	private int calculateYeartoForecast() {
		return 9;
	}
	
	//so try to keep instances private so that only your class can use, you dont want somebody 
	//else to change it,  use protected for child and you can use public methods for others to use
}

public class App {

	public static void main(String[] args) {
		
	}
}
