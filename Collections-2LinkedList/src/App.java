import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		//so if you want to add the numbers in middle or anywhere use linkedlist but if you are specific about the end 
		//or you want to add the new numbers only in the end then use arrayList, near he end o flist is arrayList is faster
		List<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * ArrayList manages s array internally...
		 * [0],[1],[2],[3],[4].....
		 * so traversing a list is very fast getting a particular item is very fast. so when a number is added in the end it just 
		 * doubles the size and adds it but in the case of middle or start it has to shift evertything by that many blocks which
		 * makes it very slow.
		 */
		
		List<Integer> linkedList = new LinkedList<Integer>();
		
		/*LinkedList consists of elements where each element has reference to previous and next number
		 * [0]->[1]->[2]->[3]....
		 *    <-   <-   <-   
		 *so to traverse a linked list can be little slower at a perticular point
		 */
		
		doTimings("ArrayList",arrayList);
		doTimings("LinkedList",linkedList);
	}

	public static void doTimings(String type, List<Integer> list) {
		
		long st = System.currentTimeMillis();
		
		for(int i = 0;i<1E5;i++) {
			list.add(i);
			
		}

		long en = System.currentTimeMillis();
		
		System.out.println("Time taken to create " + type + " is :" + (en - st ) + " ms");
		
		/*Time taken to create ArrayList is :12
		  Time taken to create LinkedList is :10*/
		
		st = System.currentTimeMillis();
		
		for(int i = 0;i<1E5;i++) {
			list.add(i);
			
		}

		en = System.currentTimeMillis();
		
		System.out.println("Time taken to add at the end, for " + type + " is :" + (en - st )+ " ms");
		
		/*Time taken to add at the end, for ArrayList is :8
		  Time taken to add at the end, for LinkedList is :15*/
		
		//add else where
		
		st = System.currentTimeMillis();
		
		for(int i = 0;i<1E5;i++) {
			list.add(0,i);
			
		}

		en = System.currentTimeMillis();
		
		System.out.println("Time taken to add elsewhere, for " + type + " is :" + (en - st )+ " ms");
		
		/*Time taken to add elsewhere, for ArrayList is :7037
		  Time taken to add elsewhere, for LinkedList is :15*/
		
		st = System.currentTimeMillis();
		
		for(int i = 0;i<1E5;i++) {
			list.add(list.size()-50,i);
			
		}

		en = System.currentTimeMillis();
		
		System.out.println("Time taken to add (size -50), for " + type + " is :" + (en - st )+ " ms");
		
		/*Time taken to add (size -50), for ArrayList is :12
		  Time taken to add (size -50), for LinkedList is :28*/
	}
}
