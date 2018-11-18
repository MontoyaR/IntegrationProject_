
public class module6Operators {
	public static void selection20() {
		System.out.println();
		System.out.println("Operators: \n");
		System.out.println("\t Value1 = 5");
		System.out.println("\t Value2 = 6 \n");
		int val1 = 5;
		int val2 = 6;
		double value1 = 5;
		double value2 = 6;
		int i = ++val1;
		int x = --val2;

		System.out.println("\t Addition: [ + ]");
		System.out.println("\t 5 + 6 = " + (val1 + val2));

		System.out.println();
		System.out.println("\t Subtraction: [ - ]");
		System.out.println("\t 5 - 6 = " + (val1 - val2));

		System.out.println();
		System.out.println("\t Division: [ / ]");
		System.out.println("\t 5 / 6 = " + (value1 / value2));

		System.out.println();
		System.out.println("\t Multiplication: [ * ]");
		System.out.println("\t 5 * 6 = " + (val1 * val2));

		System.out.println();
		System.out.println("\t Increment: [ ++ ]");
		System.out.println("\t 5++ = " + i);

		System.out.println();
		System.out.println("\t Decrement: [ -- ]");
		System.out.println("\t 6-- = " + x);

		System.out.println();
		System.out.println("\t EqualPlus: [ += ]");
		System.out.println("\t 5 =+ 6 = " + (val1 += val2));

		System.out.println();
		System.out.println("\t Conditional: [ == ]");
		System.out.println("\t 5 == 6 = " + (val1 == val2));

		System.out.println();
		System.out.println("\t Relational: [ > ] ");
		System.out.println("\t 5 > 6 = " + (value1 > value2));

		System.out.println();
		System.out.println("\t Operator precedence is the same at PEMDAS. ");
	}
}
