import java.util.ArrayList;

/**
 * @author ramontoya7474
 *
 */
public class Module10EnhancedLoop {
  public static void selection32() {

    System.out.println("Displays the elements: \n");

    ArrayList<String> names = new ArrayList<String>();
    names.add("Steve");
    names.add("Tim");
    names.add("Lucy");
    names.add("Pat");
    names.add("Angela");
    names.add("Tom");

    System.out.println("Option 1:");
    System.out.println("\t " + names + "\n");

    System.out.println("Option 2:");
    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      System.out.println("\t " + name);
    }
    System.out.println();
  }

  public static void enhancedForLoop() {
    System.out.println("Option 3 [ Enhanced For Loop ] :");
    ArrayList<String> names = new ArrayList<String>();
    names.add("Steve");
    names.add("Tim");
    names.add("Lucy");
    names.add("Pat");
    names.add("Angela");
    names.add("Tom");

    // Option 3
    for (String name : names) {
      System.out.println("\t " + name);
    }

  }
}
