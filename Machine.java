
public class Machine implements Info {
	
	//what it does is, when you implement info then java forces you to implement all the methods 
	
	private int id = 7;
	
	public void start() {
		System.out.println("Hi Iam Kaldev!" );
	}

	@Override
	public void showInfo() {
		System.out.println("I a machine and my id is :" +id);
		
	}

}
