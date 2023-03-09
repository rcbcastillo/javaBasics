package results_pkg;

import java.text.DecimalFormat;

public class Results {

	private static final DecimalFormat df = new DecimalFormat("0.00");

	static void totalMark(double Physics, double Chemistry, double Biology) {

		double total = Physics + Chemistry + Biology;

		if (total <= 450) {
			System.out.println("Physics' score: " + Physics);
			System.out.println("Chemistry' score: " + Chemistry);
			System.out.println("Biology score: " + Biology);
			System.out.println("Total score: " + total);

		} else {
			System.out.println("Total mark must be <= 450. Check your input!");

		}

	}

	static void percentage(double Physics, double Chemistry, double Biology) {
		double total = Physics + Chemistry + Biology;

		if (total <= 450) {
			double physicsPercentage = (Physics / 450.0) * 100;
			double chemistryPercentage = (Chemistry / 450.0) * 100;
			double biologyPercentage = (Biology / 450.0) * 100;
			System.out.println("Physics (%): " + df.format(physicsPercentage));
			System.out.println("Chemistry (%): " + df.format(chemistryPercentage));
			System.out.println("Biology (%): " + df.format(biologyPercentage));

		}
	}

	public static void main(String[] args) {
		totalMark(100, 50, 250);
		percentage(100, 50, 250);
	}

}
