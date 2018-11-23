
public class Module7BreakContinueLoop {
	public static void selection24() {
		
		System.out.println("Break Loop: ");
		
		for (int i = 0; i <= 10 ; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("\t " + i + " " );
		}
		System.out.println("\t Loop is over \n ");
		
		System.out.println("Continue Loop: ");
		
		for (int f = 1; f <= 10; f++) {
			if (f % 2 == 0) {
				continue;
			}
			System.out.println("\t " + f + " " );
		}
		System.out.println("\t Loop is over");
	}
}
