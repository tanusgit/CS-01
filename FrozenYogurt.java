package Foothill;

import java.util.Scanner;

public class FrozenYogurt {
	public static void main(String[] args) {
		
		FrozenYogurt m = new FrozenYogurt();
		m.menu();
		
		
	}
	private final int freeStamps = 7;
	Scanner m = new Scanner(System.in);
	int total =0;
	
	public void totalstamps() {
		//mistake
		if (total > 7) {
			System.out.println("you earned a free yogurt");
			System.out.println("Do you wish to use it? press Y or N");	
			String input = m.next();
			if(input.equalsIgnoreCase("y")) {
				total = total - 7;
				System.out.println("you have " + total + " stamps left");
			}else if (input.equalsIgnoreCase("n")) {
				normalPurchase();
			}
		}
		/*else
			System.out.println("you have earned " + i + " free stamps"); */
		
	}

	public void normalPurchase() {
		System.out.print("How many yogurts do you want to buy?");
		int  input= m.nextInt();
		//mistake
		total = total + input;
		System.out.print("you earned " + total +" stamps ");
		totalstamps();
		
	}
		
	public void menu()	{
		while(true) {
		System.out.print("p: process\n" + "s: shutdown ");
		//mistake
		String res = m.next();
		if(res.equalsIgnoreCase("p")) {
			normalPurchase();
		}
		else
			return;
	}
}
		
		
		
}




