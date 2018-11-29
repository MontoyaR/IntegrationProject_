
public class Module9This {
  int a;
  int b;

  // Parameterized constructor
  Module9This(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void display() {
    System.out.println("Using [ this. ] :");
    // Displaying value of variables a and b
    System.out.println("\t a = " + a + "  b = " + b);
  }
}
