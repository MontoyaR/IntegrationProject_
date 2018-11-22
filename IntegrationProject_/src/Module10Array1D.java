import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author ramontoya7474
 *
 */
public class Module10Array1D {
  public static void selection21() {
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
    System.out.println("\t The sum of the array is " + sum);

    // .sort allows the user to sort the array
    Arrays.sort(value);

    // .binarySearch allows the user to find the index within a "sorted" array
    System.out.println("\t The index of 3 is " + Arrays.binarySearch(value, 3));
  }
}
