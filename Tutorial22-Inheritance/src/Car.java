
public class Car extends Machine{

	//right click -> source -> implement override
	@Override
	// this @Overide checks if the parent actually has the method or not
	public void startMach() {
		// TODO Auto-generated method stub
		//super.startMach(); this is just the parent class
		
		System.out.println("Car started!");
	}
	
	//create a new method which cant be accesed by the parent
	public void windWiper() {
		System.out.println("Cleaned it! :" +name);
	}
	

}
