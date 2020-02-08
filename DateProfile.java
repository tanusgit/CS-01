package datepp;

public class DateProfile {

	// gender - a char, the gender of the applicant ('M' or 'F').
	char gender;

	// searchGender - a char, the gender of desired partner ('M' or 'F'). This is
	// not the gender of the applicant, but of the applicant's requested partner.
	char searchGender;
	// int romance-an int from 1 to 10, indicating the importance of romance to the
	// applicant.
	int romance = 0;

	// finance-an int from 1 to 10, indicating the importance of finance to the
	// applicant.
	int finance = 0;
	// name- a String indicating the full name of the applicant.
	String name = "";

	public static int MIN_ROMANCE = 1;
	public static int MIN_NAME_LEN = 2;
	public static char DEFAULT_GEND = 'M';
	public static char DEFAULT_SEARCH_GEND = 'F';
	public static String DEFAULT_NAME = "Unknown";

	public DateProfile(char g, char s, int r, int f, String n) {
		gender = g;
		searchGender = s;
		romance = r;
		finance = f;
		name = n;
	}

	public DateProfile() {
		setDefaults();

	}

	public char getGender() {
		return gender;
	}

	public char getSearchGender() {
		return searchGender;
	}

	public int getromance() {
		return romance;
	}

	public int getfinance() {
		return finance;
	}

	public String getName() {
		return name;
	}

	public void setGender(char g) {
		gender = g;
	}

	public void setSearchGender(char g) {
		searchGender = g;
	}

	public void setromance(int r) {
		if (r < 1 || r > 10) {
			System.out.println("invalid input. Please enter 1-10");
		}
		romance = r;
	}

	public void setfinance(int f) {
		if (f < 1 || f > 10) {
			System.out.println("invalid input. Please enter 1-10");
		}
		finance = f;
	}

	public void setName(String n) {
		if (n.length() < 2) {
			System.out.println("name cannot be less than 2 letters");
		}
		name = n;
	}

	// sets all five members to their default values.
	public void setDefaults() {
		gender = DEFAULT_GEND;
		searchGender = DEFAULT_SEARCH_GEND;
		romance = MIN_ROMANCE;
		finance = 0;
		name = DEFAULT_NAME;

	}

	/*
	 * double fitValue(DateProfile partner), which returns a number from 0.0 (very
	 * bad fit) to 1.0 (perfect fit). The public instance method compares the
	 * calling object (this) to the object passed as a parameter. This method should
	 * call three private methods determineGenderFit( ... ), determineRomanceFit(
	 * ... ) and determineFinanceFit( ... ), that will be used to return
	 * intermediate results for each of the three factors. It should compute the
	 * final fit value that it returns by returning a 0 if gender is not compatible
	 * (regaredless of the other values) and return the average of finance and
	 * romance values if gender is compatible
	 */
	public double fitValue(DateProfile partner) {
		double avg = 0.0;
		double g = determineGenderFit(partner);
		double r = determineRomanceFit(partner);
		double f = determineFinanceFit(partner);
		avg = (r + f) / 2;
		if (g == 0.0) {
			return 0.0;
		} else {
			return avg;
		}
	}

	/*
	 * double determineGenderFit(DateProfile partner) This private instance method
	 * returns either a 0 or 1 depending on the gender compatibility of the calling
	 * object and the passed parameter object. You have to compare gender
	 * compatibility completely: i.e., there must be mutual consent on this one! It
	 * is used by the public fitValue(), not directly by the client main().
	 */

	public double determineGenderFit(DateProfile partner) {
		if (this.searchGender == partner.gender) {
			return 1.0;
		} else {
			return 0.0;
		}
	}

	/*
	 * double determineRomanceFit(DateProfile partner) This private instance method
	 * returns a number from (but not including) 0.0 to (and including) 1.0
	 * depending on the romance compatibility of the calling object and the passed
	 * parameter object. The romance numbers should be highest (1.0) if the two
	 * values are equal (both 3, both 5, both 7) and lowest (perhaps a small
	 * non-zero value like .1) if their difference is 9. It is used by the public
	 * fitValue(), not directly by the client main().
	 */
	public double determineRomanceFit(DateProfile partner) {
		if (this.romance == partner.romance) {
			return 1.0;
		} else if (this.romance > partner.romance) {
			return .5;
		} else if (this.romance < partner.romance) {
			return .6;
		} else if (((this.romance) - (partner.romance)) == 9) {
			return .1;
		} else if (((partner.romance) - (this.romance)) == 9) {
			return .1;
		} else
			return 0;
	}

	/*
	 * double determineFinanceFit(DateProfile partner) This private instance method
	 * returns a number from (but not including) 0.0 to (and including) 1.0
	 * depending on the finance compatibility of the calling object and the passed
	 * parameter object. The finance numbers should be highest (1.0) if the two
	 * values are equal (both 3, both 5, both 7) and lowest (perhaps a small
	 * non-zero value like .1) if their difference is 9. It is used by the public
	 * fitValue(), not directly by the client main().
	 */

	public double determineFinanceFit(DateProfile partner) {
		if (this.finance == partner.finance) {
			return 1.0;
		} else if (this.finance > partner.finance) {
			return .5;
		} else if (this.finance < partner.finance) {
			return .6;
		} else if (((this.finance) - (partner.finance)) == 9) {
			return .1;
		} else if (((partner.finance) - (this.finance)) == 9) {
			return .1;
		} else
			return 0;

	}

	static void displayTwoProfiles(DateProfile profile1, DateProfile profile2) {
		double res = profile1.fitValue(profile2);
		System.out.println("Fit between " + 
		profile1.getName() + " and " + profile2.getName() + " : " + res);
		

	}
	
		public static void main(String[] args) {
			DateProfile nita = new DateProfile('F', 'M', 8, 6, "Nita");
			DateProfile Rahul = new DateProfile('M', 'F', 8, 6, "Rahul"); 
			displayTwoProfiles(nita, Rahul);
			//double res = nita.fitValue(Rahul);
			//System.out.println(res);

		}
	
}

