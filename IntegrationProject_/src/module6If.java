import java.util.Scanner;

public class module6If {
	public static void selection16() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("If Statement: ");
		System.out.println("\t What is 1 + 1? Enter your answer in the console window. ");
		int numresult = scan.nextInt();
		if (numresult == 2) {
			System.out.println("\t Your answered 2, this is correct. ");
		} else {
			System.out.println("\t Your answer is inccorect.");
			scan.close();
		}
	}
}
