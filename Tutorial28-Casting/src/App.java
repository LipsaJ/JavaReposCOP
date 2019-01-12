
public class App {
	
	public static void main(String[] args) {
		
		byte byteValue = 78;
		short shortValue = 990;
		int intValue = 1890;
		long longValue = 9998765;
		
		float floatValue = 90.8f;
		float floatValue2 = (float)908.6;
		
		double doubleValue = 8765.43;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		intValue = (int)floatValue;
		// we need casting from float to int, it just cuts off from point onwards doesnt round it off
		
		System.out.println(intValue);
		
		floatValue = byteValue;
		//we dont need here as it just add .00
		
		System.out.println(floatValue);
		
		//be very carefull while doing this as it starts from first number 
		// here byte can store upto 127 so 128 started from the other end
		byteValue = (byte)128;
		System.out.println(byteValue);
		byteValue = (byte)130;
		System.out.println(byteValue);
		byteValue = (byte)240;
		System.out.println(byteValue);
	}

}
