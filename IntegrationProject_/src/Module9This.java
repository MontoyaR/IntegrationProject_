
/** Class with .this.
 * @author Montoya
 *
 */
public class Module9This {
  int a1;
  int b2;

  // Parameterized constructor
  Module9This(int a, int b) {
    this.a1 = a;
    this.b2 = b;
  }

  void display() {
    System.out.println("Using [ this. ] :");
    // Displaying value of variables a and b
    System.out.println("\t a = " + a1 + "  b = " + b2);
  }
}
