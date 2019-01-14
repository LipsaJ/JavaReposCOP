
public abstract class Machine {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public abstract void start();
	//once you put this method here with abstarct the child class have to applu /implement it
	//other java shows error and wont complile
	//same like method in an interface
	public abstract void doStuff();
	public abstract void shutDown();
	
	//its very good way for child classes to handle (mandatory)
	
	public void run() {
		start();
		doStuff();
		shutDown();
	}
}
