import java.util.Scanner;
/*
My name is Tanusree Debnath. This class is
CS F001A 02W Object-Oriented Programming Method Java.
Date is 25th February, 2018.
My instructor is Dave Harden. 
File name is Foothill.java. This program has a class called Foothill
which simulates a Casino slot playing machine, it uses the TripleString
class as helper from the previous assignment. The player can win
anywhere from 0 to 100 times original bet but the bet should be
between 0 and 50. Entering 0 exits out of the game.
*/

public class Foothill {
	// Probabilities of different choices
	private static final double BAR_PROB = 0.38;
	private static final double CHERRIES_PROB = 0.40;
	private static final double SPACE_PROB = 0.07;
	private static final double SEVEN_PROB = 0.15;
	private static final String BAR = "BAR";
	private static final String CHERRIES = "cherries";
	private static final String SPACE = "space";
	private static final String SEVEN = "7";

	public static void main(String args[]) {
		while (true) {
			int bet = getBet();
			if (bet == 0)
				break;
			System.out.println("whirrrrrr .... and your pull is ...");
			TripleString pullString = pull();
			System.out.println(pullString);
			int pm = getPayMultiplier(pullString);
			display(pullString, pm*bet);
		}
		System.out.println("Thanks for coming to Casino Loceff:");
	}
	// Gets the bet from the user and returns it to main
	public static int getBet() {
		Scanner m = new Scanner (System.in);
		while(true) {
			System.out.println("How much would you like to bet (1- 50)" +
				"or 0 to quit?");
			int pull = m.nextInt();
			if (pull < 0 || pull > 50) {
				continue;
			}
			return pull;
		}
	}

	// Simulate a random pull of the slot machine
	public static TripleString pull() {
		String a = randString();
		String b = randString();
		String c = randString();
		TripleString ts = new TripleString(a, b, c);
		return ts;
	 }

	// Return a random string based on the probabilities.
	public static String randString() {
		double rnd = Math.random();
		//System.out.println("random#"+rnd + " BP:" + BAR_PROB + " CP:"
		//		+ CHERRIES_PROB + " SP:"
		//		+ SPACE_PROB + " SP:" + SEVEN_PROB);
		int scaledVal = (int) (rnd*1000);
		//System.out.println("random#"+scaledVal);
		if (scaledVal <= BAR_PROB*1000)
			return BAR;
		if (scaledVal > BAR_PROB*1000 && scaledVal <= CHERRIES_PROB*1000)
			return CHERRIES;
		if (scaledVal > CHERRIES_PROB*1000 && scaledVal <= SPACE_PROB*1000)
			return SPACE;
		if (scaledVal > SPACE_PROB*1000 && scaledVal <= SEVEN_PROB*1000)
			return SEVEN;
		return "";
	}

	// Takes the pullString as a parameter, and inspects it to determine
	// what its pay multiplier should be:  0, 5, 15, 30, 50 or 100
    // cherries  [not cherries]  [any] pays 5 × bet (5 times the bet)
    // cherries  cherries  [not cherries] pays 15 × bet
    // cherries  cherries  cherries pays 30 × bet
    // BAR  BAR  BAR pays 50 × bet
    // 7  7  7 pays 100 × bet
	public static int getPayMultiplier(TripleString thePull) {
		if (thePull.getString1() == CHERRIES) {
			if (thePull.getString2() == CHERRIES) {
				if (thePull.getString3() == CHERRIES) {
					return 30;
				}
				return 15;
			}
			return 5;
		}

		if (thePull.getString1() == BAR &&
			thePull.getString2() == BAR && 
			thePull.getString3() == BAR)
			return 50;

		if (thePull.getString1() == SEVEN &&
				thePull.getString2() == SEVEN && 
				thePull.getString3() == SEVEN)
				return 100;

		return 0;
	}
	// Display result of the pull.
	public static void display(TripleString thePull, int winnings) {
		if (winnings == 0) {
			System.out.println("Sorry, you lose.");
		} else {
			System.out.println("congratulations, you win:" + winnings);
		}
	}
}


//class TripleString

class TripleString {
private String string1, string2, string3;
public static final int MAX_LEN = 50;
public static final int MIN_LEN = 1;
public static final String DEFAULT_STRING = "(undefined)";

// constructors
TripleString()
{
   string1 = DEFAULT_STRING;
   string2 = DEFAULT_STRING;
   string3 = DEFAULT_STRING;
}

TripleString(String string1, String string2, String string3)
{
   if ( ! setString1(string1) )
      string1 = DEFAULT_STRING;
   if ( ! setString2(string2) )
      string2 = DEFAULT_STRING;
   if ( ! setString3(string3) )
      string3 = DEFAULT_STRING;
}

// mutators
public boolean setString1(String str)
{
   if ( !validString(str) )
      return false;
   string1 = str;
   return true;
}

public boolean setString2(String str)
{
   if ( !validString(str) )
      return false;
   string2 = str;
   return true;
}

public boolean setString3(String str)
{
   if ( !validString(str) )
      return false;
   string3 = str;
   return true;
}

// accessors
public String getString1() { return string1; }
public String getString2() { return string2; }
public String getString3() { return string3; }

// notice that because validString does not make use of instance data
// it should be declared static
private static boolean validString( String str )
{
   if (str == null)
      return false;
   if (str.length() > MAX_LEN || str.length() < MIN_LEN )
      return false;
   return true;
}

public String toString()
{
   String retVal;
   retVal = string1 + ", " + string2 + ", " + string3;
   return retVal;
}
}

/*
How much would you like to bet (1- 50)or 0 to quit?
10
whirrrrrr .... and your pull is ...
BAR, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
50
whirrrrrr .... and your pull is ...
BAR, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
20
whirrrrrr .... and your pull is ...
null, BAR, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
9
whirrrrrr .... and your pull is ...
null, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
7
whirrrrrr .... and your pull is ...
null, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
5
whirrrrrr .... and your pull is ...
BAR, cherries, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
1000
How much would you like to bet (1- 50)or 0 to quit?
20
whirrrrrr .... and your pull is ...
null, BAR, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
-1
How much would you like to bet (1- 50)or 0 to quit?
21
whirrrrrr .... and your pull is ...
BAR, BAR, BAR
congratulations, you win:1050
How much would you like to bet (1- 50)or 0 to quit?
31
whirrrrrr .... and your pull is ...
BAR, BAR, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
32
whirrrrrr .... and your pull is ...
null, BAR, BAR
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
42
whirrrrrr .... and your pull is ...
BAR, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
52
How much would you like to bet (1- 50)or 0 to quit?
49
whirrrrrr .... and your pull is ...
null, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
24
whirrrrrr .... and your pull is ...
null, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
23
whirrrrrr .... and your pull is ...
null, BAR, BAR
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
26
whirrrrrr .... and your pull is ...
BAR, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
33
whirrrrrr .... and your pull is ...
null, null, BAR
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
31
whirrrrrr .... and your pull is ...
BAR, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
19
whirrrrrr .... and your pull is ...
null, BAR, BAR
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
17
whirrrrrr .... and your pull is ...
null, BAR, BAR
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
28
whirrrrrr .... and your pull is ...
BAR, null, null
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
27
whirrrrrr .... and your pull is ...
null, BAR, BAR
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
3
whirrrrrr .... and your pull is ...
null, null, BAR
Sorry, you lose.
How much would you like to bet (1- 50)or 0 to quit?
1
whirrrrrr .... and your pull is ...
BAR, BAR, BAR
congratulations, you win:50
How much would you like to bet (1- 50)or 0 to quit?
0
Thanks for coming to Casino Loceff:
*/