import java.util.stream.IntStream;

public class module10Array1D {
	public static void slection21(int[] value) {
		
		
		// This is an example of an Array. An Array begins with value 0 {value 0, value
		// 1, value 2}
		int min = value[0];
		for (int index = 0; index < value.length; index++) {
			if (value[index] < min) {
				min = value[index];
			}
		}
		System.out.println("1-Dimensional Array: ");
		System.out.println("\t The minimum vale within the array is " + min);
		int sum = IntStream.of(value).sum();
		System.out.println("\t The sum of the array is " + sum);

	}
}
