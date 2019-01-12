class Machine {
	
	public void start() {
		System.out.println("Machine started!");
	}
}

class Camera extends Machine{
	
	public void start() {
		System.out.println("Camera started!");
	}
	
	public void snap() {
		System.out.println("Photo taken");
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//upcasting
		Machine machine2 = camera1;
		machine2.start();
		
		//so here machine2 is a variable of type Machine so we can only call method start.
		//but the object its refering to is camera1 so we get start method from camera
		
		//downcasting
		Machine machine4 = new Camera();
		Camera camera3 = (Camera)machine4;
		camera3.snap();
		camera3.start();
		
		//this doesnt work
		/*
		Machine machine3 = new Machine();
		Camera camera2 = (Camera)machine3;
		System.out.println();
		camera2.start();
		camera2.snap();*/
		
		
		/*Upcasting is safe its guarenteed by Polymorphism, But downcasting inherently unsafe.
		 * And you have to really think when you're doing downcasting, and you wanna be really 
		 * sure that the variable you're downcasting really does refer to an object of the type 
		 * you're downcasting to*/
	}
}
