
public class AppStringBuildStringFormatr {
	public static void main(String[] args) {

		/* in java Strings are immutable, so you can never change it, this piece of code
		 *  is also quite inefficient, because every time it looks like its appending
		 *  but in reality it doesn't append instead we are reassigning the info variable,
		 *  everytime we do this it doesnt append instead reassign, To handle this we have
		 *  Spring builder class
		 */
		
		//inefficient code
		String info = "";
		info += "Hi Iam Liss";
		info += " and ";
		info += "me is cute";
		
		System.out.println(info);
		
		//efficient - since uses less memory
		StringBuilder sb = new StringBuilder("");
		sb.append("Liffe is me");
		sb.append(" and ");
		sb.append("Lovies Hanzu");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		//method chaining is below
		
		s.append("Hanzu is ").append(" a ").append("lion tamer.");
		
		System.out.println(s.toString());
		
		//in older code u can see string buffer when compared to string builder
		
		//String formating
		
		System.out.print("\tThis is tab.\nThis is new line.");
		System.out.println("More Values.");
		
		//%4d gives 4 space you can make it left allign with -
		System.out.printf("This is integer %4d and left alligned number is %-5d\n",5,60);
		for(int i =0;i<15;i++) {
			System.out.printf("%2d: %s\n", i,"Here is some text");
		}
		//System.out.printf("This is string %s.",);
		
		//floating formatting
		
		System.out.printf("This is decimal %f\n",5.67);
		System.out.printf("This is decimal %.2f\n",5.6799);
		System.out.printf("This is decimal %.1f\n",235.6799);
		System.out.printf("This is decimal %6.2f\n",235.6799);
		//here 6 implies including all that is including 2,3,5,.,6,8
		System.out.printf("This is decimal %6.1f\n",235.6799);
		//here 6 implies including all that is including (blank),2,3,5,.,6, as we have
		//mentioned .1 it cant take after it
		System.out.printf("This is decimal %-6.1f\n",235.6799);
		//here 6 implies including all that is including 2,3,5,.,6,8 and negetive means left 
		//assigning

	}

}
