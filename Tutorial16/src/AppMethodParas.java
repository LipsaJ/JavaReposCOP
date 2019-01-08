class Robot {
	public void speak(String text) {

		System.out.println(text);

	}
	
	public void jump(int h) {
		
		System.out.println("I jumped " + h + " meters.");
	}
	
	public void travel(String dir, double d) {
		System.out.println("My direction is " + d + " inches to the " + dir);
	}
}


public class AppMethodParas {
	public static void main(String[] args) {

		Robot sam = new Robot();
		sam.speak("Hi I am lips!");
		
		sam.jump(7);
		
		sam.travel("North",5.7);
		
		String greeting;
		greeting = "Hi from yashi!";
		
		sam.speak(greeting);

	}
}
