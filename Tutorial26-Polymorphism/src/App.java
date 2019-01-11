
public class App {

	public static void main(String[] args) {

		/*Now what polymorphism means, in a nutshell, is that,
		 * if you have a child class of some parent class, you can
		 * always use the child class anywhere where you would normally use the parent class.*/
	
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		/*
		Plant plant2 = plant1;
		//so here we have only one plant object but two references are referring to it.
		*/
		
		Plant plant2 = tree1;
		//but because tree is a subclass of plant we can always refer to tree where ever there
		//is a plant
		
		plant2.grow();
		/*It's not the type of the variable, which can be plant or tree or whatever.
		 * What matters is the actual type of object, containing the actual code, the actual variables,
		 * the guts of the thing, and it's gonna run, it's the object that matters.
		 * 
		 * Reference is plant type but the object which its pointing is tree and then that 
		 * method is run
		 */
		
		tree1.shedLeaves();
		
		//Remove comment and see
		//plant2.shedLeaves();
		
		//while trying to call a method, what matters is the type of the variable.
		System.out.println("");
		doGrow(tree1);
		// as you can see you can pass tree as variable (since tree is subclass of plant)
		System.out.println("");
		doGrow(plant1);
	}
/*	
its the variable which decides what method to call, But it's the type of the object that variable 
refers to that determines which actual methods,implementations will actually be called when you call that method.
*/
	
	
	public static void doGrow(Plant p) {
		p.grow();
	}

}
