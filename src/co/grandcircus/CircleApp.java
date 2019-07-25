package co.grandcircus;

//Chris Ciric
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		double radius = 0.0;
		Scanner scan = new Scanner(System.in);
		boolean check = false;
		int circleBuilt = 0;

		// start of while loop
		while (!check) {
		System.out.println("Welcome to the Circle Tester");
		System.out.println("Enter Radius: ");
			radius = scan.nextDouble();
			if (radius <= 0) {
				System.out.println("Invalid entry try entering another number");

				check = false;
			} else if (radius > 0) {
				Circle circ = new Circle(radius);
		System.out.println(circ.getFormattedCircumference());
		System.out.println(circ.getFormattedArea());
				circleBuilt++;

				// continue validation start
				if (getString(scan, "Continue? y/n")) {
					check = false;
				} else {
				check = true;
				}
			} // continue validation end

			else {
				System.out.println("Invalid entry, try entering another number");
				check = false;
			}


		} // end of while loop
		System.out.println("");
		System.out.println("Circles Built: " + circleBuilt);
		System.out.println("see ya!");

	}

	public static boolean getString(Scanner sc, String prompt) {
		boolean isValid = false;
		boolean isValid2 = false;
		String s = "";
		while (isValid == false) {
			System.out.print(prompt);
			s = sc.next(); // read user entry, if you type a sentence, it will return only the first word
			if (s.equalsIgnoreCase("n")) {
				isValid2 = false;
				isValid = true;
			} else if (s.equalsIgnoreCase("y")) {
				isValid2 = true;
				isValid = true;
			} else {
				System.out.println("please try again");
				isValid = false;
			}
			// sc.nextLine(); // discard any other data entered on the line
		}
		return isValid2;
	}

}
