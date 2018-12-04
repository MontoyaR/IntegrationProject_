
/** Do While Loop statement.
 * @author ramontoya7474
 *
 */
public class Module7DoWhileLoop {
  /** This class gives an example of a Do While Loop.
   * 
   */
  public static void selection23() {

    System.out.println("Do-While Loop: \n ");
    System.out.println("\t Syntax: [ do { statement(s) } while (expression); ");
    int counter = 0;

    do {
      System.out.println("\t " + counter);
      counter++;
    } while (counter <= 10);
  }
}
