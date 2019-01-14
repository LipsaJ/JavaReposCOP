
public class App {
	
	public static void main(String[] args) {
		//checked exception: are those which you are forced to handle
		//runtime as the name says below are some examples
		
		/*
		int value = 9;
		
		System.out.println(value/0);
		
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		*/
		
		/*
		String test = null;
		System.out.println(test.length());
		
		Exception in thread "main" java.lang.NullPointerException
		*/
		
		String[] texts = {"one", "two", "three"};
		
		//System.out.println(texts[3]);
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		
		//you can catch like below
		
		try {
			System.out.println(texts[3]);
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
	}

}
