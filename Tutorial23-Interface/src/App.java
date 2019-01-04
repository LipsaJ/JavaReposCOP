
public class App {
	/*
	 * Some ppl make whole program with interfaces, its first they create interface
	 * and then make classes , so that they can decide how the objects talk to
	 * eachother For example (analogy) Lets say you take a bank card, before taking
	 * card you think of many things like where is the branch located, what is the
	 * interest amount which they give, but once you have card you just think it ti
	 * have few ]things like to show your staements and fund transer , so here the
	 * analogy is you dont need all the methods you just need few of the regular
	 * ones
	 */

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		Person per1 = new Person("Bob");

		mach1.start();
		per1.greet();

		// Interface is used when we want two different classes to have same methods,
		// and these two
		// classes are not even related to each other. For example here machine and
		// Person totally
		// different classes

		mach1.showInfo();
		per1.showInfo();

		Info info1 = new Machine();
		// if you create an object like this then you will get only access to the
		// methods which are in the info interface
		// this is a type of variable which is pointing an object of type machine, and
		// it will access just one method
		// which is part of interface.

		Info info2 = per1;
		// Per1 id actually a reference to a person object

		System.out.println();

		info1.showInfo();
		info2.showInfo();

		System.out.println();

		someMethod(per1);
		someMethod(mach1);
		// can pass any object which implememts the info interface
	}

	// can use static only here
	private static void someMethod(Info info1) {
		info1.showInfo();
	}

}
