
public class NonPrimitiveString {
	public static void main(String[] args) {
		int myInt = 7;
		
		String myString = "Hello";
		//here string is a class , hello is an instance in other words 
		//you can say object of class string, so myString doesnt store like 
		//primitive variables it refers to an obejct
		
		String gap = " ";
		String name = "Hanzu";
		String greeting  = myString + gap + name;
		System.out.println(greeting);
		System.out.println(greeting + ".");
		System.out.println("My integer is: " + myInt);
		
		
	}

}
