/** Overloading a method.
 * @author ramontoya7474
 *
 */
public class Module9Overloading {

  /** This class shows an example of overloading a method.
   * 
   */
  public static void selection26() {
    System.out.println("Overloading Methods:");

    Sum add = new Sum();

    System.out.println("\t sum(int x, int y)");
    System.out.println("\t " + add.sum(10, 20));
    System.out.println("\t sum(int x, int y, int z)");
    System.out.println("\t " + add.sum(10, 20, 30));
    System.out.println("\t sum(double x, double y)");
    System.out.println("\t " + add.sum(10.5, 20.5));
  }
}
