import ocean.Fish;
import ocean.plants.Seaweed;

//do cntrl+shift+o to get all the pachages required

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fish fish1 = new Fish();
		Seaweed sw1 = new Seaweed();
// 1. Package helps in organizing the huge codes and classes in sensible manner
// 2. they stop u having conflicts between classes as you can have only one class name; 
//u cant have classes with same names
		
		System.out.println(fish1 + " " + sw1);
		//returns classname with hashcode
		//ocean.Fish@70dea4e ocean.plants.Seaweed@5c647e05
	}

}
