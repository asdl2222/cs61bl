public class Measurement {
	int myFeet;
	int myInches;

	/**
	 * Constructor: initialize this object to be a measurement of 0 feet, 0
	 * inches
	 */
	public Measurement() {
		myFeet = 0;
		myInches = 0;
	}

	/**
	 * Constructor: takes a number of feet as its single argument, using 0 as
	 * the number of inches
	 */
	public Measurement(int feet) {
		myFeet = feet;
		myInches = 0;
	}

	/**
	 * Constructor: takes the number of feet in the measurement and the number
	 * of inches as arguments (in that order), and does the appropriate
	 * initialization
	 */
	public Measurement(int feet, int inches) {
		myFeet = feet;
		myInches = inches;
	}

	/**
	 * Returns the number of feet in in this Measurement. For example, if the
	 * Measurement has 1 foot and 6 inches, this method should return 1.
	 */
	public int getFeet() {
		return myFeet; // provided to allow the file to compile
	}

	/**
	 * Returns the number of inches in this Measurement. For example, if the
	 * Measurement has 1 foot and 6 inches, this method should return 6.
	 */
	public int getInches() {
		return myInches; // provided to allow the file to compile
	}

	/** Adds the argument m2 to the current measurement */
	public Measurement plus(Measurement m2) {
		int result_feet = this.getFeet() + m2.getFeet();
		int result_Inches = this.getInches() + m2.getInches();
		if (result_Inches > 12){
			result_Inches -= 12;
			result_feet++;
		}
		return new Measurement(result_feet,result_Inches);
	}

	/**
	 * Subtracts the argument m2 from the current measurement. You may assume
	 * that m2 will always be smaller than the current measurement.
	 */
	public Measurement minus(Measurement m2) {
		int result_feet = this.getFeet() - m2.getFeet();
		int result_Inches = this.getInches() - m2.getInches();
		if (result_Inches < 0){
			result_Inches += 12;
			result_feet--;
		}
		return new Measurement(result_feet,result_Inches);
	}

	/**
	 * Takes a nonnegative integer argument n, and returns a new object that
	 * represents the result of multiplying this object's measurement by n. For
	 * example, if this object represents a measurement of 7 inches, multiple
	 * (3) should return an object that represents 1 foot, 9 inches.
	 */
	public Measurement multiple(int multipleAmount) {
		int result_feet = this.getFeet() * multipleAmount;
		int result_Inches = this.getInches() * multipleAmount;
		if (result_Inches > 12){
			result_feet += (int)(result_Inches / 12);
			result_Inches = result_Inches % 12;
		}
		return new Measurement(result_feet,result_Inches);
	}

	/**
	 * toString should return the String representation of this object in the
	 * form f'i" that is, a number of feet followed by a single quote followed
	 * by a number of inches less than 12 followed by a double quote (with no
	 * blanks).
	 */
	@Override
	public String toString() {
		return new String(this.getFeet() + "\'" + this.getInches() + "\"");
	}

}
