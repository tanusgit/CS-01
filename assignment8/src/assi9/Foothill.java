package assi9;
/*
My name is Tanusree Debnath. This class is
CS F001A 02W Object-Oriented Programming Method Java.
Date is 5th March, 2018.
My instructor is Dave Harden. 
File name is Foothill.java. This program has a class called DateProfile.
Each object of the DateProfile class represents an applicant's profile. This 
class has several member functions and public static constants. The DateProfile
computes the compatibility with another profile which is used to match
candidates.
*/

class DateProfile {
	private char gender;
	private char searchGender;
	private int romance;
	private int finance;  
	private String name;
	public static final int MIN_ROMANCE = 1;
	public static final int MIN_FINANCE = 1;
	public static final int MIN_NAME_LEN = 3;
	public static final int MAX_ROMANCE = 10;
	public static final int MAX_FINANCE = 10;
	public static final int MAX_NAME_LEN = 100;
	public static final char DEFAULT_GEND = 'M';
	public static final char DEFAULT_SEARCH_GEND = 'F';
	public static final int DEFAULT_ROMANCE = 8;
	public static final int DEFAULT_FINANCE = 3;
	public static final String DEFAULT_NAME = "Ashton William";

	DateProfile() {
		setDefaults();
	}

	DateProfile(char g, char s, int r, int f, String n) {
		setAll(g, s, r, f, n);
	}

	// Prints error message when invalid gender
	boolean setGender(char gdr) {
		if (gdr == 'M' || gdr == 'F') {
			gender = gdr;
			return true;
		}
		System.out.println(gdr + " rejected as gender");
		return false;
	}
	// Set the gender if either M or F and return true.
	// Prints error and returns false otherwise.
	boolean setSearchGender(char gdr) {
		if (gdr == 'M' || gdr == 'F') {
			searchGender = gdr;
			return true;
		}
		System.out.println(gdr + " rejected as search gender");
		return false;
	}

	// Set the romance factor when valid and return true.
	// Prints error and returns false otherwise.
	boolean setRomance(int r) {
		if (r >= MIN_ROMANCE && r <= MAX_ROMANCE ) {
			romance = r;
			return true;
		}
		System.out.println(r + " rejected as romance");
		return false;
	}

	// Set the finance factor when valid and return true.
	// Prints error and returns false otherwise.
	boolean setFinance(int f) {
		if (f >= MIN_FINANCE && f <= MAX_FINANCE) {
			finance = f;
			return true;
		}
		System.out.println(f + " rejected as finance");
		return false;
	}

	// Set the name when valid and return true.
	// Prints error and returns false otherwise.
	boolean setName(String n) {
		if (n.length() >= MIN_NAME_LEN && n.length() <= MAX_NAME_LEN) {
			name = n;
			return true;
		}
		System.out.println(n + " rejected as name");
		return false;
	}

	// Sets the fields of this class as per the argument.
	public void setAll(char g, char s, int r, int f, String n) {
		setGender(g);
		setSearchGender(s);
		setRomance(r);
		setFinance(f);
		setName(n);
	}

	//Sets all five members to their default values.
	public void setDefaults() {
		gender = DEFAULT_GEND;
		searchGender = DEFAULT_SEARCH_GEND;
		romance = MIN_ROMANCE;
		finance = MIN_FINANCE;
		name = DEFAULT_NAME;
	}

	char getGender() {
		return gender;
	}

	char getSearchGender() {
		return searchGender;
	}

	int getRomance() {
		return romance;
	}

	int getFinance() {
		return finance;
	}

	String getName() {
		return name;
	}

	// Calls three private methods determineGenderFit(),
	// determineRomanceFit() and determineFinanceFit() to determine fitness
	// of partner and returns average of finance and romance values if gender
	// is compatible.
	double fitValue(DateProfile partner) {
		double s = determineGenderFit(partner);
		if (s == 0)
			return 0;
		double p = determineRomanceFit(partner);
		double r = determineFinanceFit(partner);
		return (p+r)/2;
	}
	// Returns the gender compatibility of two applicants
	private double determineGenderFit(DateProfile partner) {
		if (searchGender == partner.getGender() &&
			gender == partner.getSearchGender())
			return 1;
		else return 0;
	}
	// Returns the romance compatibility of two applicants
	private double determineRomanceFit(DateProfile partner) {
		double difference = Math.abs(romance - partner.getRomance());
		// Normalizing to 1.
		return (1 - (difference / 9)  + 0.1)/1.1;
	}
	// Returns the finance compatibility of two applicants
	private double determineFinanceFit(DateProfile partner) {
		double difference = Math.abs(finance - partner.getFinance());
		// Normalizing to 1.
		return (1 - (difference / 9)  + 0.1)/1.1;
	}
}

public class Foothill {
	public static void main(String args[]) {
		// Test cases to find compatible matches. Compare with self to
		// validate the match to be either 0 or 1.
		DateProfile applicant1 = new DateProfile('F', 'M', 2, 7, "Sarah S");
		DateProfile applicant2 = new DateProfile('M', 'F', 4, 8, "Bob B");
		DateProfile applicant3 = new DateProfile('M', 'M', 8, 3, "Neil N");
		DateProfile applicant4 = new DateProfile('F', 'F', 9, 1, "Rosy R");
		displayTwoProfiles(applicant1, applicant1);
		displayTwoProfiles(applicant1, applicant2);
		displayTwoProfiles(applicant1, applicant3);
		displayTwoProfiles(applicant1, applicant4);
		displayTwoProfiles(applicant2, applicant1);
		displayTwoProfiles(applicant2, applicant2);
		displayTwoProfiles(applicant2, applicant3);
		displayTwoProfiles(applicant2, applicant4);
		displayTwoProfiles(applicant3, applicant1);
		displayTwoProfiles(applicant3, applicant2);
		displayTwoProfiles(applicant3, applicant3);
		displayTwoProfiles(applicant3, applicant4);
		displayTwoProfiles(applicant4, applicant1);
		displayTwoProfiles(applicant4, applicant2);
		displayTwoProfiles(applicant4, applicant3);
		displayTwoProfiles(applicant4, applicant4);
		DateProfile applicant5 = new DateProfile('Q', 'F', 9, 1, "Rosy R");
		DateProfile applicant6 = new DateProfile('M', 'A', 9, 1, "Rosy R");
		DateProfile applicant7 = new DateProfile('M', 'F', 100, 1, "Rosy R");
		DateProfile applicant8 = new DateProfile('F', 'F', 9, 50, "Rosy R");
		DateProfile applicant9 = new DateProfile('F', 'F', 9, 10, "Ro");
	}

	// Display the match between two profiles by calling fitValue.
	static void displayTwoProfiles(DateProfile profile1, DateProfile profile2) {
		double f = profile1.fitValue(profile2);
		System.out.println("Fit between " + profile1.getName() + " and "
							+ profile2.getName() + ": " + f);
	}
}

/*
Fit between Sarah S and Sarah S: 0.0
Fit between Sarah S and Bob B: 0.8484848484848484
Fit between Sarah S and Neil N: 0.0
Fit between Sarah S and Rosy R: 0.0
Fit between Bob B and Sarah S: 0.8484848484848484
Fit between Bob B and Bob B: 0.0
Fit between Bob B and Neil N: 0.0
Fit between Bob B and Rosy R: 0.0
Fit between Neil N and Sarah S: 0.0
Fit between Neil N and Bob B: 0.0
Fit between Neil N and Neil N: 1.0
Fit between Neil N and Rosy R: 0.0
Fit between Rosy R and Sarah S: 0.0
Fit between Rosy R and Bob B: 0.0
Fit between Rosy R and Neil N: 0.0
Fit between Rosy R and Rosy R: 1.0
Q rejected as gender
A rejected as search gender
100 rejected as romance
50 rejected as finance
Ro rejected as name
*/
