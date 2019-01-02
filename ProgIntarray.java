
public class ProgIntarray {

	public static void main(String[] args) {
		//int value = 7;
		int[] values;
		values = new int[3];
		
		for(int i = 0;i<values.length ; i++) {
			values[i] = 10 + i;
		}
		
		for(int i = 0;i< values.length ;i++) {
			System.out.println(values[i]);
		}
		
		int[] numbers = {5,8,90};
		
		for(int i = 0;i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}
