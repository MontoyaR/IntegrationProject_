
public class InfoArray {
    public static void selection22() {
	//Additional code for an Array; an array begins with value 0 {value 0, value 1, value 2}
    int[] array = {3, 5, 2343};
    
    //array[2] outputs the second value in the array which is 2343
    System.out.println(array[2]); 
    
    //2-Dimensional Integer Array; int[row][column]
    int[][]	grid = {
    		{3, 5, 2343},
    		{2, 4},
    		{1, 2, 3, 4}
    };
    
    System.out.println(grid[1][1]);
    System.out.println(grid[0][2]);
    
    //2-Dimensional String Array; String[2][3] defines the total of 2 rows and 3 columns. String Array requires more coding and manual definitions of each row and column
    String[][] texts = new String[2][3];
    texts[0][1] = "This is row 0, column 1";
    texts[0][2] = "This is row 0, column 3";
    
    System.out.println(texts[0][1]);
    System.out.println(texts[0][2]);
    
    }
}
