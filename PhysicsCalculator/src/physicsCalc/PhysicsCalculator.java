package physicsCalc;

import java.util.*;
/**
 * Menu function is contained within this class
 * Asks the user what variable they wish to find/search for

 * @author Andrew
 *@see Calculation
 */
public class PhysicsCalculator {

	public enum ToFindEnum {
		UNDEFINED, VELOCITY, INITIAL_VELOCITY, TIME, DISPLACEMENT, ACCELERATION, SEARCH
	}
	/**
	 * Menu function
	 * @see PhysicsCalculator
	 * @see Calculation
	 * 
	 * @param args take in user arguments (Not implemented)
	 */
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the physics formula calculator");

		ToFindEnum toFind = ToFindEnum.UNDEFINED;

		String userInput;
		// Figure out what they need to find
		//Search is currently unimplemented. This will change
		System.out
				.println("What Variable would you like to find, V, U, A, X or T? Alternatively type S to search");
		Calculation calc = new Calculation();
		while (toFind == ToFindEnum.UNDEFINED) {
			userInput = sc.nextLine();
			userInput.toLowerCase();
		
			switch (userInput) {
			case "v":
				toFind = ToFindEnum.VELOCITY;
			
				calc.calculateVelocity();

				break;

			case "u":calc.calculateInitVelocity();
				toFind = ToFindEnum.INITIAL_VELOCITY;
				break;

			case "a":
				calc.calculateAcceleration();
				toFind = ToFindEnum.ACCELERATION;
				break;

			case "x":
				calc.calculateDisplacement();
				toFind = ToFindEnum.DISPLACEMENT;
				break;

			case "t":
				calc.calculateTime();
				toFind = ToFindEnum.TIME;
				break;
				
			case "s":
			calc.search();
				toFind = ToFindEnum.SEARCH;
				break;
				

			default:
				System.out.println("Undefined Variable");
			}
			

		}

		// Figure out what they have

		// Link to a formula

		// print it or the result

	}

}
