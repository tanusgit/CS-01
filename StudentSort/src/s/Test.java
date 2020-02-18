package s;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*Student s1 = new Student("Rahul", "Kumar", 56);
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
		System.out.println("before sorting:  ");
		Student.display(array);
		//System.out.println("after sorting:   ");
		StudentArrayUtilities.arraySort(array);
		//StudentArrayUtilities.toString("after sort", array);
		System.out.println(StudentArrayUtilities.toString("after sort", 
				   array));
		//Student.display(array);
		
		
		System.out.println(StudentArrayUtilities.getMedianDestructive(array));*/
		//StudentArrayUtilities.arraySort(array);
	
		Test.show(2);
		
	}
	
	public static void show(int num) {
		Scanner m = new Scanner(System.in);
		for(int i = 0; i < num ; i++) {
		System.out.println("print age....");
		String input = m.nextLine();
		System.out.println("print name....");
		String input1 = m.nextLine();
		System.out.println("print state....");
		String input2 = m.nextLine();
		}
		
		
	}

}
