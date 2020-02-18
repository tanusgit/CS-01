package casino;

import java.util.ArrayList;
import java.util.Scanner;

//this program is like a real casino
public class Casino {
	public static void main(String[] args) {
		TripleString m = new TripleString();
		// String s = m.randString();
		// System.out.println(m);
		// TripleString.pull();
		// TripleString.menu();
		// TripleString t = TripleString.pull();
		// TripleString.getPayMultiplier(t);
		while (true) {
			int bet = m.getBet();
			if (bet == 0) {
				System.out.println(TripleString.array);
				System.out.println(TripleString.array1);
				break;
				
			}
			int pay = m.getPayMultiplier(m.pull(), bet);
			if (pay == 0) {
				System.out.println("whiirrrrrr.............");
				System.out.println("Sorry, you lose");
			} else {
				System.out.println("whiirrrrrr.............");
				System.out.println("and you pull is  " + m.pull() + 
						" congratulations, you win: " + pay);
				
			}
		}
	}

}

class TripleString {
	static int pay = 1;
	static String bar = "BAR";
	static String cherries = "cherries";
	static String space = "space";
	static String seven = "7";
	static String string1 = " ";
	static String string2 = " ";
	static String string3 = " ";
	public static final int Max_Len = 50;
	public static final int Min_Len = 1;
	public static final String Stringdefault = "Unknown";
	static Scanner sc = new Scanner(System.in);
	
	static //keep the record of the game transactio
	ArrayList<Transaction> array = new ArrayList<>();
	static ArrayList<Transaction> array1 = new ArrayList<>();
	

	TripleString(String a, String b, String c) {
		String res = " ";
		string1 = setString1(a);
		string2 = setString2(b);
		string3 = setString3(c);
		res = string1 + string2 + string3;

	}

	public TripleString() {
		// TODO Auto-generated constructor stub
	}

	public static void menu() {
		getBet();

	}

	public static int getBet() {
		int bet = 0;
		while (true) {
			System.out.println("How much do you wish to bet 1-50? Press 0 to quit");
			bet = sc.nextInt();
			if (bet > 50) {
				System.out.println("you can not bet more than $50");
				continue;
			}
			/*if (bet == 0) {
				break;
			}*/
			Transaction t = new Transaction("your bet: ", bet);
			array.add(t);
			return bet;
		}
		
	}

	static TripleString pull() {
		String a = randString();
		String b = randString();
		String c = randString();
		TripleString t = new TripleString(a, b, c);
		return t;

	}

	public static String randString() {
		double random = (Math.random()) * 5;
		int random1 = (int) random;

		if (random1 == 1) {
			return bar;
		}
		if (random1 == 2) {
			return seven;
		}
		if (random1 == 3) {
			return cherries;
		}
		if (random1 == 4) {
			return space;
		}
		return cherries;
	}

	public static int getPayMultiplier(TripleString t, int bet) {

		string1 = t.getString1();
		string2 = t.getString2();
		string3 = t.getString3();
		if (string1.equals("cherries") && string2.equals("cherries") && string3.equals("cherries")) {
			pay = bet * 30;

		}
		if (string1.equals("BAR") && string2.equals("BAR") && string3.equals("BAR")) {
			pay = bet * 50;

		}
		if (string1.equals("7") && string2.equals("7") && string3.equals("7")) {
			pay = bet * 100;

		}
		if (string1.equals("cherries") && string2.equals("cherries")) {
			if (string3.equals("7") || string3.equals("BAR")) {
				pay = bet * 15;
			}
		}
		if (string1.equals("cherries")) {
			if (string2.equals("7") || string2.equals("BAR")) {
				{
					if (string2.equals("7") || string2.equals("BAR") || string3.equals("cherries")) {
						pay = bet * 5;

					}
				}
			}
		}
		Transaction t1 = new Transaction("you won", pay);
		array1.add(t1);

		return pay;
	}

	public String getString1() {
		return string1;
	}

	public String getString2() {
		return string2;
	}

	public String getString3() {
		return string3;
	}

	public String setString1(String m) {
		boolean res = validString(m);
		if (res == false) {
			string1 = Stringdefault;
		}

		/*
		 * if(m.length() < Min_Len || m.length() > Max_Len) { string1 = Stringdefault; }
		 */
		else {
			string1 = m;
		}
		return string1;
	}

	public String setString2(String m) {
		boolean res = validString(m);
		if (res == false) {
			string2 = Stringdefault;
		}
		/*
		 * if(m.length() < Min_Len || m.length() > Max_Len) { string2 = Stringdefault; }
		 */
		else {
			string2 = m;
		}
		return string2;
	}

	public String setString3(String m) {
		if (m.length() < Min_Len || m.length() > Max_Len) {
			string3 = Stringdefault;
		} else {
			string3 = m;
		}
		return string3;
	}

	public String toString() {
		String res;
		res = string1 + " " + string2 + " " + string3 ;
		return res;
	}

	public boolean validString(String m) {
		if (m == null || m.length() == 0 || m.length() < Min_Len || m.length() > Max_Len) {
			return false;
		} else {
			return true;
		}
	}

}
