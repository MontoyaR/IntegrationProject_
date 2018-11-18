import java.util.Scanner;

public class IntegrationProject {
		
	public static void main(String[] args) {
		
		module1Greetings.selection0();
			
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
        System.out.println("\t 21. 1-Dimensional Array");
        
        
        
        int selection;
        
        Scanner scan = new Scanner(System.in);
        
        selection = scan.nextInt();
        
        scan.close();
                
        switch (selection) {
          case 1:
        	  module2List.selection1();          
        	  break;
            
          case 2:
        	  module2Integer.selection2();       
        	  break;
            
          case 3:
        	  module2Double.selection3();
        	  break;
            
          case 4:
        	  module2String.selection4(); 
        	  break;
            
          case 5:
        	  module2Boolean.selection5(); 
        	  break;
            
          case 6:
        	  module2Definition.selection6(); 
        	  break;
            
          case 7:
        	  module2Final.selection7(); 
        	  break;
            
          case 8:
        	  module3Casting.selection8(); 
        	  break;
            
          case 9:
        	  module3MethodOne.selection9(); 
        	  break;
            
          case 10:
        	  module3MethodTwo.selection10(); 
        	  break;
            
          case 11:
        	  module3MethodThree.selection11(); 
        	  break;
            
          case 12:
        	  module3EscapeSequence.selection12();	
        	  break;
            
          case 13:
              module5RandomGenerator.selection13(); 
              break;
            
          case 14:
        	  module5MathClass.selection14(); 
        	  break;
            
          case 15:
        	  module6IfElse.selection15(); 
        	  break;
            
          case 16:
        	  module6If.selection16();
        	  break;
            
          case 17:
        	  module6Switch.selection17();
        	  break;
            
          case 18:
        	  module6CompareString.selection18(); 
        	  break;
           
          case 19:
        	  module6EqualsMethod.selection19();
        	  break;  
          
          case 20:
        	  module6Operators.selection20();  
        	  break;
          
//          case 21:
//        	  module10Array1D(value).selection21;
//        	  break;
        	             
          default:
            System.out.println("Invalid selection");
            
        }

	}

}
