package s;

import javax.swing.*;

public class Student {

	public static int SORT_BY_FIRST = 88;
	public static int SORT_BY_LAST = 98;
	public static int SORT_BY_POINTS = 108;
	private String lastName;
	private String firstName;
	private int totalPoints;

	public static final String DEFAULT_NAME = "zz-error";
	public static final int DEFAULT_POINTS = 0;
	public static final int MAX_POINTS = 1000;
	/*
	 * this will always have one of the three constants above as its value. Make
	 * sure it initially has SORT_BY_LAST in it, but after the client changes it, it
	 * could be any of the above constants
	 */
	private int sortKey = SORT_BY_LAST;

	// -- a mutator for the member sortKey.
	boolean setSortKey(int key) {
		return sortKey == key;
	}

	// -- an accessor for sortKey.
	public int getSortKey() {
		return sortKey;

	}
	public Student() {
		
	}

	// constructor requires parameters - no default supplied
	public Student(String last, String first, int points) {
		if (!setLastName(last))
			lastName = DEFAULT_NAME;
		if (!setFirstName(first))
			firstName = DEFAULT_NAME;
		if (!setPoints(points))
			totalPoints = DEFAULT_POINTS;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public boolean setLastName(String last) {
		if (!validString(last))
			return false;
		lastName = last;
		return true;
	}

	public boolean setFirstName(String first) {
		if (!validString(first))
			return false;
		firstName = first;
		return true;
	}

	public boolean setPoints(int pts) {
		if (!validPoints(pts))
			return false;
		totalPoints = pts;
		return true;
	}

	// could be an instance method and, if so, would take one parameter
	/*
	 * compareTwoStudents( ... ) -- same signatures as in the modules, but now this
	 * method has to look at the sortKey and compare the two Students based on the
	 * currently active sortKey. A switch statement with three different expressions
	 * is all you need, and each expression will be very similar to the one already
	 * in the modules (in fact one will be identical). As you saw in the modules, it
	 * needs to return an int, which is positive, if the first student is greater
	 * than the second, negative if less than, and zero if they are the same, based
	 * on the current value of sortKey, of course.
	 * 
	 * 
	 * SORT_BY_POINTS
	 */

	public static int compareTwoStudents(Student fir, Student sec) {
		int result;
		if (fir.SORT_BY_FIRST > sec.SORT_BY_FIRST) {
			return 1;
		} else if (fir.SORT_BY_FIRST < sec.SORT_BY_FIRST) {
			return -1;
		} else if (fir.SORT_BY_FIRST == sec.SORT_BY_FIRST) {
			return 0;
		} else if (fir.SORT_BY_LAST > sec.SORT_BY_LAST) {
			return 1;
		} else if (fir.SORT_BY_LAST < sec.SORT_BY_LAST) {
			return -1;
		} else if (fir.SORT_BY_LAST == sec.SORT_BY_LAST) {
			return 0;
		} else if (fir.SORT_BY_POINTS > sec.SORT_BY_POINTS) {
			return 1;
		} else if (fir.SORT_BY_POINTS < sec.SORT_BY_POINTS) {
			return -1;
		} else if (fir.SORT_BY_POINTS == sec.SORT_BY_POINTS) {
			return 0;
		} else
			return 0;

		// this particular version based on last name only (case insensitive)
		// result = fir.lastName.compareToIgnoreCase(sec.lastName);

		// return result;
	}

	public String toString() {
		String resultString;

		resultString = " " + lastName + ", " + firstName + " points: " + totalPoints + "\n";
		return resultString;
	}

	private static boolean validString(String testStr) {
		if (testStr != null && testStr.length() > 0 && Character.isLetter(testStr.charAt(0)))
			return true;
		return false;
	}

	private static boolean validPoints(int testPoints) {
		if (testPoints >= 0 && testPoints <= MAX_POINTS)
			return true;
		return false;
	}
}


