import java.util.Scanner;

/**
 * @author ramontoya7474
 *
 */
public class Module6Switch {
  public static void selection17() {
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.println("Switch Statement: ");
    System.out.println(
        "\t Please enter a number from 1 to 7, the numbers represent the day of week beginning with Monday.");
    int day = scan.nextInt();
    String dayString;

    // switch statement with int data type
    switch (day) {
      case 1:
        dayString = "\t Monday";
        break;
      case 2:
        dayString = "\t Tuesday";
        break;
      case 3:
        dayString = "\t Wednesday";
        break;
      case 4:
        dayString = "\t Thursday";
        break;
      case 5:
        dayString = "\t Friday";
        break;
      case 6:
        dayString = "\t Saturday";
        break;
      case 7:
        dayString = "\t Sunday";
        break;
      default:
        dayString = "\t Invalid day";
        break;
    }
    System.out.println(dayString);
    scan.close();
  }
}
