package linklist;

public class TripleString {
public static  String string1;
public static String string2;
public static String string3;
public static final int Max_Len = 50;
public static final int Min_Len = 5;
public static final String Stringdefault = "Unknown"; 

TripleString(){
	string1 = Stringdefault;
	string2 = Stringdefault;
	string3 = Stringdefault;
}

TripleString(String a, String b, String c){
	string1 = setString1(a);
	string2 = setString2(b);
	string3 = setString3(c);
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
	if(res == false) {
		string1 = Stringdefault;
	}
	
	/*if(m.length() < Min_Len || m.length() > Max_Len) {
		string1 = Stringdefault;
	}
	*/
	else {
		string1 = m;
	}
	return string1;
}

public String setString2(String m) {
	boolean res = validString(m);
	if(res == false) {
		string2 = Stringdefault;
	}
	/*if(m.length() < Min_Len || m.length() > Max_Len) {
		string2 = Stringdefault;
	}*/
	else {
		string2 = m;
	}
	return string2;
}

public String setString3(String m) {
	if(m.length() < Min_Len || m.length() > Max_Len) {
		string3 = Stringdefault;
	}
	else {
		string3 = m;
	}
	return string3;
}


public String toString() {
	String res;
	 res = string1 + " " + string2 + " " + string3;
	 return res;
}

public boolean validString( String m ) {
	if (m == null || m.length() == 0 || m.length() < Min_Len || m.length() > Max_Len) {
		return false;
	}
	else {
		return true;
	}
}




}
/* This program has a class called TripleString
having three strings and their minimum and maximum length. The class has
two constructors one default and another which takes three strings as input.
It provides accessors and mutators for each string separately.


public class Foothill {
	public static void main(String args[]) {
		// All strings are within limits
		TripleString ts1 = new TripleString("cat", "cate", "catering");
		// Default constructor
		TripleString ts2 = new TripleString();
		// One Empty string
		TripleString ts3 = new TripleString("", "mouse", "dog");
		// One long string, other within limits
		TripleString ts4 = new TripleString("a really "
				+ "loooooooooooooooooooooooooooooooooooong string",
				"cat", "dog");
		// Display all the strings
		System.out.println("Content of each TripleString objects:");
		System.out.println("ts1:\t" + ts1.toString());
		System.out.println("ts2:\t" + ts2.toString());
		System.out.println("ts3:\t" + ts3.toString());
		System.out.println("ts4:\t" + ts4.toString());
		// Changing a few of them
		ts2.setString1("monkey");
		ts4.setString1("a short string");
		ts3.setString3("");
		// Display all the strings
		System.out.println("\nNew contents of each TripleString objects:");
		System.out.println("ts1:\t" + ts1.toString());
		System.out.println("ts2:\t" + ts2.toString());
		System.out.println("ts3:\t" + ts3.toString());
		System.out.println("ts4:\t" + ts4.toString());
		System.out.println("\nTesting mutators");
		if (ts1.setString1("")) {
			System.out.println("ts1::string1: set to empty");
		} else {
			System.out.println("ts1::string1: Cannot set invalid string");			
		}
		if (ts2.setString1("new monkey")) {
			System.out.println("ts2::string1: set to new monkey");
		} else {
			System.out.println("ts2::string1: Cannot set invalid string");			
		}
		System.out.println("\nTesting accessors");
		System.out.println("ts1::string1: " + ts1.getString1());
		System.out.println("ts2::string1: " + ts2.getString1());
	}
}

class TripleString {
	private String string1;
	private String string2;
	private String string3;

    public static final int MIN_LEN = 1;
    public static final int MAX_LEN = 50;
    public static final String DEFAULT_STRING = "(undefined)";
    // Default constructors, set all strings to DEFAULT_STRING
    public TripleString() {
       	string1 = DEFAULT_STRING;
    	string2 = DEFAULT_STRING;
    	string3 = DEFAULT_STRING;   	
    }
    // Constructor, assign strings if they are valid otherwise set to default
    public TripleString(String str1, String str2, String str3) {
    	if (!setString1(str1))
    		string1 = DEFAULT_STRING;
    	if (!setString2(str2))
    		string2 = DEFAULT_STRING;
    	if (!setString3(str3))
    		string3 = DEFAULT_STRING;
    }
    // Checks if the string is of valid length 
    private boolean validString(String s) {
    	if (s.length() < MIN_LEN || s.length() > MAX_LEN)
    		return false;
    	else
    		return true;
    }
    // Assigns string1 to s if it is valid and returns true, otherwise returns
    // false
    public boolean setString1(String s) {
    	if (validString(s)) {
    		string1 = s;
    		return true;
    	}
    	else
    		return false;
    }
    // Assigns string2 to s if it is valid and returns true, otherwise returns
    // false
    public boolean setString2(String s) {
    	if (validString(s)) {
    		string2 = s;
    		return true;
    	}
    	else
    		return false;
    }
    // Assigns string3 to s if it is valid and returns true, otherwise returns
    // false
    public boolean setString3(String s) {
    	if (validString(s)) {
    		string3 = s;
    		return true;
    	}
    	else
    		return false;
    }
    // Return string1
    public String getString1() {
    	return string1;
    }
    // Return string2
    public String getString2() {
    	return string2;
    }
    // Return string3
    public String getString3() {
    	return string3;
    }
    // Prints all the members
    public String toString() {
    	String s = "string1: " + string1 + ", ";
    	s = s + "string2: " + string2 + ", ";
    	s = s + "string3: " + string3 + ", ";
    	s = s + "MIN_LEN: " + MIN_LEN + ", ";
    	s = s + "MAX_LEN: " + MAX_LEN + ", ";
    	s = s + "DEFAULT_STRING: " + "(undefined)" + ", ";
    	return s;
    }
}

/*
Content of each TripleString objects:
ts1:	string1: cat, string2: cate, string3: catering, MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 
ts2:	string1: (undefined), string2: (undefined), string3: (undefined), MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 
ts3:	string1: (undefined), string2: mouse, string3: dog, MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 
ts4:	string1: (undefined), string2: cat, string3: dog, MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 

Content of each TripleString objects:
ts1:	string1: cat, string2: cate, string3: catering, MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 
ts2:	string1: monkey, string2: (undefined), string3: (undefined), MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 
ts3:	string1: (undefined), string2: mouse, string3: dog, MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 
ts4:	string1: a short string, string2: cat, string3: dog, MIN_LEN: 1, MAX_LEN: 50, DEFAULT_STRING: (undefined), 

Testing mutators
ts1::string1: Cannot set invalid string
ts2::string1: set to new monkey

Testing accessors
ts1::string1: cat
ts2::string1: new monkey
*/
*/
