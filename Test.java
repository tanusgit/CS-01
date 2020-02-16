package s;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("Rahul", "Kumar", 56);
		Student s2 = new Student("Nil", "Ratan", 66);
		Student s3 = new Student("deb", "piya", 67);
		Student s4 = new Student("kumari", "Riya", 4);
		Student s5 = new Student("kumari", "Riya", 5);
		Student s6 = new Student("kumari", "Riya", 6);
		Student array[] = new Student[6];
		array[0] = s1;
		array[1] = s2;
		array[2] = s3;
		array[3] = s4;
		array[4] = s5;
		array[5] = s6;
		
		System.out.println(StudentArrayUtilities.getMedianDestructive(array));
		//StudentArrayUtilities.arraySort(array);
		
	}

}
