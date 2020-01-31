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
