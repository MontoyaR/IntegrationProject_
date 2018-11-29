
/**
 * @author ramontoya7474
 *
 */
public class Module6EqualsMethod {
  public static void selection19() {
    System.out.println();
    System.out.println("Equals Method: \n");

    String s1 = ("HELLO");
    String s2 = ("HELLO");
    
    // boolean result = (s1 == s2); This is the wrong way to compare string( == )
    // When we use == operator for s1 and s2 comparison then the result is false as both have
    // different addresses in memory.
    
    boolean result = s1.equals(s2); // Compares lexicographically
    System.out.println("\t " + result);
  }
}
