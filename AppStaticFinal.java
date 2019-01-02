class Thing{
	public final static int LUCKY_NUMBER = 7;
	
	public int id;
	public String name;
	public static String description; 
	
	public static int count = 0;
	
	public Thing() {
		
		count++;
		id = count;
		//this constructor is run everytime we create an object, so it gives us the number
		//since count is static so there is only one count for the class shared among all the objects
	}
	
	
	//static variable- belong to the class not with the object, each object does not gets it copy
	//it also called class variable
	
	public void showName() {
		System.out.println(description + " no " + id +" :" +name);
		
	}

	/*what can be used static for?
	 * 1.method takes argument never deals with instance data then we can make static
	 * 2.example Math.PI . PI is constant we can assign it to anything else, constants are in 
	 * upper case example lucy number.
	 * 3. Another example is we can count the number of objects created
	 * */
	
	//static method cannot be accessed by class, similar to static variable
	//below is the example it could be only accesed by class
	
	public static void showInfo() {
		System.out.println(description);
		//wont work:System.out.println(name);
		
		//static method cant access instance variable name since static variable data exists
		//even before the object is created but instance method can access static data ; same reason
		// as instance method is created before object
	}
}

public class AppStaticFinal {
	
	public static void main(String[] args) {
		
		Thing.description = "I am thing";
		
		Thing.showInfo();
		
		System.out.println("Count before the object creation: " + Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("Count after the object creation: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		System.out.println(Thing.LUCKY_NUMBER);
	}

}
