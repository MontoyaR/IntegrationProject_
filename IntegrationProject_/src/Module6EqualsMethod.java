
/**
 * @author ramontoya7474
 *
 */
public class Module6EqualsMethod {
	public static void selection19() {
		System.out.println();
		System.out.println("Equals Method: \n");

		// When we use == operator for s1 and s2 comparison then the result is false as
		// both have different addresses in memory.
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		boolean result = s1 == s2;
		System.out.println("\t " + result);
	}
}
