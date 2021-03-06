import java.util.Arrays;
import java.util.stream.IntStream;

/** Defines an Array and searches the index of a value.
 * @author ramontoya7474
 *
 */
public class Module10Array1D {
  /** This Module has an example of an Array.
   * It also shows how to sort the Array to find index of a specific value.
   */
  public static void selection31() {
    int[] value = {3, 5, 10, 1090, 1, 2343};
    int min = value[0];
    for (int index = 0; index < value.length; index++) {
      if (value[index] < min) {
        min = value[index];
      }
    }
    System.out.println("1-Dimensional Array: ");
    System.out.println("\t int[] value = {3, 5, 10, 1090, 1, 2343} \n ");
    System.out.println("\t The minimum vale within the array is " + min);
    
    //IntStream sum() returns the sum of elements in the stream
    int sum = IntStream.of(value).sum();
    System.out.println("\t The sum of the array is " + sum + "\n");

    // .sort allows the user to sort the array
    Arrays.sort(value);
    System.out.println("\t int[] value = {1, 3, 5, 10, 1090, 2343} \n");
    System.out.println("\t This is the new array after being sorted");
    
    // .binarySearch allows the user to find the index within a "sorted" array
    System.out.println("\t The index of 1090 is " + Arrays.binarySearch(value, 1090));
  }
}
