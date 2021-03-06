public class AppInnerCl {
	
	public static void main(String[] args) {
		Robot robo1 = new Robot(1);
		robo1.start();
		
		/* This works and executable but in ur codes we rarely see any such inner class being
		 * used like this as this doesnt make anysense
		Robot.Brain br = robo1.new Brain();
		br.think();
		*/
		
		/* below doesnt work
		Robot.Brain br = Robot.new Brain();
		*/
		
		//this very common in java, as per our example itself battery might be needed 
		Robot.Battery rb = new Robot.Battery();
		rb.charge(); 
		
		/*So non-static inner classes are used when you need to group together some functionality.
		And you need the class to have access to the instance variables of the enclosing outer class.
		Static inner classes are used, let's make this public to be explicit. Static inner classes are used basically 
		where you just want a normal class that isn't associated with instances of the enclosing outer class, but
		you want, for some reason, you wanna group it with the outer class,so you could have Robot.Battery, Robot.CPU, whatever you like,
		but the point is it's grouped with Robot, and other than that, apart from that, it's really just a normal class.
		 */
		
	}

}