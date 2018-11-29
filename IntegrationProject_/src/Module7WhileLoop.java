import java.util.Scanner;

/**
 * @author ramontoya7474
 *
 */

public class Module7WhileLoop {
  public static void selection21() {
    Scanner scan = new Scanner(System.in);

    System.out.println("While Loop: ");
    System.out.println("\t Syntax: [ while (expression) { statement(s) } \n");
    System.out.println("\t Enter a number (-1 to quit): ");
    int sum = 0;
    int num = scan.nextInt();

    while (num != -1) {
      System.out.println("\t Enter a number (-1 to quit): ");
      num = scan.nextInt();
      sum = sum + num;
    }
    scan.close();
    System.out.println("\t The sum is " + sum);
  }
}
