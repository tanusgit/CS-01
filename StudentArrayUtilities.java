package s;

import javax.swing.JOptionPane;
/*
 * 


 Special Note:  This method has to do the following.  It must sort 
 the array according to totalPoints in order to get the medians, 
 and that's easy since we already have the sort method.  Then it 
 has to find the middle-student's score (e.g., if the array is size 21,
 the middle element is the score in array[10], after the sort). 
  But, before doing the sort, it also has to change the sortKey 
   of the Student class to SORT_BY_POINTS.  One detail, that you 
 may not have thought of, is that, at the very start of the method, 
it needs to save the client's sort key.  Then, before returning, 
 restore the client's sort key.  This method doesn't know what that
 sort key might be, but there is an accessor getSortKey() that will
 answer that question.
This method has the word "Destructive" in its name to remind the 
client that it may (and usually will) modify the order of the array,
 since it is going to sort the array by total points in the process 
 of computing the median.  However, it will not destroy or modify the 
 client's sortKey when the method returns to client (see previous bullet).

 */

class StudentArrayUtilities {
	// print the array with string as a title for the message box
	// this is somewhat controversial - we may or may not want an I/O
	// methods in this class. we'll accept it today
	
	/*
	 * Replace printArray() with toString().  Generate the same kind of String, 
but instead of sending it to the screen, return it to the client.

	 */
	public static String toString(String title, Student[] data) {
		String output = "";

		// build the output string from the individual Students:
		for (int k = 0; k < data.length; k++) {
			output += " " + data[k].toString();
			}

		// now put it in a JOptionPane
		//JOptionPane.showMessageDialog(null, output, title, JOptionPane.OK_OPTION);
		return output;
	}
	
/*Add a public static method double getMedianDestructive(Student[] array) - 
This computes and returns the median of the total scores of all the 
students in the array  The details are simple, but you have to take them each
carefully:
Dispose of the cases of an empty array (0 elements) and one-element array. 
Empty arrays return 0.0, always, and one-element array returns its one and 
only Student's totalPoints.  (This second case can actually be skipped if 
you handle the next cases correctly, but it doesn't hurt to do it separately,
here.

Even-numbered arrays >= 2 elements:  find the two middle elements and return
their average of their total points.
Odd-numbered arrays >= 3 elements:  return the total points of the exact
middle element.
  )*/
	public static double getMedianDestructive(Student[] array) {
		Student s = new Student();
		s.setSortKey(Student.SORT_BY_POINTS);
		arraySort(array);
		boolean even = (((array.length)%2) == 0);
		
		if(array.length == 0) {
			return 0.0;
		}
		else if(array.length == 1) {
			return array[0].getTotalPoints();
		}
		else if(even) {
			if(array.length == 2) {
				return (array[0].getTotalPoints()+ array[1].getTotalPoints())/2;
			}
			else {
			int middle1 = (array.length)/2;
			int middle2 = middle1-1;
			double mid = ((array[middle1].getTotalPoints()+ array[middle2].getTotalPoints())/2);
			return mid;
			}
		}
		else if(!even) {
			int mid = ((array.length)/2)+1;
			return array[mid].getTotalPoints();
		}
		else {
		return 0.0;
		}
		
	}

	// returns true if a modification was made to the array
	private static boolean floatLargestToTop(Student[] data, int top) {
		boolean changed = false;
		Student temp;

		// compare with client call to see where the loop stops
		for (int k = 0; k < top; k++)
			if (Student.compareTwoStudents(data[k], data[k + 1]) > 0) {
				temp = data[k];
				data[k] = data[k + 1];
				data[k + 1] = temp;
				changed = true;
			}
		return changed;
	}

	// public callable arraySort() - assumes Student class has a compareTo()
	public static void arraySort(Student[] array) {
		for (int k = 0; k < array.length; k++)
			// compare with method def to see where inner loop stops
			if (!floatLargestToTop(array, array.length - 1 - k))
				
				return;
		
	}

	
}
