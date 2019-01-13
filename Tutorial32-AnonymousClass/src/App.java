class Machine{
	public void start() {
		System.out.println("Machine starting...");
	}
}

interface Plant{
	public void grow();
}
public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine() {

			@Override
			public void start() {
				System.out.println("Camera snapped........");
			}
			
			//this is a child class of Machine as its overriding the method but we dont know
			//what class it belongs to thats why its called anonymous class
		};
		
		
		mach1.start();
		
		Plant p1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Its growing....");
				
			}
		};
	p1.grow();
	//both are anonymous class in this example 
	}
	
}
