package linklist;
import java.nio.charset.Charset;
import java.util.Scanner;


public class StringOperation {
	final int minimum = 4;
	Scanner m = new Scanner(System.in);
	
public char getKeyCharacter() {
	String c;
	while(true) {
		System.out.print("Please enter a single character ");
		c = m.nextLine();
		int l = c.length();
		if(l == 1)
			break;
			}
	char res = c.charAt(0);
	return res;
	}

public String getString() {
	String c;
	while(true) {
		System.out.print("Please enter a string having atleast 4 charcters ");
		c = m.nextLine();
		int l = c.length();
		if(l >= 4)
			break;
		}
	return c;
	}

//change all the occurrence of c in s with $ sign
public String maskCharacter(String s, char c) {
	String res = " ";
	for(int i = 0; i < s.length(); i++) {
		char m = s.charAt(i);
			if(m == c) {
				m = '$';
		}
			res = res + m;
	}
	System.out.println("string with " + c + " masked:");
	return res;
}

//This method will take both a string and a character as parameters and return a new
//string that has each occurrence of the key character removed, but all other 
//characters left intact.
public String removeCharacter(String s, char c) {
	String res = " ";
	for(int i = 0; i < s.length(); i++) {
		char m = s.charAt(i);
			if(m == c) {
				m = ' ';
		}
			res = res + m;
	}
	System.out.println("string with " + c + " removed:");
	return res;
}
 
//This method will take both a string and a character as parameters, 
//and return the number of key characters that appear in the string (case sensitive).  
public int countKey(String s, char c) {
	int count = 0;
	for(int i = 0; i < s.length(); i++) {
		char m = s.charAt(i);
			if(m == c) {
				count++;
			}
	}
	System.out.println("number of " + c + " in the string is ");
	return count;
}

}
