import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author ramontoya7474
 *
 */
public class IntegrationProject {

	public static void main(String[] args) {

		Module1Greetings.selection0();

		// Display menu
		System.out.println("Enter a menu selection:");
		System.out.println("\t 1. Java Built-in Data Types");
		System.out.println("\t 2. Integers");
		System.out.println("\t 3. Double");
		System.out.println("\t 4. String");
		System.out.println("\t 5. Boolean");
		System.out.println("\t 6. Definitions");
		System.out.println("\t 7. Final");
		System.out.println("\t 8. Casting");
		System.out.println("\t 9. Method One");
		System.out.println("\t 10. Method Two");
		System.out.println("\t 11. Method Three");
		System.out.println("\t 12. Escape Sequence");
		System.out.println("\t 13. Random Generator");
		System.out.println("\t 14. Math class");
		System.out.println("\t 15. If/Else Statement");
		System.out.println("\t 16. If statement");
		System.out.println("\t 17. Switch");
		System.out.println("\t 18. Compare String");
		System.out.println("\t 19. Equals Method");
		System.out.println("\t 20. Operators");
		System.out.println("\t 21. While Loop");
		System.out.println("\t 22. For Loop");
		System.out.println("\t 23. Do While Loop");
		System.out.println("\t 24. Break/Continue Loop ");
		System.out.println("\t 25. Classes [OOP]");
		System.out.println("\t 26. Overloading Methods");
		System.out.println("\t 27. Inheritance");
		System.out.println("\t 28. Polymorphism");
		System.out.println("\t 29. Super");
		System.out.println("\t 30. This");
		System.out.println("\t 31. 1-Dimensional Array");
		System.out.println("\t 32. Enhanced For Loop [ ArrayList ] ");
		System.out.println("\t 33. Multi-Dimensioal Array [ 2-Dimensional Array ]");

		Scanner scan = new Scanner(System.in);

		int selection;

		try {
			selection = scan.nextInt();

			switch (selection) {
			case 1:
				Module2List.selection1();
				break;

			case 2:
				Module2Integer.selection2();
				break;

			case 3:
				Module2Double.selection3();
				break;

			case 4:
				Module2String.selection4();
				break;

			case 5:
				Module2Boolean.selection5();
				break;

			case 6:
				Module2Definition.selection6();
				break;

			case 7:
				Module2Final.selection7();
				break;

			case 8:
				Module3Casting.selection8();
				break;

			case 9:
				Module3MethodOne.selection9();
				break;

			case 10:
				Module3MethodTwo.selection10();
				break;

			case 11:
				Module3MethodThree.selection11();
				break;

			case 12:
				Module3EscapeSequence.selection12();
				break;

			case 13:
				Module5RandomGenerator.selection13();
				break;

			case 14:
				Module5MathClass.selection14();
				break;

			case 15:
				Module6IfElse.selection15();
				break;

			case 16:
				Module6If.selection16();
				break;

			case 17:
				Module6Switch.selection17();
				break;

			case 18:
				Module6CompareString.selection18();
				break;

			case 19:
				Module6EqualsMethod.selection19();
				break;

			case 20:
				Module6Operators.selection20();
				break;

			case 21:
				Module7WhileLoop.selection21();
				break;

			case 22:
				Module7ForLoop.selection22();
				break;

			case 23:
				Module7DoWhileLoop.selection23();
				break;

			case 24:
				Module7BreakContinueLoop.selection24();
				break;

			case 25:
				Module8OOP.selection25();
				break;
			case 26:
				Module9Overloading.selection26();
				break;

			case 27:
				Module9Inheritance.selection27();
				break;

			case 28:
				Module9Polymorphism.selection28();
				break;

			case 29:
				Module9Super.selection29();
				break;

			case 30:
				Module9This object = new Module9This(10, 20);
				object.display();
				break;

			case 31:
				Module10Array1D.selection31();
				break;

			case 32:
				Module10EnhancedLoop.selection32();
				Module10EnhancedLoop.enhancedForLoop();
				break;

			case 33:
				Module10MultiDimensionalArray.selection33();
				break;

			default:
				System.out.println("Invalid selection");

			}
		} catch (Exception e) {
			System.out.println("Invalid Input ");
			System.out.println("Exception is: " + e);
		}
	}
}
