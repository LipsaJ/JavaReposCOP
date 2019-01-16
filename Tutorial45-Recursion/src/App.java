
public class App {

	public static void main(String[] args) {
		
		//calculate(1,5);
		
		System.out.println(calculate(5));;
	}
	
	public static int calculate(int value){
		
		if(value == 1){
			return 1;
		}
		
		return calculate(value - 1) * value;
			
	}
	
	/*public static void calculate(int mult, int value){
			
		
		if (value == 1){
			System.out.println(mult);
			return;}
		
		calculate(mult*value , value -1);
		//only problem is cause of statckoverflow , oe reason to avaoid
	}*/
}
