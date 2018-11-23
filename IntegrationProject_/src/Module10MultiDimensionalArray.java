
public class Module10MultiDimensionalArray {
	public static void selection33() {
		System.out.println("2-Dimensional Integer Array:");

		int[][]	grid = {
	    		{3, 5, 2343},
	    		{2, 4},
	    		{1, 2, 3, 4}
	    };
	    System.out.println("\t Output: grid[1][1]");
	    System.out.println("\t " + grid[1][1] + "\n");
	    
	    System.out.println("\t Output: grid[0][2]");
	    System.out.println("\t " + grid[0][2] + "\n");
	    
	    //String Array requires more coding and manual definitions of each row and column
	    System.out.println("2-Dimensional String Array:");
	    
	    String[][] texts = new String[2][3];
	    texts[0][1] = "This is row 0, column 1";
	    texts[0][2] = "This is row 0, column 3";
	    
	    System.out.println("\t Output: text[0][1]");
	    System.out.println("\t " + texts[0][1] + "\n");
	    
	    System.out.println("\t Output: text[0][2]");
	    System.out.println("\t " + texts[0][2] + "\n");
	}
}
