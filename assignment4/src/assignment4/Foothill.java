package assignment4;
/*
	My name is Tanusree Debnath. This class is
	CS F001A 02W Object-Oriented Programming Method Java.
	Date is February 4, 2018.
	My instructor is Dave Harden. 
	File name is Foothill.java.
	This program runs as a cash register for a froyo shop. This shop 
	gives the customer a free froyo for each 7 purchases but only one
	froyo can be claimed in a transaction. The customer can buy any number
	of froyos at a time and at each transaction the program will tell the
	customer the amout of stamps collected so far.
*/

import java.util.Scanner;
public class Foothill {
	public static final String Shutdown = "S";
	public static final String Process = "P";
	public static final String yes = "Y";
	public static final String no = "N";

	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Scanner l = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		int totalpurchase = 0;
		while(true) {
			boolean normalbuy = true;
			System.out.println("Menu :");
			System.out.println("P(Process Purchase)");
			System.out.println("S(Shut down)");
			String choice = k.nextLine();
			System.out.println("Your choice:" + choice);
			if (!choice.toUpperCase().startsWith(Process) &&
				!choice.toUpperCase().startsWith(Shutdown)) {
				System.out.println("*** Use P or S, please. ***");
				continue;
			}
			if (choice.toUpperCase().startsWith(Shutdown))
				break;
			if (choice.toUpperCase().startsWith(Process)) {
				if (totalpurchase >= 7) {
					normalbuy = false;
					System.out.println("You qualify for "+ totalpurchase/7
							+" free yogurt."
							+ " Would you like to use your credits?");
					System.out.println("Press Y or N to confirm your choice");
					String newchoice = n.nextLine();
					if (newchoice.equals(no))
						normalbuy = true;
					if (newchoice.equals(yes)){
						totalpurchase = totalpurchase - 7;
						System.out.println("Enjoy your free yogurt!");
						System.out.println("You have " + totalpurchase + 
								" stamps left");

					}
				}
				if (normalbuy) {
					System.out.println("How many yogurts would you like to buy "
							+ "?");
					int userinput = input.nextInt();
					// Don't do anything when userinput <= 0
					if (userinput > 0) {
						totalpurchase = totalpurchase + userinput;
						System.out.println("You have collected " +
								totalpurchase + " stamps");
					}
				}
			}
		}
	}
}

/*
Menu :
P(Process Purchase)
S(Shut down)
P
Your choice:P
How many yogurts would you like to buy ?
10
You have collected 10 stamps
Menu :
P(Process Purchase)
S(Shut down)
post
Your choice:post
You qualify for 1 free yogurt. Would you like to use your credits?
Press Y or N to confirm your choice
N
How many yogurts would you like to buy ?
1
You have collected 11 stamps
Menu :
P(Process Purchase)
S(Shut down)
p
Your choice:p
You qualify for 1 free yogurt. Would you like to use your credits?
Press Y or N to confirm your choice
N
How many yogurts would you like to buy ?
-1
Menu :
P(Process Purchase)
S(Shut down)
P
Your choice:P
You qualify for 1 free yogurt. Would you like to use your credits?
Press Y or N to confirm your choice
Y
Enjoy your free yogurt!
You have 4 stamps left
Menu :
P(Process Purchase)
S(Shut down)
P
Your choice:P
How many yogurts would you like to buy ?
10
You have collected 14 stamps
Menu :
P(Process Purchase)
S(Shut down)
P
Your choice:P
You qualify for 2 free yogurt. Would you like to use your credits?
Press Y or N to confirm your choice
N
How many yogurts would you like to buy ?
10
You have collected 24 stamps
Menu :
P(Process Purchase)
S(Shut down)
P
Your choice:P
You qualify for 3 free yogurt. Would you like to use your credits?
Press Y or N to confirm your choice
Y
Enjoy your free yogurt!
You have 17 stamps left
Menu :
P(Process Purchase)
S(Shut down)
sort
Your choice:sort
*/

