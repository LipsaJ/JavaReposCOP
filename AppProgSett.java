class Frog {
	public String name;
	public int age;

	public void setName(String name) {
		this.name = name;
		
		//this.name -->here this means the instance variable which belongs to the object/class
		// name --> only name by itself means local variable
		// this means the refernce to obejct you are in
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
		
		// u cont need this here as its only kind of name
	}

	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}

public class AppProgSett {

	public static void main(String[] args) {

		Frog froggy = new Frog();

		froggy.setName("Lif");
		froggy.setAge(1);

		System.out.println("Our " + froggy.getAge() + " year old Frog's name is " + froggy.getName());

		Frog frozz = new Frog();
		frozz.setInfo("Hanzz", 2);
		
		System.out.println("Our " + frozz.getAge() + " year old loser Frog's name is " + frozz.getName());
	}

}
