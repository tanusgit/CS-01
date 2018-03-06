package practice5;

import java.util.Scanner;
public class Practicestring {
	public static final int lower = 4;
	public static final int upper = 500;
	public static String getString(){
		while(true){
			Scanner m =new Scanner(System.in);
			System.out.println("Please enter a phrase or"
					+ " sentence more than or equal to" + lower +
					"and less than equal to "+ upper);
			String input = m.nextLine();
			int len = input.length();
			if ( len < 4 || len >500){
				continue;
			}return input;
		}
	}
	public static char getKeycharacter(){
		while(true){
			Scanner n =new Scanner(System.in);
			System.out.println("Please enter a single character");
			String input = n.nextLine();
			int len = input.length();
			if (len != 1)
				continue;
			char c = input.charAt(0);
			return c;
		}
	}
	public static String maskcharacter(String a, char b){
		int len = a.length();
		String result = "";
		for (int i = 0; i < len; i++){
			char c = a.charAt(i);
			if (c != b){
				result = result + c;
			}
			else {
				result = result + "$";
			}
			
		}return result;
		
	}
	public static String removecharacter(String a, char b){
		int len = a.length();
		String result = "";
		for (int i = 0; i < len; i++){
			char c = a.charAt(i);
			if (c != b){
				result = result + c;
			}
			
		}return result;
	}
	public static int count(String a, char b){
		int len = a.length();
		int count = 0;
		for (int i = 0; i < len; i++){
			char c = a.charAt(i);
			if (c == b){
				count = count + 1;
		}
			}return count;
	}
	public static void main(String args[]){
		char c = getKeycharacter();
		String s = getString();
		String masked = maskcharacter(s, c);
		String removed = removecharacter(s, c);
		int count = count(s, c);
		System.out.println("String with" +  c + " masked: " + masked);
		System.out.println("String with" +  c + " removed: " + removed);
		System.out.println("#" + c + "s: " +  count);
		
		
	}
}
