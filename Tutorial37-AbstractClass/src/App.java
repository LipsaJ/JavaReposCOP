
public class App {

	//so machine is base class here which is used for other subclasses
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setId(3);
		
		Camera camera1 = new Camera();
		camera1.setId(2);
		
		//so if you want users to refrain from creating other classes that time you use 
		//abstract check the Machine class
		/*
		Machine mach1 = new Machine();
		*/
car1.run();
camera1.run();

/* you're only going to be able to extend one abstract class but you can implement as many 
 * interfaces as you like.*/
/*fundamental statement about identity than simply implementing an interface.It's as if the
 *  parent class determines what your [UNKNOWN] class is.But implementing an interface just 
 *  determines one thing that it does, and it can implement many interfaces, meaning it can do
 *   many different things.*/

/*And another consideration is that you cannot have code in an interface but in an abstruct class 
 * you can provide default functionally,we can actually have real functionally in an abstruct 
 * class like machine here but in an interface you're leaving implementation completely up to 
 * the child class. So you can't, you can't put code in an interface.*/
	}
}
