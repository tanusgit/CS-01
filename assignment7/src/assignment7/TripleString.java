package assignment7;
import java.util.Scanner;

//class TripleString
public class TripleString {
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


public class FootHill {
	public static int getBet(){
		while(true){
		Scanner m = new Scanner (System.in);
		System.out.println("How much would you like to bet ( 1- 50)" +
			"or 0 to quit?");
		int pull = m.nextInt();
		System.out.println("whirrrrrr .... and your pull is ... " + pull );
		System.out.println("BAR  BAR  BAR");
		System.out.println("congratulations, you win:  100");
		System.out.println("sorry, you lose.:");
		System.out.println("Thanks for coming to Casino Loceff:");
		if (pull < 0 || pull > 50){
		continue;
		}
	else
		if (pull >= 0 || pull <= 50)
			return pull;
		}
	}
	 public static TripleString pull(){
		 String a = randString();
		 String b = a + randString();
		 String c = b + randString();
		 return c;
		 
		 
	 }
	 
	 public static String randString(){
		 double num1 = Math.random();
		 double num2 = Math.random();
		 
		 
		 
	 }
	 public static int getPayMultiplier(TripleString thePull){
		 int a = 0;
		 return a;
		 
	 }
	 public static void display (TripleString thePull, int winnings ){
		 
	 }

}

   


/*************************************************************

TripleStrings after instantiation ----------
(undefined), (undefined), (undefined)
(undefined), (undefined), (undefined)
hello, Foothill, World
1, 2, 3

TripleStrings after changes ----------
(undefined), (undefined), (undefined)
string one, another string, the third string
Pickles, Foothill College, World
Cherry, 2, 3

Mutator Tests ---------- 

 Correctly rejected blank string

Accessor Tests ---------- 
 TripleString2 String 3: World
 TripleString3 String 2: 2

 ************************************************************/
