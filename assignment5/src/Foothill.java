import java.util.Scanner;
/*
My name is Tanusree Debnath. This class is
CS F001A 02W Object-Oriented Programming Method Java.
Date is 12 February, 2018.
My instructor is Dave Harden. 
File name is Foothill.java. This program asks 
the user to enter both a key character 
and a target string (phrase, sentence, etc.).
Then, show the user three things::
The target string with the key character replaced by dollar-signs.
The target string with the key character removed.
The number of occurrences of the key character (case sensitive)
 in the target string.

*/
public class Foothill {
	private static final int lower = 4;
	private static final int upper = 500;
	private static char getKeyCharacter(){
		Scanner m = new Scanner(System.in);
		while(true){
			System.out.println("Please enter a single character"
								+ " to act as key: ");
			String getInput = m.nextLine();
			if (getInput.length() != 1)
				continue;
			char c = getInput.charAt(0);
			return c;
		}
	}

	private static String getString(){
		Scanner l = new Scanner(System.in);
		while(true){
			System.out.println("Please enter a phrase or"
								+ " sentence >= " + lower
								+ " and <=" + upper +  " characters");
			String str = l.nextLine();
			int strLen = str.length();
			if (strLen < lower || strLen > upper ){
				continue;
			}
			return str;
		}
	}

	private static String maskCharacter(String a, char b){
		int len = a.length();
		String result = "";
		for (int i = 0; i < len; ++i) {
			char c = a.charAt(i);
			if (c == b) {
				result = result + '$';
			} else {
				result = result + c;
			}
		}
		return result;
	}

	private static String removeCharacter(String a, char b){
		int len = a.length();
		String result = "";
		for (int i = 0; i < len; ++i) {
			char c = a.charAt(i);
			if (c != b) {
				result = result + c;
			}
		}
		return result;
	}

	private static int countKey(String a, char b){
		int len = a.length();
		int count = 0;
		for (int i = 0; i < len; ++i) {
			if (a.charAt(i) == b) {
				count = count + 1;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		char c = getKeyCharacter();
		String s = getString();
		String masked = maskCharacter(s, c);
		String removed = removeCharacter(s, c);
		int count = countKey(s, c);
		System.out.println("String with " +  c + " masked: " + masked);
		System.out.println("String with " +  c + " removed: " + removed);
		System.out.println("# " + c + "s: " +  count);
	}
}

/*Please enter a single character to act as key: 
hj
Please enter a single character to act as key: 
ghj
Please enter a single character to act as key: 
i
Please enter a phrase or sentence >= 4 and <=500 characters
sh
Please enter a phrase or sentence >= 4 and <=500 characters
agh
Please enter a phrase or sentence >= 4 and <=500 characters
this is a very interesting class
String with i masked: th$s $s a very $nterest$ng class
String with i removed: ths s a very nterestng class
# is: 4




second run
Please enter a single character to act as key: 
hj
Please enter a single character to act as key: 
ghj
Please enter a single character to act as key: 
i
Please enter a phrase or sentence >= 4 and <=500 characters
sh
Please enter a phrase or sentence >= 4 and <=500 characters
agh
Please enter a phrase or sentence >= 4 and <=500 characters
this is a very interesting class
String with i masked: th$s $s a very $nterest$ng class
String with i removed: ths s a very nterestng class
# is: 4



third run
Please enter a single character to act as key: 
ok
Please enter a single character to act as key: 
o
Please enter a phrase or sentence >= 4 and <=500 characters
this is my favourite book.
String with o masked: this is my fav$urite b$$k.
String with o removed: this is my favurite bk.
# os: 3



fourth run
Please enter a single character to act as key: 
u
Please enter a phrase or sentence >= 4 and <=500 characters
thi
Please enter a phrase or sentence >= 4 and <=500 characters
This is my university and I love my university.
String with u masked: This is my $niversity and I love my $niversity.
String with u removed: This is my niversity and I love my niversity.
# us: 2


*/