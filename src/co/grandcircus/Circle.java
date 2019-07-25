package co.grandcircus;

public class Circle {

	private double rad1;


	public Circle(double radius) {
		this.rad1 = radius;

	}

	public double getCircumference() {
		double circumference1 = 2 * Math.PI * rad1;
		return circumference1;
	}

	public double getArea() {
		double area1 = Math.PI * (Math.pow(rad1, 2));
		return area1;
	}

	private static String formatNumber(double x) {

		return String.format("%.2f", x);

	}

	public String getFormattedArea() {
		return "Area: " + formatNumber(getArea());
	}

	public String getFormattedCircumference() {
		return "Circumference: " + formatNumber(getCircumference());

	}

	}

