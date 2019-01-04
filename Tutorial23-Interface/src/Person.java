
public class Person implements Info {
	
	public String s;
	
	
	
	public Person(String s) {
		//super();
		this.s = s;
	}



	public void greet() {
		System.out.println("Hi Iam a person! ");
	}



	@Override
	public void showInfo() {
	
		System.out.println("My name is :" +s);
		
	}

}
