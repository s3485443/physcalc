package physicsCalc;

import java.util.Scanner;

/**
 * This class handles the submenu, calculations and mechanics of the program The
 * bulk of the program is contained in this file
 * 
 * @author Andrew
 * @see PhysicsCalculator
 */
public class Calculation extends PhysicsCalculator {
	// this contains the formulas that need to be read.
	/**
	 * This contains all the formulas This is static because it will be used
	 * multiple times, and should under no circumstances should be modified.
	 */
	static String[] formulas = { "V=U+AT", "V^2=U^2+2AX", "V=X/T", "A=(V-U)/T",
			"A=(V^2-U^2)/2X", "X=VT", "X=UT+1/2AT^2", "T=X/V", "T^2=2X/A",
			"U=V-AT", "U^2=V^2-2AX" };

	/**
	 * This handles the submenu for velocity calculations
	 */
	public void calculateVelocity() {
		 // Display the formulas The number of matching formulas cannot ever
		 // exceed the number of total formula, so this is safe
		 //
		String[] formulae = new String[formulas.length];
		int numFormFound = 0;
		for (int i = 0; i < formulas.length; i++) {
			// Read and interpret the formulas
			if (formulas[i].contains("V=") || formulas[i].contains("V^2=")) {

				formulae[numFormFound] = formulas[i];
				// FOund one, add it to the total, so that we do not over-write
				// correct formulas
				numFormFound++;
			}

		}
		for (int y = 0; y < formulae.length; y++) {
			if (formulae[y] != null) {
				// print it out with the correct formatting
				System.out.printf("(%d) %s \n", (y + 1), formulae[y]);
			}
		}
		System.out.println("Which Formula would you like to use?");
		Scanner scan = new Scanner(System.in);

		int input = 0;
		if (scan.hasNextInt()) {
			input = scan.nextInt();
		}
		switch (input) {
		case 1:
			velocity_1();
			break;

		case 2:
			velocity_2();
			break;
		default:
			break;

		}

		scan.close();
	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void velocity_1() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;

		initVelocity = getDouble("u", initVelocity);
		time = getDouble("t", time);
		acceleration = getDouble("a", acceleration);

		System.out.printf("Result is %.2f\n", (initVelocity + acceleration
				* time));

	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void velocity_2() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;
		double displacement = 0;
		// V^2=U^+2ax

		initVelocity = getDouble("u", initVelocity);
		acceleration = getDouble("a", acceleration);
		displacement = getDouble("x", displacement);

		System.out.printf(
				"Result is %.2f\n",
				(java.lang.Math.sqrt(Math.pow(initVelocity, 2) + 2
						* acceleration * displacement)));

	}

	/**
	 * 
	 * @param variableName
	 *            Takes the variable name so it prints out the correct prompt
	 *            for the user
	 * @param value
	 *            Takes the double and assigns it with a value
	 * @return returns the value back to the previous function so the
	 *         appropriate function can run the calculation
	 */
	private double getDouble(String variableName, double value) {
		Scanner scanValue = new Scanner(System.in);

		System.out.printf("%s = ", variableName);

		value = Double.parseDouble(scanValue.next());
		return value;
	}

	// public void toFind(ToFindEnum t) {
	//
	// }
	/**
	 * This handles the submenu for acceleration calculations
	 */
	public void calculateAcceleration() {
		// Display the formulas

		System.out.println("Possible formulas are:");
		String[] formulae = new String[formulas.length];
		int numFormFound = 0;
		for (int i = 0; i < formulas.length; i++) {
			if (formulas[i].contains("A=") || formulas[i].contains("A^2=")) {

				formulae[numFormFound] = formulas[i];
				numFormFound++;
			}

		}
		for (int y = 0; y < formulae.length; y++) {
			if (formulae[y] != null) {
				System.out.printf("(%d) %s \n", (y + 1), formulae[y]);
			}
		}
		System.out.println("Which Formula would you like to use?");
		Scanner scan = new Scanner(System.in);

		int input = 0;
		if (scan.hasNextInt()) {
			input = scan.nextInt();
		}
		switch (input) {
		case 1:
			acceleration_1();
			break;

		case 2:
			acceleration_2();
			break;
		default:
			break;

		}

		scan.close();
	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void acceleration_1() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;

		velocity = getDouble("v", velocity);
		initVelocity = getDouble("u", initVelocity);
		time = getDouble("t", time);

		System.out.printf("Result is %.2f\n",
				((velocity - initVelocity) / time));

	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void acceleration_2() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;
		double displacement = 0;
		velocity = getDouble("v", velocity);
		initVelocity = getDouble("u", initVelocity);
		displacement = getDouble("x", displacement);

		System.out
				.printf("Result is %.2f\n",
						((Math.pow(velocity, 2) - Math.pow(initVelocity, 2)) / (2 * displacement)));

	}

	public void calculateDisplacement() {
		// Display the formulas

		System.out.println("Possible formulas are:");
		String[] formulae = new String[formulas.length];
		int numFormFound = 0;
		for (int i = 0; i < formulas.length; i++) {
			if (formulas[i].contains("X=") || formulas[i].contains("X^2=")) {

				formulae[numFormFound] = formulas[i];
				numFormFound++;
			}

		}
		for (int y = 0; y < formulae.length; y++) {
			if (formulae[y] != null) {
				System.out.printf("(%d) %s \n", (y + 1), formulae[y]);
			}
		}
		Scanner scan = new Scanner(System.in);

		int input = 0;
		if (scan.hasNextInt()) {
			input = scan.nextInt();
		}
		switch (input) {
		case 1:
			displacement_1();
			break;

		case 2:
			displacement_2();
			break;
		default:
			break;

		}

	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void displacement_1() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;

		velocity = getDouble("v", velocity);
		time = getDouble("t", time);

		System.out.printf("Result is %.2f\n", (velocity * time));

	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void displacement_2() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;
		double displacement = 0;

		initVelocity = getDouble("u", initVelocity);
		time = getDouble("t", time);
		acceleration = getDouble("a", acceleration);

		System.out
				.printf("Result is %.2f\n",
						(initVelocity * time + 0.5 * (acceleration * Math.pow(
								time, 2))));

	}

	/**
	 * This handles the submenu for time calculations
	 */
	public void calculateTime() {
		// Display the formulas

		System.out.println("Possible formulas are:");
		String[] formulae = new String[formulas.length];
		int numFormFound = 0;
		for (int i = 0; i < formulas.length; i++) {
			if (formulas[i].contains("T=") || formulas[i].contains("T^2=")) {

				formulae[numFormFound] = formulas[i];
				numFormFound++;
			}

		}
		for (int y = 0; y < formulae.length; y++) {
			if (formulae[y] != null) {
				System.out.printf("(%d) %s \n", (y + 1), formulae[y]);
			}
		}
		System.out.println("Which Formula would you like to use?");
		Scanner scan = new Scanner(System.in);

		int input = 0;
		if (scan.hasNextInt()) {
			input = scan.nextInt();
		}
		switch (input) {
		case 1:
			time_1();
			break;

		case 2:
			time_2();
			break;
		default:
			break;

		}

	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void time_1() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;
		double displacement = 0;

		velocity = getDouble("v", velocity);
		displacement = getDouble("x", displacement);

		System.out.printf("Result is %.2f\n", (displacement / velocity));

	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void time_2() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;
		double displacement = 0;

		acceleration = getDouble("a", acceleration);
		displacement = getDouble("x", displacement);

		System.out.printf("Result is %.2f\n",
				(java.lang.Math.sqrt((2 * displacement) / acceleration)));

	}

	/**
	 * This handles the submenu for initial velocity calculations
	 */
	public void calculateInitVelocity() {
		// Display the formulas

		// The number of matching formulas cannot ever exceed the number of
		// total formula, so this is safe
		String[] formulae = new String[formulas.length];
		int numFormFound = 0;
		for (int i = 0; i < formulas.length; i++) {
			// Read and interpret the formulas
			if (formulas[i].contains("U=") || formulas[i].contains("U^2=")) {

				formulae[numFormFound] = formulas[i];
				// FOund one, add it to the total, so that we do not over-write
				// correct formulas
				numFormFound++;
			}

		}
		
		for (int y = 0; y < formulae.length; y++) {
			if (formulae[y] != null) {
				// print it out with the correct formatting
				System.out.printf("(%d) %s \n", (y + 1), formulae[y]);
			}
		}
		System.out.println("Which Formula would you like to use?");
		Scanner scan = new Scanner(System.in);

		int input = 0;
		if (scan.hasNextInt()) {
			input = scan.nextInt();
		}
		switch (input) {
		case 1:
			initVelocity_1();
			break;

		case 2:
			initVelocity_2();
			break;
		default:
			break;

		}

		scan.close();
	}

	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void initVelocity_1() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;

		velocity = getDouble("v", velocity);
		time = getDouble("t", time);
		acceleration = getDouble("a", acceleration);

		System.out.printf("Result is %.2f\n", (velocity - acceleration * time));

	}

	// "U=V-AT", "U^2=V^2-2AX"
	/**
	 * Calculation subfunction Runs calculations and handles variable input
	 */
	private void initVelocity_2() {
		double velocity = 0;
		double initVelocity = 0;
		double time = 0;
		double acceleration = 0;
		double displacement = 0;
		// V^2=U^+2ax

		velocity = getDouble("v", velocity);
		acceleration = getDouble("a", acceleration);
		displacement = getDouble("x", displacement);

		System.out.printf(
				"Result is %.2f\n",
				(java.lang.Math.sqrt(Math.pow(velocity, 2) - 2 * acceleration
						* displacement)));

	}

	/**
	 * This handles the submenu for searching Note that this does not actually
	 * link to any formulas It only returns matches.
	 * 
	 * Additionally it only recognizes upper case characters due to oddities
	 */
	public void search() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Formula contains:");
		String userInput = sc.nextLine();
		String userInputUpper = userInput;
		userInputUpper.toUpperCase();

		String[] formulae = new String[formulas.length];
		int numFormFound = 0;

		for (int i = 0; i < formulas.length; i++) {
			// Read and interpret the formulas
			if (formulas[i].contains(userInput)
					|| formulas[i].contains(userInputUpper)) {

				formulae[numFormFound] = formulas[i];
				// FOund one, add it to the total, so that we do not over-write
				// correct formulas
				numFormFound++;
			}

		}
		for (int y = 0; y < formulae.length; y++) {
			if (formulae[y] != null) {
				// print it out with the correct formatting
				System.out.printf("(%d) %s \n", (y + 1), formulae[y]);

			}
		}

	}
}
