
public class AppEnum {
	
	public static void main(String[] args) {
		//this is 90 to 95% of uses
		Animal type = Animal.CAT;
		
		switch(type){
		case CAT:
			System.out.println("CAT");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("MOUSE");
			break;
		default:
			break;
		
		}
		System.out.println();
		Animal animal = Animal.DOG;
		System.out.println(animal);
		System.out.println(animal.name);
		System.out.println(animal.getClass());
		System.out.println(animal instanceof Enum);
		System.out.println(animal.getName());
		System.out.println(animal.toString());
	}


}
