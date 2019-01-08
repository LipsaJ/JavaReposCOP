
public class ProgMultDimArr {
public static void main(String[] args) {
	int[][] grid = {
			{ 1,2,3},
			{ 5,6},
			{0,7,8,9}
	};
	
	System.out.println(grid[2][3]);
	
	String[][] texts = new String[2][4];
	
	texts[0][1] = "Hi there!";
	System.out.println(texts[0][1]);
	
	for(int row = 0; row < grid.length ;row++) {
		for(int col = 0; col < grid[row].length; col++) {
			System.out.print(grid[row][col] + "\t");
		}
		System.out.println();
	}
	
}
}
