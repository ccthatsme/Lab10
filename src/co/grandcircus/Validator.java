package co.grandcircus;

import java.util.Scanner;

// this is a concrete class that can be used over and over again
// you can also add your own validation methods here
public class Validator {
	public static String getString(Scanner sc, String prompt) {
		boolean isValid = false;
		String s = "";
		while (isValid == false) {
		System.out.print(prompt);
			s = sc.next(); // read user entry, if you type a sentence, it will return only the first word
			if (s.equalsIgnoreCase("n")) {
				s = "n";
			} else if (s.equalsIgnoreCase("y")) {
				s = "y";
			} else {
				System.out.println("please try again type (y/n)");
				s = sc.next();
				isValid = false;
			}
			// sc.nextLine(); // discard any other data entered on the line
		}
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	// example of overloading
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}

	public static String getStringMatchingRegex(Scanner sc, String prompt, String regex) {
		boolean isValid = false;

		String input;

		do {
			input = getString(sc, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");

			}

		} while (!isValid);

		return input;
	}

}
