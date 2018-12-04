
/** String Comparisons.
 * @author ramontoya7474
 *
 */
public class Module6CompareString {
  /** Different ways to compare String.
   * 
   */
  public static void selection18() {
    System.out.println();
    System.out.println("String Comparison: \n");

    // Initializing Strings
    String str1 = "good";
    String str2 = "good";
    String str3 = "morning";

    // Checking if good string
    // equates to good object
    System.out.print("\t Difference of good(obj) and good(str) : ");
    System.out.println(str1.compareTo(str2));

    // Checking if good string
    // equates to morning object
    System.out.print("\t Difference of morning(obj) and good(str) : ");
    System.out.println(str1.compareTo(str3));
  }
}
