package assighnment;
/*
My name is Tanusree Debnath. This class is
CS F001A 02W Object-Oriented Programming Method Java. Date is 19th January, 2018.
My instructor is Dave Harden. 
File name is Foothill.java. This program prints my first name, my student ID, and few
arithmetic operations with my student id and the number of characters in my first name. 
.
*/

public class Foothill {
public static void main(String [] args){
	System.out.println("My first name is Tanusree");
	System.out.println("My Student ID is 20340718");
	System.out.println("The number of characters in my first name is 8");
	int myId = 20340718;
	int numLet = 8;
	int Result = myId % 17;
	System.out.println("");
	System.out.println("Expression #1 --> " + Result);
	int Result1 = (numLet + 17) % 11;
	System.out.println("");
	System.out.println("Expression #2 --> " + Result1);
	double R = numLet + 800;
	double Result2 = myId / R;
	System.out.println("");
	System.out.println("Expression #3 --> " + Result2);
	int Result3 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8;
	System.out.println("");
	System.out.println("Expression #4 --> " + Result3);
	double m = myId - 123456.;
	double n = (numLet + 20.) * (numLet + 20.);
	double p = 80 + (m / n);
	double Result4 = 15000. / p;
	System.out.println("");
	System.out.println("Expression #5 --> " + Result4);
	/*
	My first name is Tanusree
	My Student ID is 20340718
	The number of characters in my first name is 8
	
	Expression #1 --> 14
	
	Expression #2 --> 3
	
	Expression #3 --> 25174.15594059406
	
	Expression #4 --> 36
	
	Expression #5 --> 0.5798821714930515

	*/
}
}
