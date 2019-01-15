public class Robot {
	
	private int id;
	
	//this is nested or inner class, it can use the instances of class in this
	public class Brain{
		public void think(){
			System.out.println("id "+id + "'s brain is thinking");
		}
	}
	
	/* classes like this, what they're probably most often used for is just logically grouping bits of outer classes.
	Like here, the robot might be made up of might have a brain and legs and heart and so on.
	I don't know about heart, but different parts of it anyway.
	we can group those different parts if we want to using inner classes and 
	 */
	
	/* here if we change the innerclass from private to public , it can be used outside class in main program
	 * but we rarely do that
	 */
	
	//static inner class
	public static class Battery{
		public void charge(){
			System.out.println("Battery is charging");
			//System.out.println("BEttery is charging" +id ); cant use this in static inner class
		}
	}
	
	/*But what you usually use static inner classes for are,it's just, are, it's just a way of grouping classes together.
	So, let's say in this case you've got robots and they can have interchangeable batteries so you might want to create a 
	robot battery outside of this class. And then pass it to whatever robots need that charged battery.
	 */

	public Robot(int id) {
		this.id = id;
	}
	public void start(){
		System.out.println("Starting Robo id : " + id);
		
		Brain brai = new Brain();
		brai.think();
		
		final String name = "Robert";
		
		class Temp{
			public void doSomething(){
				System.out.println(id + "th id is doing something");
				System.out.println("My name is :" + name);
				
			}
		}
		//for some reason you dont want to use anonymous class, then use this
		
		Temp temp1 = new Temp();
		temp1.doSomething();
	}
	
	

}
