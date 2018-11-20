import java.util.Scanner;

/**
 * @author ramontoya7474
 *
 */
public class Module6IfElse {
	public static void selection15() {
		Scanner scan = new Scanner(System.in);

		System.out.println("If/Else Statement: ");
		System.out.println("\t Enter a number between 1 and 4 at the console window. ");
		int num = scan.nextInt();
		if (num == 1) {
			System.out.println("\t You have choosen the number 1. ");
		} else if (num == 2) {
			System.out.println("\t You have choosen the number 2. ");
		} else if (num == 3) {
			System.out.println("\t You have choosen the number 3. ");
		} else if (num == 4) {
			System.out.println("\t 3You have choosen the number 4. ");
		}
			scan.close();
	}
}
