
public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Car car1 = new Car();
		
		mach1.startMach();
		mach1.stopMach();
		
		car1.startMach();
		car1.windWiper();
		car1.stopMach();
		
		//you can see methods of objects as well, which is the,
		//secretly the ultimate parent class of both machine and car.

	}

}
